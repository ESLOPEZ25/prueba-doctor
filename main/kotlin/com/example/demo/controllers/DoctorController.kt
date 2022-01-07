package com.example.demo.controllers

import com.example.demo.model.Doctor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import com.example.demo.service.DoctorService

@RestController
@RequestMapping("/doctor")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class DoctorController {
    @Autowired
    lateinit var doctorService: DoctorService

    @GetMapping
    fun list(): List<Doctor>{
        return doctorService.list()
    }

    @PostMapping
    fun save(@RequestBody doctor: Doctor): Doctor {
        return doctorService.save(doctor)
    }
}