package org.Spring.Hospital;

import org.Spring.Hospital.config.AppConfig;
import org.Spring.Hospital.model.Appointment;
import org.Spring.Hospital.model.Doctor;
import org.Spring.Hospital.model.MedicalRecord;
import org.Spring.Hospital.model.Patient;
import org.Spring.Hospital.services.HospitalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        Doctor doctor = new Doctor("Aline", "Umwiza", "Dentist", "078124367", "aline.umwiza@gmail.com");
        Patient patient = new Patient("Esther", "Keza", "1990-03-15", "Female", "078989943", "esther.keza@gmail.com");
        Appointment appointment = new Appointment(1, 1, "2024-12-20 9:00:00", "Scheduled");
        MedicalRecord record = new MedicalRecord(1, "Anemia", "Blood Transfusion", 1);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HospitalService service = context.getBean(HospitalService.class);
        service.saveDoctor(doctor);
        service.savePatient(patient);
        service.saveAppointment(appointment);
        service.saveMedicalRecord(record);

        System.out.println("All data saved successfully!");
    }
}