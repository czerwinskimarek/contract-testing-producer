package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return all customers"
    request {
        url "/customers"
        method GET()

    }
    response {
        status 200
        headers {
            contentType applicationJson()
        }
        body([[id: 1L, name: "Jane"], [id: 2L, name: "Bob"]])
    }
}