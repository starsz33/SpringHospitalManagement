package org.Spring.Hospital.dao;

import org.Spring.Hospital.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
@Repository
public class AppointmentDAO {
    @Autowired
    private Connection connection;

    public void createAppointment(Appointment appointment) throws SQLException {
        String sql = "INSERT INTO appointments(doctor_id,patient_id,appointment_date,status,created_at) VALUES(?,?,?,?,CURRENT_TIMESTAMP)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, appointment.getDoctorId());
        stmt.setInt(2, appointment.getPatientId());
        stmt.setTimestamp(3, Timestamp.valueOf(appointment.getAppointmentDate()));
        stmt.setString(4, appointment.getStatus());
        stmt.executeUpdate();
    }
}
