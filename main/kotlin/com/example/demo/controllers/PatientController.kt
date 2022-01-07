package com.example.demo.controllers

import com.example.demo.model.Patient
import com.example.demo.service.PatientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/patient")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class PatientController {
    @Autowired
    lateinit var patientService: PatientService

    @GetMapping
    fun list(): List<Patient>{
        return patientService.list()
    }

    @PostMapping
    fun save(@RequestBody patient: Patient): Patient {
        return patientService.save(patient)
    }
}