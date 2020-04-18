package com.company;

import java.util.Scanner;

public class MenuWorker {
    public static void showMenu() {

        System.out.println("Выбор действия:");
        System.out.println("a) Показать всех");
        System.out.println("b) Показать по ID");
        System.out.println("c) Добавить");
        System.out.println("d) Удалить");
        System.out.println("e) Обновить");
        System.out.println("f) Выход");
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
        System.out.println("8.  Добавить элемент в таблицу CITIES");
        System.out.println("9.  Добавить элемент в таблицу AIRPLANE");
        System.out.println("10.  Добавить элемент в таблицу Flight");
    }

    public static void menu3() {
        System.out.println("11.  Удалить элемент в таблице CITIES");
        System.out.println("12.  Удалить элемент в таблице AIRPLANES");
        System.out.println("13.  Удалить элемент в таблице FLIGHT");
    }

    public static void menu4() {
        System.out.println("14.  Редактирова  таблицу CITIES");
        System.out.println("15.  Редактирова  таблицу AIRPLANES");
        System.out.println("16.Редактировать таблицу FLIGHT");
    }

    public static void menu5() {
        System.out.println("5. Выбрать элементы из таблицы Cities по ID");
        System.out.println("6. Выбрать элементы из таблицы Airplanes по ID");
        System.out.println("7. Выбрать элементы из таблицы Flight по ID");
    }


}



