package com.team4.appointment_service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepo appointmentRepo;

    public AppointmentService(AppointmentRepo appointmentRepo) {
        this.appointmentRepo = appointmentRepo;
    }

    public Appointment findById(Long id) {
        return appointmentRepo.findAppointmentById(id);
    }

    public List<Appointment> getAll() {
        return appointmentRepo.findAll();
    }

    public List<Appointment> findByPatientId(Long patientId) {
        return appointmentRepo.findAppointmentsByPatientId(patientId);
    }

    public List<Appointment> findByDoctorId(Long doctorId) {
        return appointmentRepo.findAppointmentsByDoctorId(doctorId);
    }

    public void deleteAppointment(Long appointmentId) {
        appointmentRepo.deleteById(appointmentId);
    }

    public Appointment create(Appointment newAppointment) {
        return appointmentRepo.save(newAppointment);
    }
}

