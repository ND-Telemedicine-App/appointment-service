package com.team4.appointment_service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AppointmentServiceApplicationTests {
    @Autowired
    private AppointmentService appointmentService;

//    create 4 appointment objects before all test cases
    @Test
    @BeforeAll
    void init(){
        Appointment appointment1 = new Appointment(1L, 1L, 3L, "20/09/2022 8.00", "20/09/2022 10.00", "I have a headache");
        Appointment appointment2 = new Appointment(2L, 2L, 4L, "21/09/2022 9.00", "21/09/2022,11.00", "I feel unwell");
        Appointment appointment3 = new Appointment(3L, 2L, 4L, "22/09/2022 10.00", "22/09/2022 12.00", "I have a cold");
        Appointment appointment4 = new Appointment(4L, 3L, 4L, "22/09/2022 13.00","22/09/2022 15.00", "I am fever");

        appointmentService.create(appointment1);
        appointmentService.create(appointment2);
        appointmentService.create(appointment3);
        appointmentService.create(appointment4);
    }

    @Test
//    should get the correct appointment with all attributes equal to the attributes manually entered
    void viewAppointmentById(){
        Appointment expectedAppointment = appointmentService.findById(4L);
        assertEquals(3L, expectedAppointment.getPatientId());
        assertEquals(4L, expectedAppointment.getDoctorId());
        assertEquals("22/09/2022 13.00", expectedAppointment.getStartTime());
        assertEquals("22/09/2022 15.00", expectedAppointment.getEndTime());
        assertEquals("I am fever", expectedAppointment.getAppointmentDescription());
    }

    @Test
//    should return the correct number of patients with the specific patient ID
    void viewAppointmentOfPatient() {
        List<Appointment> appointments = appointmentService.findByPatientId(2L);
        assertThat(appointments.size()).isEqualTo(2);
    }

    @Test
//    should return the correct number of patients with the specific doctor ID
    void viewAppointmentOfDoctor(){
        List<Appointment> appointments = appointmentService.findByDoctorId(4L);
        assertThat(appointments.size()).isEqualTo(3);
    }

    @Test
//    should delete the correct appointment with specific Id,
//    should return null when finding it again
    void deleteAppointment() {
        appointmentService.deleteAppointment(1L);
        assertThat(appointmentService.findById(1L)).isNull();
    }
    //
    @Test
//   the new appointment should be created and can be found in the database
    void createAppointment() {
        appointmentService.create(new Appointment(5L, 1L, 3L, "20/09/2022 8.00", "20/09/2022 10.00", "I have a headache"));
        assertNotNull(appointmentService.findById(5L));
    }
}
