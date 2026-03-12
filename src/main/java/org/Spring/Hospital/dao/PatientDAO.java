package org.Spring.Hospital.dao;

import org.Spring.Hospital.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Repository
public class PatientDAO {
    @Autowired
    private Connection connection;

    public void insertPatient(Patient patient) throws SQLException {
        String sql = "INSERT INTO patients(first_name,last_name,date_of_birth,gender,phone_number,email,created_at) VALUES(?,?,?,?,?,?,CURRENT_TIMESTAMP)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, patient.getFirstName());
        stmt.setString(2, patient.getLastName());
        stmt.setDate(3, Date.valueOf(patient.getDateOfBirth()));
        stmt.setString(4, patient.getGender());
        stmt.setString(5, patient.getPhoneNumber());
        stmt.setString(6, patient.getEmail());
        stmt.executeUpdate();
    }

}
