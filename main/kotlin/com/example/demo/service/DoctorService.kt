package com.example.demo.service


import com.example.demo.Repository.DoctorRepisitory
import com.example.demo.model.Doctor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class DoctorService {
    @Autowired
    lateinit var doctorRepisitory: DoctorRepisitory

    fun list(): List<Doctor> {

        return doctorRepisitory.findAll()
    }

    fun save(doctor: Doctor): Doctor {
        return doctorRepisitory.save(doctor)
    }

    fun update(doctor: Doctor): Doctor {
        return doctorRepisitory.save(doctor)
    }

    fun updateDescription (doctor: Doctor): Doctor {
        val response = doctorRepisitory.findById(doctor.id)
            ?: throw Exception()
        response.apply {
            this.name=doctor.name
        }
        return doctorRepisitory.save(doctor)
    }

    fun delete (id:Long): Boolean{
        doctorRepisitory.deleteById(id)
        return true
    }
}