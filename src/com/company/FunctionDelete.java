package com.company;

import java.sql.SQLException;
import java.util.Scanner;

public class FunctionDelete {
    public static void Delete() throws SQLException {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.valueOf(scan.nextLine());
        switch (n1) {
            case (1):
                System.out.println("Введиде индекс ");
                int idC = Integer.valueOf(scan.nextLine());
                CitiesConnector.deleteById(idC);
                break;
            case (2):
                System.out.println("Введиде индекс ");
                int id = Integer.valueOf(scan.nextLine());
                AirplanesConnector.deleteById(id);
                break;

            case (3):
                System.out.println("Введиде индекс ");
                int idF = Integer.valueOf(scan.nextLine());
                FlightConnector.deleteById(idF);
                break;

        }
    }
}
