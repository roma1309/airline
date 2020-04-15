package com.company;

import java.util.Scanner;
import java.sql.*;
import java.util.List;

public class Main {
    public static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/java_base";
    public static final String USER = "postgres";
    public static final String PASS = "13Hockey1309";

    public static void main(String[] args) throws SQLException {
        // showAll();
        //Flight flight1 = Flight.createItemForSaving(,1,2,2);
        //AirplanesConnector.add(airplanes1);
        // showAll();
        // System.out.println(CitiesConnector.getById(2));
        //  showAll();
        // Airplanes airplanes=AirplanesConnector.getById(4);
        //airplanes.setModel("Осло");
        //AirplanesConnector.update(airplanes);
        //FlightConnector.deleteById(5);
        // showAll();
        // }

        //  public static void showAll() throws SQLException {

        //    List<Flight> result = FlightConnector.getAll();
        //  for (Flight flight: result) {

        //    System.out.println(flight);

        //}
        // System.out.println("----------");
        //}
        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("Выбор действия:\n" +

                    "1. Вывести таблицу Cities.\n" +

                    "2. Вывести таблицу Airplanes.\n" +

                    "3. Вывести  таблицу Flight.\n" +
                    "4. Вывести общую таблицу.\n" +
                    "5. Выбрать элементы из таблицы Cities по ID.\n" +
                    "6. Выбрать элементы из таблицы Airplanes по ID.\n" +
                    "7. Выбрать элементы из таблицы Flight по ID.\n" +
                    // "7. Выбрать элементы из таблицы Flight по ID.\n"+
                    "8.  Добавить элемент в таблицу CITIES.\n" +
                    "9.  Добавить элемент в таблицу AIRPLANE.\n" +
                    // "10.  Добавить элемент в таблицу Flight.\n"+
                    "11.  Удалить элемент в таблице CITIES.\n" +
                    "12.  Удалить элемент в таблице AIRPLANES.\n" +
                    "13.  Удалить элемент в таблице FLIGHT.\n" +
                   "14.  Редактирова  таблицу CITIES.\n" +
                    "15.  Редактирова  таблицу AIRPLANES.\n" +



                    "Ваш выбор:");


            int n = Integer.valueOf(scan.nextLine());
            switch (n) {
                case (1):

                    List<Cities> result = CitiesConnector.getAll();
                    for (Cities cities : result) {

                        System.out.println(cities);

                    }
                    break;
                case (2):
                    List<Airplanes> result1 = AirplanesConnector.getAll();
                    for (Airplanes airplanes : result1) {

                        System.out.println(airplanes);

                    }
                    break;
                case (3):
                    List<Flight> result2 = FlightConnector.getAll();
                    for (Flight flight : result2) {

                        System.out.println(flight);

                    }
                    break;
                case (4):
                    List<Flight> result3 = FullInfoConnector.getAll();

                    for (Flight flight : result3) {

                        System.out.println(flight);

                    }
                    break;
                case (5):
                    int x = Integer.valueOf(scan.nextLine());
                    System.out.println(CitiesConnector.getById(x));
                    break;

                case (6):
                    int c = Integer.valueOf(scan.nextLine());
                    System.out.println(AirplanesConnector.getById(c));
                    break;

                case (7):
                    int z = Integer.valueOf(scan.nextLine());
                    System.out.println(FlightConnector.getById(z));
                    break;
                // case(8):
                //   int v = Integer.valueOf(scan.nextLine());
                // System.out.println(FullInfoConnector.getById(v));
                // break;
                case (8):
                    System.out.println("Введиде город");
                    String name = String.valueOf(scan.nextLine());
                    Cities cities1 = Cities.createItemForSaving(name);
                    CitiesConnector.add(cities1);
                    break;
                case (9):
                    System.out.println("Введиде модель");
                    String model = String.valueOf(scan.nextLine());
                    Airplanes airplanes1 = Airplanes.createItemForSaving(model);
                    AirplanesConnector.add(airplanes1);
                    break;
                // case(10):
                // System.out.println("Введиде модель");
                // String  = String.valueOf(scan.nextLine());
                // Airplanes airplanes1 = Airplanes.createItemForSaving(model);
                // AirplanesConnector.add(airplanes1);
                // break;
                //  }
                case (11):
                    System.out.println("Введиде индекс ");
                    int idC = Integer.valueOf(scan.nextLine());
                    CitiesConnector.deleteById(idC);
                    break;
                case (12):
                    System.out.println("Введиде индекс ");
                    int id = Integer.valueOf(scan.nextLine());
                    AirplanesConnector.deleteById(id);
                   break;

                case (13):
                    System.out.println("Введиде индекс ");
                    int idF = Integer.valueOf(scan.nextLine());
                    FlightConnector.deleteById(idF);
                    break;
                case (14):
                    System.out.println("Введиде индекс ");
                    int idn = Integer.valueOf(scan.nextLine());
                    Cities cities=CitiesConnector.getById(idn);
                    System.out.println("Введиде город ");
                    String nameUp = String.valueOf(scan.nextLine());
                    cities.setName(nameUp);
                    CitiesConnector.update(cities);
                    break;
                case (15):
                    System.out.println("Введиде индекс ");
                    int idm = Integer.valueOf(scan.nextLine());
                    Airplanes airplanes=AirplanesConnector.getById(idm);
                    System.out.println("Введиде модель ");
                    String modelUp = String.valueOf(scan.nextLine());
                    airplanes.setModel(modelUp);
                    AirplanesConnector.update(airplanes);
                    break;
            }
        }
    }
}