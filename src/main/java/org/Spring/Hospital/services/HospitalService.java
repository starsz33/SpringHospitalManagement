package org.Spring.Hospital.services;

import org.Spring.Hospital.dao.AppointmentDAO;
import org.Spring.Hospital.dao.DoctorDAO;
import org.Spring.Hospital.dao.MedicalRecordDAO;
import org.Spring.Hospital.dao.PatientDAO;
import org.Spring.Hospital.model.Appointment;
import org.Spring.Hospital.model.Doctor;
import org.Spring.Hospital.model.MedicalRecord;
import org.Spring.Hospital.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
@Service
public class HospitalService {
    @Autowired
    private DoctorDAO doctorDAO;
    @Autowired
    private PatientDAO patientDAO;
    @Autowired
    private AppointmentDAO appointmentDAO;
    @Autowired
    private MedicalRecordDAO medicalRecordDAO;

    public void saveDoctor(Doctor doctor) throws SQLException {
        doctorDAO.insertDoctor(doctor);
    }

    public void savePatient(Patient patient) throws SQLException {
        patientDAO.insertPatient(patient);
    }

    public void saveAppointment(Appointment appointment) throws SQLException {
        appointmentDAO.createAppointment(appointment);
    }

    public void saveMedicalRecord(MedicalRecord record) throws SQLException {
        medicalRecordDAO.addRecord(record);
    }
}
