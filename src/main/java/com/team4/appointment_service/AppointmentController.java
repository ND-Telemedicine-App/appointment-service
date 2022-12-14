package com.team4.appointment_service;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping(value = "/appointment/all")
    public List<Appointment> viewAppointments() {
        return appointmentService.getAll();
    }

    //shows a specific appointment
    @GetMapping(value = "/appointment/{id}")
    public Appointment viewAppointmentById(@PathVariable Long id){
        return appointmentService.findById(id);
    }


    //shows all appointments a patient has on record
    @GetMapping(value = "/appointment/patient/{patientId}")
    public List<Appointment> viewAppointmentOfPatient(@PathVariable Long patientId){
        return appointmentService.findByPatientId(patientId);
    }



    //shows all appointments a doctor has on record
    @GetMapping(value = "/appointment/doctor/{doctorId}")
    public List<Appointment> viewAppointmentOfDoctor(@PathVariable Long doctorId){
        return appointmentService.findByDoctorId(doctorId);
    }

    @DeleteMapping("/appointment/delete/{appointmentId}")
    public void deleteAppointment(@PathVariable Long appointmentId) {
        appointmentService.deleteAppointment(appointmentId);
    }

    @PostMapping("/createAppointment")
    public Appointment createAppointment(@RequestBody Appointment newAppointment) {
        return appointmentService.create(newAppointment);

    }
}
