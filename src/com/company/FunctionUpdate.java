package com.company;

import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class FunctionUpdate {
    public  static void Update() throws SQLException {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.valueOf(scan.nextLine());
        switch (n1) {
            case (1):
                System.out.println("Введиде индекс ");
                int idn = Integer.valueOf(scan.nextLine());
                Cities cities = CitiesConnector.getById(idn);
                System.out.println("Введиде город ");
                String nameUp = scan.nextLine();
                cities.setName(nameUp);
                CitiesConnector.update(cities);
                break;

            case (2):
                System.out.println("Введиде индекс ");
                int idm = Integer.valueOf(scan.nextLine());
                Airplanes airplanes = AirplanesConnector.getById(idm);
                System.out.println("Введиде модель ");
                String modelUp = scan.nextLine();
                airplanes.setModel(modelUp);
                AirplanesConnector.update(airplanes);
                break;
            case (3):
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
