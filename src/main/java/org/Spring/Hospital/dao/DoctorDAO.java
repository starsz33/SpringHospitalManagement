package org.Spring.Hospital.dao;

import org.Spring.Hospital.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Repository
public class DoctorDAO {
    @Autowired
    private Connection connection;

    public void insertDoctor(Doctor doctor) throws SQLException {
        String sql = "INSERT INTO doctors(first_name,last_name,specialty,phone_number,email,created_at) VALUES(?,?,?,?,?,CURRENT_TIMESTAMP)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, doctor.getFirstName());
        stmt.setString(2, doctor.getLastName());
        stmt.setString(3, doctor.getSpecialty());
        stmt.setString(4, doctor.getPhoneNumber());
        stmt.setString(5, doctor.getEmail());
        stmt.executeUpdate();
    }
}
