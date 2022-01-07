package com.example.demo.model
import javax.persistence.*
@Entity
@Table(name = "doctor")
class Doctor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name: String? = null
    var lastname: String? = null
}