package com.team4.appointment_service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {


    private final AppointmentRepo appointmentRepository;


    public AppointmentService(AppointmentRepo appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public Appointment findById(Long id) {
        return appointmentRepository.findAppointmentById(id);
    }

    public List<Appointment> findByPatientId(Long patientId) {
        return appointmentRepository.findAppointmentsByPatientId(patientId);
    }

    public List<Appointment> findByDoctorId(Long doctorId) {
        return appointmentRepository.findAppointmentsByDoctorId(doctorId);
    }

}

