package com.company.db;

import com.company.entity.CurrentDateUtil;
import com.company.entity.Cities;
import com.company.util.CitiesUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CitiesConnector {
    private static final String Select_All = "Select *FROM cities ORDER by id asc ";
    private static final String Select_By_Id = "Select *FROM cities where id=?";
    private static final String ADD = "INSERT INTO cities (name) Values (?) ";
    private  static final  String UPDATE="UPDATE cities set name=?,updated_at=? WHERE id=?";
    private  static final  String DELETE="DELETE from cities  WHERE id=?";
    public static List<Cities> getAll() throws SQLException {
        List<Cities> result = new ArrayList<>();
        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(Select_All);
                ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {


                Cities cities = CitiesUtil.toObject(resultSet);
                result.add(cities);
            }
        }

        return result;
    }

    public static void add(Cities cities) throws SQLException {

        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(ADD);

        ) {
            String name = cities.getName();
            statement.setString(1, name);
            statement.executeUpdate();
        }
    }

    public static Cities getById(int id) throws SQLException {
        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(Select_By_Id);
        ) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            Cities cities = CitiesUtil.toObject(resultSet);

            resultSet.close();

            return cities;
        }
    }
    public static void update(Cities cities) throws SQLException {

        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(UPDATE);

        ) {
            statement.setString(1, cities.getName());
            statement.setDate(2,new Date(CurrentDateUtil.currentUnixStamp()));
            statement.setInt(3,cities.getId());
            statement.executeUpdate();
        }
    }
    public static void deleteById(int id) throws SQLException {
        Connection connection = DbConnector.getConnection();


        try (
                PreparedStatement statement = connection.prepareStatement(DELETE);
        ) {

            statement.setInt(1,id);
            statement.executeUpdate();


        }
    }
}

