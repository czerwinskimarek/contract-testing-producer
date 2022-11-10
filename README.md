Contract Testing Producer
=======================

Overview
--------
This repository contains the application which demonstrates how Spring Cloud Contract can be used on the producer side.

How to run static code analysis
-------------------
Execute:
```bash
./gradlew detekt
```

How to run contract tests
-------------------
Execute:
```bash
./gradlew clean build publishToMavenLocal
```

To:
- build the app
- generate and run Spring Cloud Contract Verifier tests
- publish the stubs to Maven Local