package com.example.demo.Repository

import com.example.demo.model.Doctor
import org.springframework.data.jpa.repository.JpaRepository

interface DoctorRepisitory:JpaRepository<Doctor, Long> {
    fun findById(id: Long?): Doctor?
}