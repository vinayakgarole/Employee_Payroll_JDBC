package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeePayrollDBService {

    Connection getConnection() throws SQLException {
        Connection connection;
        String jdbcUr1 = "jdbc:mysql://localhost:3306/employee_payroll_service?characterEncoding=utf8";
        String userName = "root";
        String password = "root123";

        connection = DriverManager.getConnection(jdbcUr1, userName, password);
        System.out.println("Connection is successful!!! " + connection);
        return connection;
    }
}
