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

### Working with Binary Trees
BinaryTreeController holds the user entrypoint to call binary tree methods.
* Examples
  * (server_ip_or_dns):(port_number)/binarytree/preorder
  * (server_ip_or_dns):(port_number)/binarytree/inorder
  * (server_ip_or_dns):(port_number)/binarytree/postorder
  * (server_ip_or_dns):(port_number)/binarytree/minkey
  * (server_ip_or_dns):(port_number)/binarytree/maxkey
  * (server_ip_or_dns):(port_number)/binarytree/height

### Working with Lambda Functions
LambdaUtil holds a lot of util methods to work with lambda operations.

LambdaController holds the user entrypoint to call lambda methods.
* Examples
  * (server_ip_or_dns):(port_number)/lambda/noreturn/noparams
  * (server_ip_or_dns):(port_number)/lambda/noreturn/oneparam
  * (server_ip_or_dns):(port_number)/lambda/noreturn/twoparams
  * (server_ip_or_dns):(port_number)/lambda/withreturn/noparams
  * (server_ip_or_dns):(port_number)/lambda/withreturn/oneparam
  * (server_ip_or_dns):(port_number)/lambda/withreturn/twoparams

### Working with Problem Solving
ProblemSolvingController holds the user entrypoint to call problem solving methods.
* Examples
  * (server_ip_or_dns):(port_number)/problemsolving/firstcharnotrepeated
  * (server_ip_or_dns):(port_number)/problemsolving/twoSumIndexes
  * (server_ip_or_dns):(port_number)/problemsolving/maxSequenceOfZerosInsideBinaryGap
  * (server_ip_or_dns):(port_number)/problemsolving/lowerPositiveIntegerNotPresentInsideIntArray
  
### Working with Recursion
RecursionController holds the user entrypoint to call recursion methods.
* Examples
  * (server_ip_or_dns):(port_number)/recursion/factorial/{id}
  * (server_ip_or_dns):(port_number)/recursion/fibonacci/{id}")

### Working with Static Methods Inside Interface
StaticMethodInsideInterfaceController holds the user entrypoint to call methods.
* Examples
  * (server_ip_or_dns):(port_number)/staticmethodfrominterface/noreturn/noparams
  * (server_ip_or_dns):(port_number)/staticmethodfrominterface/noreturn/oneparam
  * (server_ip_or_dns):(port_number)/staticmethodfrominterface/noreturn/twoparams
  * (server_ip_or_dns):(port_number)/staticmethodfrominterface/withreturn/noparams
  * (server_ip_or_dns):(port_number)/staticmethodfrominterface/withreturn/oneparam
  * (server_ip_or_dns):(port_number)/staticmethodfrominterface/withreturn/twoparams

### Working with Streams
StreamsUtil holds a lot of util methods to work with streams operations.

StreamsController holds the user entrypoint to call streams methods.
* Examples
  * (server_ip_or_dns):(port_number)/streams/fullintstream
  * (server_ip_or_dns):(port_number)/streams/skippedintstream
  
### Working with Strings
StringUtil holds a lot of util methods to work with strings.

StringController holds the user entrypoint to call StringUtil methods.
* Examples
  * (server_ip_or_dns):(port_number)/string/create/stringjoiner/onlywithdelimiter
  * (server_ip_or_dns):(port_number)/string/create/stringjoiner/delimiterprefixsuffix

### Working with Time

TimeUtil holds a lot of util methods to work with time operations.

TimeController holds the user entrypoint to call TimeUtil methods.
* Examples
  * (server_ip_or_dns):(port_number)/time/currenttimemillis
  * (server_ip_or_dns):(port_number)/time/instant