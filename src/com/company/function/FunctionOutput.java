package com.company.function;

import com.company.db.AirplanesConnector;
import com.company.db.CitiesConnector;
import com.company.db.FlightConnector;
import com.company.db.FullInfoConnector;
import com.company.entity.Airplanes;
import com.company.entity.Cities;
import com.company.entity.Flight;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class FunctionOutput {

    public  static void   output() throws SQLException {
        Scanner scan = new Scanner(System.in);
        int k = Integer.valueOf(scan.nextLine());
                switch (k) {
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
        }
    }


}
