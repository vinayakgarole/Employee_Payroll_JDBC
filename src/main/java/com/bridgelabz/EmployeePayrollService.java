package com.bridgelabz;

import java.sql.SQLException;

public class EmployeePayrollService {

    public static void main(String[] args) throws SQLException {

        EmployeePayrollDBService employeePayrollDBService = new EmployeePayrollDBService();
        employeePayrollDBService.getConnection();
    }
}
