package ru.stqa.ent.mantis.appmanager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.NameValuePair;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.impl.client.LaxRedirectStrategy;


public class HttpSession {
  private CloseableHttpClient httpclient;
  private ApplicationManager app;

  public HttpSession(ApplicationManager app) {
    this.app = app;
    httpclient = HttpClients.custom().setRedirectStrategy(new LaxRedirectStrategy()).build();
  }

  public boolean login(String username, String password) throws IOException {
    HttpPost post = new HttpPost(app.getProperty("web.baseUrl") + "/login.php"); /* запрос типа POST */
    List<NameValuePair> params = new ArrayList<>(); /* набор параметров */
    params.add(new BasicNameValuePair("username", username)); /* набор параметров */
    params.add(new BasicNameValuePair("password", password)); /* набор параметров */
    params.add(new BasicNameValuePair("secure_session", "on")); /* набор параметров */
    params.add(new BasicNameValuePair("return", "index.php")); /* набор параметров */
    post.setEntity(new UrlEncodedFormEntity(params)); /* упаковка параметров и размещение в заранее созданный запрос */
    CloseableHttpResponse response = httpclient.execute(post); /* отправка запроса, результатом будет ответ - response */
    String body = getTextFrom(response);
    /* проверка, действительно ли польз-ль вошел, и код страницы содержит его имя, из исходного кода страницы */
    return body.contains(String.format(username));
  }

  /* вспомогательная фнукция для получения текста ответа - код на языке html*/
  private String getTextFrom(CloseableHttpResponse response) throws IOException {
    try {
      return EntityUtils.toString(response.getEntity());
    } finally {
      response.close();
    }
  }

  /* функция проверки под каким польз-лем залогинена сессия, с запросом типа GET, он без параметров */
  public boolean isLoggedInAs(String username) throws IOException {
    HttpGet get = new HttpGet(app.getProperty("web.baseUrl") + "/index.php");
    CloseableHttpResponse response = httpclient.execute(get);
    String body = getTextFrom(response);
    return body.contains(String.format(username));
  }

}
