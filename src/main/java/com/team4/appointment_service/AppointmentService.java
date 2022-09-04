package com.team4.appointment_service;

import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    private final AppointmentRepo appointmentRepo;

    public AppointmentService(AppointmentRepo appointmentRepo) {
        this.appointmentRepo = appointmentRepo;
    }

    public Appointment create(Appointment newAppointment) {
        return appointmentRepo.save(newAppointment);
    }
}
