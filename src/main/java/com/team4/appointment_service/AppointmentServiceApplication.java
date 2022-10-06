package com.team4.appointment_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppointmentServiceApplication implements CommandLineRunner {

    @Autowired
    AppointmentRepo appointmentRepo;
    public static void main(String[] args) {
        SpringApplication.run(AppointmentServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        Appointment newAppointment1 = new Appointment(1L, 4L, 2L, "2022-10-14 13:30:00.000", "2022-10-14 14:00:00.000", "This is a description");
        appointmentRepo.save(newAppointment1);

        Appointment newAppointment2 = new Appointment(2L, 4L, 2L, "2022-10-25 15:00:00.000", "2022-10-25 15:30:00.000", "This is a description");
        appointmentRepo.save(newAppointment2);

        Appointment newAppointment3 = new Appointment(3L, 4L, 2L, "2022-10-27 09:00:00.000", "2022-10-27 09:30:00.000", "This is a description");
        appointmentRepo.save(newAppointment3);

        Appointment newAppointment4 = new Appointment(4L, 4L, 2L, "2022-10-22 10:00:00.000", "2022-10-22 10:30:00.000", "This is a description");
        appointmentRepo.save(newAppointment4);
    }

}

