package com.example.customer.producer

import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.jupiter.api.BeforeEach
import org.mockito.kotlin.whenever
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean

@WebMvcTest(CustomerController::class)
open class BaseClass {

    @Autowired
    private lateinit var customerController: CustomerController

    @MockBean
    private lateinit var customerRepository: CustomerRepository

    @BeforeEach
    fun beforeEach() {
        whenever(this.customerRepository.findAll())
            .thenReturn(
                listOf(
                    Customer(1L, "Jane"),
                    Customer(2L, "Bob")
                )
            )
        RestAssuredMockMvc.standaloneSetup(this.customerController)
    }
}
