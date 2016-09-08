# ticketManagement5000

Ticket Management System 5000 is an API made available by University of Bamberg for the students to practice on. Ticket Management System is an application which is capable of creating and managing Tickets. In this practice implementation I am working on exposing Ticket Management System 5000 and it’s core functionalities as WSDL-based Web Services.
The complete implementation should have three smaller sub projects namely,

- Server: The core functionalities of Ticket Management System exposes as an endpoint.
- Search: Provides customized search functionalities on the all the tickets created by Ticket Management Server service
- Client: Will work as an interface for entering and searching for tickets.

Three components of the Ticket Management Systems will be designed as three individual gradle projects. There will be another gradle project which will execute the three individual projects. In the current implementation so far, I have exposed the Server and Search functionalities as WSDL-based Web Services.

### Ongoing Work: 
I am now working on implementing the client for  entering and searching for Tickets. :octocat:

## Assumption

- This implementation creates Web Application Archive (.war) file and deploys the same in [Glassfish](https://glassfish.java.net/) container which can be downloaded from the link.
- It assumes that the user has a native installation of [Gradle](https://gradle.org/) or a [Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html) pattern may also be used.

## Installation

Clone the [GitHub Repository](https://github.com/sarkarchandan/ticketManagement5000) 
```sh
$ git clone  https://github.com/sarkarchandan/ticketManagement5000
$ cd ticketManagement5000
```

## Usage
### Import
- This implementation has been built using IntelliJ Idea but any IDE of user’s choice e.g. Eclipse can be used to import the project. Execute the corresponding gradle plug in to build the project workspace before importing.
```sh
$ gradle idea
```
OR
```sh
$ gradle eclipse
```
- Make sure that glassfish server container is running.
- Build the archive and deploy to the Container.
```sh
$ gradle build
$ gradle deploy
```

### Sample Outcome
I will soon update the sample outcomes from the implementation.
