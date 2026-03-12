package org.Spring.Hospital.model;
public class MedicalRecord {
    private int patientId;
    private String diagnosis;
    private String treatment;
    private int doctorId;

    public MedicalRecord(int patientId, String diagnosis, String treatment, int doctorId) {
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.doctorId = doctorId;
    }

    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public String getTreatment() { return treatment; }
    public void setTreatment(String treatment) { this.treatment = treatment; }
    public int getDoctorId() { return doctorId; }
    public void setDoctorId(int doctorId) { this.doctorId = doctorId; }


}
