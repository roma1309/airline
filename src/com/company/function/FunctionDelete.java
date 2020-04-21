package com.company.function;

import com.company.db.AirplanesConnector;
import com.company.db.CitiesConnector;
import com.company.db.FlightConnector;

import java.sql.SQLException;
import java.util.Scanner;

public class FunctionDelete {
    public static void delete() throws SQLException {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.valueOf(scan.nextLine());
        switch (n1) {
            case (1):
                System.out.println("Введите индекс ");
                int idC = Integer.valueOf(scan.nextLine());
                CitiesConnector.deleteById(idC);
                break;
            case (2):
                System.out.println("Введите индекс ");
                int id = Integer.valueOf(scan.nextLine());
                AirplanesConnector.deleteById(id);
                break;

            case (3):
                System.out.println("Введите индекс ");
                int idF = Integer.valueOf(scan.nextLine());
                FlightConnector.deleteById(idF);
                break;

        }
    }
}
