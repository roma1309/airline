package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class CitiesUtil {
    public  static Cities toObject(ResultSet resultSet) throws SQLException {
        int id =resultSet.getInt("id");
        String name=resultSet.getString("name");
        Date createdAt=resultSet.getDate("created_at");
        Date updatedAt=resultSet.getDate("updated_at");

       return new Cities(id,name,createdAt,updatedAt);
    }

}
