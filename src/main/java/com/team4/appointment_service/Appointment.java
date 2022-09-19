package com.team4.appointment_service;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private Long patientId;

    @Column
    private Long doctorId;

    @Column
    @JsonFormat(pattern="dd-MM-yyyy HH:mm")
    private String startTime;

    @Column
    @JsonFormat(pattern="dd-MM-yyyy HH:mm")
    private String endTime;

    public Appointment() {
    }

    public Appointment(Long id, Long patientId, Long doctorId, String startTime, String endTime, String appointmentDescription) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.appointmentDescription = appointmentDescription;
    }

    @Column
    private String appointmentDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        this.appointmentDescription = appointmentDescription;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", appointmentDescription='" + appointmentDescription + '\'' +
                '}';
    }
}
