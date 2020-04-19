package com.company;

import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class FunctionAdd {
    public static void Add() throws SQLException {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.valueOf(scan.nextLine());
        switch (n1) {
            case (1):
                System.out.println("Введите город:");
                String name = scan.nextLine();
                Cities cities1 = Cities.createItemForSaving(name);
                CitiesConnector.add(cities1);
                break;
            case (2):
                System.out.println("Введите модель:");
                String model = scan.nextLine();
                Airplanes airplanes1 = Airplanes.createItemForSaving(model);
                AirplanesConnector.add(airplanes1);
                break;
            case (3):
                System.out.println("Введите день:");
                Date d = java.sql.Date.valueOf(scan.nextLine());
                System.out.println("Введите время:");
                Time t = java.sql.Time.valueOf(scan.nextLine());
                System.out.println("Введите номер:");
                int from = Integer.valueOf(scan.nextLine());
                System.out.println("Введите номер:");
                int to = Integer.valueOf(scan.nextLine());
                System.out.println("Введите номер:");
                int air = Integer.valueOf(scan.nextLine());
                Flight flight1 = Flight.createItemForSaving(d, t, from, to, air);

                FlightConnector.add(flight1);
                break;
        }
    }
}
