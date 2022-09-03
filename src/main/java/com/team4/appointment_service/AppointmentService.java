package com.team4.appointment_service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepo appointmentRepository;


    public AppointmentService(AppointmentRepo appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }


}
