package com.team4.appointment_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppointmentControllerTest {

    @Autowired
    private AppointmentRepo appointmentRepo;

    @Test
    void viewAppointmentById() throws Exception{
//        To analog a date format in database
        DateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
//        Convert String to java.sql.Date
        Date mockDate = new java.sql.Date(dateFormatter.parse("15-09-2022").getTime());

        Appointment appointment = new Appointment(1L, 1L, 2L, mockDate, "10.00 am, 20/09/2022", "I have a headache");
        appointmentRepo.save(appointment);
        Appointment expectedAppointment = appointmentRepo.findAppointmentById(1L);
        assertEquals(1L, expectedAppointment.getPatientId());
        assertEquals(2L, expectedAppointment.getDoctorId());
        assertEquals("15-09-2022", dateFormatter.format(expectedAppointment.getAppointmentDate()));
        assertEquals("10.00 am, 20/09/2022", expectedAppointment.getAppointmentTime());
        assertEquals("I have a headache", expectedAppointment.getAppointmentDescription());
    }

    @Test
    void viewAppointmentOfPatient() throws Exception {
        //        To analog a date format in database
        DateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
//        Convert String to java.sql.Date
        Date mockDate = new java.sql.Date(dateFormatter.parse("15-09-2022").getTime());

        Appointment appointment1 = new Appointment(1L, 1L, 2L, mockDate, "10.00 am, 20/09/2022", "I have a headache");
        Appointment appointment2 = new Appointment(2L, 2L, 3L, mockDate, "11.00 am, 21/09/2022", "I feel unwell");
        Appointment appointment3 = new Appointment(3L, 2L, 4L, mockDate, "12.00 am, 22/09/2022", "I have a cold");
        appointmentRepo.save(appointment1);
        appointmentRepo.save(appointment2);
        appointmentRepo.save(appointment3);

        List<Appointment> appointments = appointmentRepo.findAppointmentsByPatientId(2L);
        assertThat(appointments.size()).isEqualTo(2);
    }

    @Test
    void viewAppointmentOfDoctor() throws Exception{
        //        To analog a date format in database
        DateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
//        Convert String to java.sql.Date
        Date mockDate = new java.sql.Date(dateFormatter.parse("15-09-2022").getTime());

        Appointment appointment1 = new Appointment(1L, 1L, 2L, mockDate, "10.00 am, 20/09/2022", "I have a headache");
        Appointment appointment2 = new Appointment(2L, 2L, 4L, mockDate, "11.00 am, 21/09/2022", "I feel unwell");
        Appointment appointment3 = new Appointment(3L, 2L, 4L, mockDate, "12.00 pm, 22/09/2022", "I have a cold");
        Appointment appointment4 = new Appointment(4L, 2L, 4L, mockDate, "9.00 am, 22/09/2022", "I am fever");
        appointmentRepo.save(appointment1);
        appointmentRepo.save(appointment2);
        appointmentRepo.save(appointment3);
        appointmentRepo.save(appointment4);

        List<Appointment> appointments = appointmentRepo.findAppointmentsByDoctorId(4L);
        assertThat(appointments.size()).isEqualTo(3);
    }

    @Test
    void deleteAppointment() throws ParseException {
        //        To analog a date format in database
        DateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
//        Convert String to java.sql.Date
        Date mockDate = new java.sql.Date(dateFormatter.parse("15-09-2022").getTime());

        Appointment appointment = new Appointment(1L, 1L, 2L, mockDate, "10.00 am, 20/09/2022", "I have a headache");
        appointmentRepo.save(appointment);
        appointmentRepo.deleteById(1L);
        assertThat(appointmentRepo.existsById(1L)).isFalse();
    }

    @Test
    void createAppointment() throws Exception {
        //        To analog a date format in database
        DateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
//        Convert String to java.sql.Date
        Date mockDate = new java.sql.Date(dateFormatter.parse("15-09-2022").getTime());

        Appointment appointment = new Appointment(1L, 1L, 2L, mockDate, "10.00 am, 20/09/2022", "I have a headache");;
        appointmentRepo.save(appointment);
        assertNotNull(appointmentRepo.findById(1L));
    }
}