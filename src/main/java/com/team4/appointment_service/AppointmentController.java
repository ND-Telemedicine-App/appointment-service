package com.team4.appointment_service;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    //shows a specific appointment
    @GetMapping(value = "/{id}")
    public Appointment viewAppointmentById(@PathVariable Long id){
        return appointmentService.findById(id);
    }


    //shows all appointments a patient has on record
    @GetMapping(value = "/{patientId}")
    public List<Appointment> viewAppointmentOfPatient(@PathVariable Long patientId){
        return appointmentService.findByPatientId(patientId);
    }


    //shows all appointments a doctor has on record
    @GetMapping(value = "/{doctorId}")
    public List<Appointment> viewAppointmentOfDoctor(@PathVariable Long doctorId){
        return appointmentService.findByDoctorId(doctorId);
    }

    @PostMapping("/createAppointment")
    public Appointment createAppointment(@RequestBody Appointment newAppointment) {
        return appointmentService.create(newAppointment);
    }
}
