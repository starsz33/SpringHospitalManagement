package org.Spring.Hospital.dao;

import org.Spring.Hospital.model.MedicalRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Repository
public class MedicalRecordDAO {
    @Autowired
    private Connection connection;

    public void addRecord(MedicalRecord record) throws SQLException {
        String sql = "INSERT INTO medical_records(patient_id,diagnosis,treatment,doctor_id,created_at) VALUES(?,?,?,?,CURRENT_TIMESTAMP)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, record.getPatientId());
        stmt.setString(2, record.getDiagnosis());
        stmt.setString(3, record.getTreatment());
        stmt.setInt(4, record.getDoctorId());
        stmt.executeUpdate();
    }
}
