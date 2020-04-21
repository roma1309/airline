package com.company.function;

import com.company.db.AirplanesConnector;
import com.company.db.CitiesConnector;
import com.company.db.FlightConnector;

import java.sql.SQLException;
import java.util.Scanner;

public class FunctionById {
    public  static  void byId() throws SQLException {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.valueOf(scan.nextLine());
        switch (n1) {
            case (1):
                System.out.println("Введите индекс:");
                int x = Integer.valueOf(scan.nextLine());
                System.out.println(CitiesConnector.getById(x));
                break;

            case (2):
                System.out.println("Введите индекс:");
                int c =Integer.valueOf( scan.nextLine());
                System.out.println(AirplanesConnector.getById(c));
                break;

            case (3):
                System.out.println("Введите индекс:");
                int z = Integer.valueOf(scan.nextLine());
                System.out.println(FlightConnector.getById(z));
                break;
        }
    }
}
