package com.company;

import java.util.Scanner;

public class MenuWorker {
    public static void showMenu() {

        System.out.println("Выбор действия:");
        System.out.println("1. Показать всех");
        System.out.println("2. Показать по ID");
        System.out.println("3. Добавить");
        System.out.println("4. Удалить");
        System.out.println("5. Обновить");
        System.out.println("0. Выход");
        System.out.println("-------------");
        System.out.println("-------------");
    }

    public static void menu1() {

        System.out.println("1. Вывести таблицу Cities");
        System.out.println("2. Вывести таблицу Airplanes");
        System.out.println("3. Вывести  таблицу Flight");
        System.out.println("4. Вывести общую таблицу.");
    }

    public static void menu2() {
        System.out.println("1.  Добавить элемент в таблицу CITIES");
        System.out.println("2.  Добавить элемент в таблицу AIRPLANE");
        System.out.println("3.  Добавить элемент в таблицу Flight");
    }

    public static void menu3() {
        System.out.println("1.  Удалить элемент в таблице CITIES");
        System.out.println("2.  Удалить элемент в таблице AIRPLANES");
        System.out.println("3.  Удалить элемент в таблице FLIGHT");
    }

    public static void menu4() {
        System.out.println("1.  Редактирова  таблицу CITIES");
        System.out.println("2.  Редактирова  таблицу AIRPLANES");
        System.out.println("3.Редактировать таблицу FLIGHT");
    }

    public static void menu5() {
        System.out.println("1. Выбрать элементы из таблицы Cities по ID");
        System.out.println("2. Выбрать элементы из таблицы Airplanes по ID");
        System.out.println("3. Выбрать элементы из таблицы Flight по ID");
    }

    public static void menu6() {
        System.out.println("Спасибо за работу)))");
    }

}



