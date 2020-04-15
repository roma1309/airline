package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AirplanesConnector {

    private static final String Select_All = "Select *FROM airplanes ORDER by id asc ";
    private static final String Select_By_Id = "Select *FROM airplanes where id=?";
    private static final String ADD = "INSERT INTO airplanes (model) Values (?) ";
    private static final String UPDATE = "UPDATE airplanes set model=?,updated_at=? WHERE id=?";
    private static final String DELETE = "DELETE from airplanes  WHERE id=?";


    public static List<Airplanes> getAll() throws SQLException {
        List<Airplanes> result = new ArrayList<>();
        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(Select_All);
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {

                Airplanes airplanes = AirplanesUtil.toObject(resultSet);
                result.add(airplanes);
            }
        }

        return result;
    }

    public static void add(Airplanes airplanes) throws SQLException {

        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(ADD);

        ) {
            String model = airplanes.getModel();
            statement.setString(1, model);
            statement.executeUpdate();
        }
    }

    public static Airplanes getById(int id) throws SQLException {
        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(Select_By_Id);
        ) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            Airplanes airplanes = AirplanesUtil.toObject(resultSet);

            resultSet.close();

            return airplanes;
        }
    }

    public static void update(Airplanes airplanes) throws SQLException {

        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(UPDATE);

        ) {
            statement.setString(1, airplanes.getModel());
            statement.setDate(2, new Date(CurrentDateUtil.currentUnixStamp()));
            statement.setInt(3, airplanes.getId());
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



