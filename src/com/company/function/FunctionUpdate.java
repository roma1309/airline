package com.company.function;

import com.company.db.AirplanesConnector;
import com.company.db.CitiesConnector;
import com.company.db.FlightConnector;
import com.company.entity.Airplanes;
import com.company.entity.Cities;
import com.company.entity.Flight;

import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class FunctionUpdate {
    public  static void update() throws SQLException {
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
                System.out.println("Введите индекс ");
                int idm = Integer.valueOf(scan.nextLine());
                Airplanes airplanes = AirplanesConnector.getById(idm);
                System.out.println("Введите модель ");
                String modelUp = scan.nextLine();
                airplanes.setModel(modelUp);
                AirplanesConnector.update(airplanes);
                break;
            case (3):
                System.out.println("Введите индекс ");
                int idf = Integer.valueOf(scan.nextLine());
                Flight flight = FlightConnector.getById(idf);
                System.out.println("Введите день ");
                Date dayUp = java.sql.Date.valueOf(scan.nextLine());
                flight.setDay(dayUp);
                System.out.println("Введите время:");
                Time timeUp = java.sql.Time.valueOf(scan.nextLine());
                flight.setDateTime(timeUp);
                System.out.println("Введите номер:");
                int fromUp = Integer.valueOf(scan.nextLine());
                flight.setCityFromId(fromUp);
                System.out.println("Введите номер:");
                int toUp = Integer.valueOf(scan.nextLine());
                flight.setCityToId(toUp);
                System.out.println("Введите номер:");
                int airUp = Integer.valueOf(scan.nextLine());
                flight.setAirplaneId(airUp);
                FlightConnector.update(flight);
                break;

        }

    }
}
