package com.team4.appointment_service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

    Appointment findAppointmentById(Long id);

    List<Appointment> findAppointmentsByPatientId(Long patientId);

    List<Appointment> findAppointmentsByDoctorId(Long doctorId);



}
