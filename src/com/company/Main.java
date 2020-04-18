package com.company;

import java.util.Date;
import java.util.Scanner;
import java.sql.*;
import java.util.List;

public class Main {
    public static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/java_base";
    public static final String USER = "postgres";
    public static final String PASS = "13Hockey1309";

    public static void main(String[] args) throws SQLException {
        // showAll();
        //  Flight flight1 = Flight.createItemForSaving(,1,2,2);
        //AirplanesConnector.add(airplanes1);
        // showAll();
        // System.out.println(CitiesConnector.getById(2));
//         showAll();
//        Flight flight=FlightConnector.getById(4);
//        flight.setDay(2020-09-12);
//        flight.setDateTime(16-30-00);
//        FlightConnector.update(flight);
//        //FlightConnector.deleteById(5);
//         showAll();
//         }


        Scanner scan = new Scanner(System.in);
        while (true) {
            MenuWorker.showMenu();

            String w = String.valueOf(scan.nextLine());

                if (w == "a") {
                    MenuWorker.menu1();
                }
                if (w == "b") {
                    MenuWorker.menu5();
                }
                if (w == "c") {
                    MenuWorker.menu2();
                }
                if (w == "d") {
                    MenuWorker.menu3();
                }
                if (w == "e") {
                    MenuWorker.menu4();
                }

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
                    System.out.println("Введите индекс:");
                    int x = Integer.valueOf(scan.nextLine());
                    System.out.println(CitiesConnector.getById(x));
                    break;

                case (6):
                    System.out.println("Введите индекс:");
                    int c = Integer.valueOf(scan.nextLine());
                    System.out.println(AirplanesConnector.getById(c));
                    break;

                case (7):
                    System.out.println("Введите индекс:");
                    int z = Integer.valueOf(scan.nextLine());
                    System.out.println(FlightConnector.getById(z));
                    break;

                case (8):
                    System.out.println("Введиде город:");
                    String name = String.valueOf(scan.nextLine());
                    Cities cities1 = Cities.createItemForSaving(name);
                    CitiesConnector.add(cities1);
                    break;
                case (9):
                    System.out.println("Введиде модель:");
                    String model = String.valueOf(scan.nextLine());
                    Airplanes airplanes1 = Airplanes.createItemForSaving(model);
                    AirplanesConnector.add(airplanes1);
                    break;
                case (10):
                    System.out.println("Введиде день:");
                    Date d = java.sql.Date.valueOf(scan.nextLine());
                    System.out.println("Введиде время:");
                    Time t = java.sql.Time.valueOf(scan.nextLine());
                    System.out.println("Введиде номер:");
                    int from = Integer.valueOf(scan.nextLine());
                    System.out.println("Введиде номер:");
                    int to = Integer.valueOf(scan.nextLine());
                    System.out.println("Введиде номер:");
                    int air = Integer.valueOf(scan.nextLine());
                    Flight flight1 = Flight.createItemForSaving(d, t, from, to, air);

                    FlightConnector.add(flight1);
                    break;


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
                    Cities cities = CitiesConnector.getById(idn);
                    System.out.println("Введиде город ");
                    String nameUp = String.valueOf(scan.nextLine());
                    cities.setName(nameUp);
                    CitiesConnector.update(cities);
                    break;

                case (15):
                    System.out.println("Введиде индекс ");
                    int idm = Integer.valueOf(scan.nextLine());
                    Airplanes airplanes = AirplanesConnector.getById(idm);
                    System.out.println("Введиде модель ");
                    String modelUp = String.valueOf(scan.nextLine());
                    airplanes.setModel(modelUp);
                    AirplanesConnector.update(airplanes);
                    break;
                case (16):
                    System.out.println("Введиде индекс ");
                    int idf = Integer.valueOf(scan.nextLine());
                    Flight flight = FlightConnector.getById(idf);
                    System.out.println("Введиде день ");
                    Date dayUp = java.sql.Date.valueOf(scan.nextLine());
                    System.out.println("Введиде время:");
                    Time timeUp = java.sql.Time.valueOf(scan.nextLine());
                    System.out.println("Введиде номер:");
                    int fromUp = Integer.valueOf(scan.nextLine());
                    System.out.println("Введиде номер:");
                    int toUp = Integer.valueOf(scan.nextLine());
                    System.out.println("Введиде номер:");
                    int airUp = Integer.valueOf(scan.nextLine());
                    flight.setDay(dayUp);
                    flight.setDateTime(timeUp);
                    flight.setCityFromId(fromUp);
                    flight.setCityToId(toUp);
                    flight.setAirplaneId(airUp);
                    FlightConnector.update(flight);
                    break;
            }
        }
    }
}