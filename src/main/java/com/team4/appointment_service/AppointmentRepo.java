package com.team4.appointment_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

    Appointment findAppointmentById(Long id);

    List<Appointment> findAppointmentsByPatientId(Long patientId);

    List<Appointment> findAppointmentsByDoctorId(Long doctorId);

}
