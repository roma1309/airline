package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightConnector {

    private static final String Select_All = "Select *FROM flight ORDER by id asc ";
    private static final String Select_By_Id = "Select *FROM flight where id=?";
    private static final String ADD = "INSERT INTO airplanes (day,date_time,citi_from_id,citi_to_id,airplane_id) Values (?,?,?,?,?) ";
    private static final String UPDATE = "UPDATE airplanes set day=?,date_time=?,citi_from_id=?,citi_to_id=?,airplane_id=?,updated_at=? WHERE id=?";
    private static final String DELETE = "DELETE from flight  WHERE id=?";


    public static List<Flight> getAll() throws SQLException {
        List<Flight> result = new ArrayList<>();
        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(Select_All);
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {

                Flight flight = FlightUtil.toObject(resultSet);
                result.add(flight);
            }
        }

        return result;
    }

    public static void add(Flight flight) throws SQLException {

        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(ADD);

        ) {
            Date day = (Date) flight.getDay();
            Date dateTime= (Date) flight.getDateTime();
           int cityFromId=flight.getCityFromId();
           int cityToId=flight.getCityToId();
           int airplaneId=flight.getAirplanesId();
            statement.setDate(1, day);
            statement.setDate(2,dateTime);
            statement.setInt(3,cityFromId);
            statement.setInt(4,cityToId);
            statement.setInt(5,airplaneId);
            statement.executeUpdate();
        }
    }

    public static Flight getById(int id) throws SQLException {
        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(Select_By_Id);
        ) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            Flight flight = FlightUtil.toObject(resultSet);

            resultSet.close();

            return flight;
        }
    }

    public static void update(Flight flight) throws SQLException {

        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(UPDATE);

        ) {
            statement.setDate(1, (Date) flight.getDay());
            statement.setDate(2, (Date) flight.getDateTime());
            statement.setInt(3,flight.getCityToId());
            statement.setInt(4,flight.getCityFromId());
            statement.setInt(5,flight.getAirplanesId());
            statement.setDate(6, new Date(CurrentDateUtil.currentUnixStamp()));
            statement.setInt(7, flight.getId());
            statement.executeUpdate();
        }
    }

    public static void deleteById(int id) throws SQLException {
        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(DELETE);
        ) {

            statement.setInt(1, id);
            statement.executeUpdate();


        }
    }
}
