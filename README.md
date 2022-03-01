# Java 8 - Features

## Summary

This project will contain a lot of Java implementations.
It is called "Java 8 - Functions" because the reason to create were to increase my deep knowledge in this LTS version.
The focus on Java 8 features are obviously lambdas, streams and method reference. 

* REST APIs
  * Spring Starter Web
* Relational Database Integration
  * PostgreSQL was the DB chosen
* CI/CD Pipelines
  * Microsoft Azure will be the cloud provider
* Software Testing
  * JUnit, Jacoco, Cucumber, TDD will be used
* MVC Architecture (adapted)
  * Models and Views will bem highly used

### 1. Working with Strings 

StringUtil holds a lot of util methods to work with strings.

StringController holds the user entrypoint to call StringUtil methods.
* Examples
  * (server_ip_or_dns):(port_number)/string/create/stringjoiner/onlywithdelimiter
  * (server_ip_or_dns):(port_number)/string/create/stringjoiner/delimiterprefixsuffix

### 2. Working with Time

TimeUtil holds a lot of util methods to work with time operations.

TimeController holds the user entrypoint to call TimeUtil methods.
* Examples
  * (server_ip_or_dns):(port_number)/time/currenttimemillis
  * (server_ip_or_dns):(port_number)/time/instant

### 3. Working with Lambda Functions

LambdaUtil holds a lot of util methods to work with lambda operations.

LambdaController holds the user entrypoint to call lambda methods.
* Examples
  * (server_ip_or_dns):(port_number)/lambda/noreturn/noparams
  * (server_ip_or_dns):(port_number)/lambda/noreturn/oneparam
  * (server_ip_or_dns):(port_number)/lambda/noreturn/twoparams
  * (server_ip_or_dns):(port_number)/lambda/withreturn/noparams
  * (server_ip_or_dns):(port_number)/lambda/withreturn/oneparam
  * (server_ip_or_dns):(port_number)/lambda/withreturn/twoparams