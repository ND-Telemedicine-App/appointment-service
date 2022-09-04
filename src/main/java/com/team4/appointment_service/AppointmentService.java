package com.team4.appointment_service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepo appointmentRepo;

    public Appointment findById(Long id) {
        return appointmentRepo.findAppointmentById(id);
    }

    public List<Appointment> findByPatientId(Long patientId) {
        return appointmentRepo.findAppointmentsByPatientId(patientId);
    }

    public List<Appointment> findByDoctorId(Long doctorId) {
        return appointmentRepo.findAppointmentsByDoctorId(doctorId);
    }

    public AppointmentService(AppointmentRepo appointmentRepo) {
        this.appointmentRepo = appointmentRepo;
    }

    public Appointment create(Appointment newAppointment) {
        return appointmentRepo.save(newAppointment);
    }
}
