package com.example.demo.Repository

import com.example.demo.model.Patient
import org.springframework.data.jpa.repository.JpaRepository

interface PatientRepisitory:JpaRepository<Patient, Long> {
    fun findById(id: Long?): Patient?
}