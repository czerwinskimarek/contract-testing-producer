package com.example.customer.producer

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@RestController
class CustomerController(
    private val customerRepository: CustomerRepository,
) {

    @GetMapping("/customers")
    fun getAllCustomers(): Collection<Customer> = customerRepository.findAll()
}

@Entity
data class Customer(

    @Id @GeneratedValue
    val id: Long,
    val name: String,
)
