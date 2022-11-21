Contract Testing Producer
=======================
![Build with Gradle](https://github.com/czerwinskimarek/contract-testing-producer/actions/workflows/gradle.yml/badge.svg)
[![Renovate enabled](https://img.shields.io/badge/renovate-enabled-brightgreen.svg)](https://renovatebot.com/)

Overview
--------
This repository contains the application which demonstrates how Spring Cloud Contract can be used on the producer side.

How to run static code analysis
-------------------
Execute:
```bash
./gradlew detekt
```

How the code is organized
-------------------
- [CustomerController.kt](src/main/kotlin/com/example/customer/producer/CustomerController.kt) - sample controller
- [shouldReturnAllCustomers.groovy](src/test/resources/contracts/shouldReturnAllCustomers.groovy) - contract
- [BaseClass.kt](src/test/kotlin/com/example/customer/producer/BaseClass.kt) - base class for contract testing on the producer side

How to run contract tests
-------------------
Firstly, [build the app on the consumer side](https://github.com/czerwinskimarek/contract-testing-producer#how-to-run-contract-tests) to publish the stubs to Maven Local.

Secondly, execute:
```bash
./gradlew clean build publishToMavenLocal
```

To:
- build the app
- generate and run Spring Cloud Contract Verifier tests
- publish the stubs to Maven Local
