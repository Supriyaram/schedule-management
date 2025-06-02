package com.example.appointmentmanagement.model;

public class Appointment {
    private Long id;
    private String patientName;
    private String doctorName;
    private String appointmentDate; // e.g. "2025-06-01 10:00 AM"

    // Constructors
    public Appointment() {}

    public Appointment(Long id, String patientName, String doctorName, String appointmentDate) {
        this.id = id;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public String getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(String appointmentDate) { this.appointmentDate = appointmentDate; }
}

