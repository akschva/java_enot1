package ru.stqa.ent.sandbox;

public class Primes {

  public static boolean isPrime(int n) {
    // цикл для проверки, является ли чисто n простым - те можно ли разделить его на что-то кроме 1 и себя - делить от 2 до n-1
    // цикл for имеет обычно переменную-счетчик, она состоит из инициализации, завершения и каждой итерации счетчика в цикле
    for (int i = 2; i < n; i += 1) { // было i = i + 1, еще можно i++ если прибавляем единицу. Увеличение переменной на единицу - инкримент
      // в скобках операция получения остатка от деления, если n делится без остатка на i
      if (n % i == 0) {
        return false; // досрочное окончание цикла и выход из ф-ции
      }
    }
    // если цикл дошел до конца и так ничего и не нашел, значит число простое
    return true;
  }

  public static boolean isPrimeWhile(int n) {
    int i = 2; // инициализация тут
    while (i < n) { //разнесли выше и ниже кусочки переменной функции for - проверка тут
      if (n % i == 0) {
        return false;
      }
      i++; // прибавление тут
    }
    return true;
  }

  // Можно проверку if добавить к while
  public static boolean isPrimeWhile2(int n) {
    int i = 2;
    while (i < n && n % i != 0) {
      i++; 
    }
    return i == n; //если равно, то это простое число, а если не равно, то цикл закончится раньше
  }


}
