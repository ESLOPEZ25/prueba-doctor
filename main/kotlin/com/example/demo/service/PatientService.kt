package com.example.demo.service



import com.example.demo.Repository.PatientRepisitory

import com.example.demo.model.Patient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class PatientService {
    @Autowired
    lateinit var patientRepisitory: PatientRepisitory

    fun list(): List<Patient> {
        return patientRepisitory.findAll()
    }

    fun save(patient: Patient): Patient {
        return patientRepisitory.save(patient)
    }

    fun update(patient: Patient): Patient {
        return patientRepisitory.save(patient)
    }

    fun updateDescription (patient: Patient): Patient {
        val response = patientRepisitory.findById(patient.id)
            ?: throw Exception()
        response.apply {
            this.name=patient.name
        }
        return patientRepisitory.save(patient)
    }

    fun delete (id:Long): Boolean{
        patientRepisitory.deleteById(id)
        return true
    }
}