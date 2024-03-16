# Amazon Management System with Hibernate JPA

This Java application is an Amazon management system built with Hibernate JPA for data persistence. It allows users to perform various operations such as saving, updating, deleting, and fetching user information related to both Amazon and Amazon Prime accounts.

## Table of Contents

1. [How to Use](#how-to-use)
2. [Input Format](#input-format)
3. [Dependencies](#dependencies)
4. [Project Structure](#project-structure)
5. [Notes](#notes)
6. [Contributors](#contributors)
7. [License](#license)

## How to Use

1. **Run the Application**: Execute the `App.java` file to start the application.
2. **Choose Action**: Follow the prompts on the console to select an action:
    - Enter `1` to save Amazon details.
    - Enter `2` to save Amazon Prime details.
    - Enter `3` to update Amazon details.
    - Enter `4` to update Amazon Prime details.
    - Enter `5` to delete an Amazon account.
    - Enter `6` to delete Amazon Prime details.
    - Enter `7` to fetch Amazon details.
    - Enter `8` to fetch Amazon Prime details.
    - Enter `9` to display all records.

## Input Format

- **Dates**: Use the format `dd-MM-yyyy`.
- **Phone Numbers**: Enter as numeric values.

## Dependencies

- **MySQL Connector/J**
  - Group ID: mysql
  - Artifact ID: mysql-connector-java
  - Version: 8.0.28

- **Hibernate Core**
  - Group ID: org.hibernate
  - Artifact ID: hibernate-core
  - Version: 5.6.15.Final

- **Hibernate Ehcache**
  - Group ID: org.hibernate
  - Artifact ID: hibernate-ehcache
  - Version: 5.6.15.Final
  
- **Hibernate Infinispan**
  - Group ID: org.hibernate
  - Artifact ID: hibernate-infinispan
  - Version: 5.6.15.Final

Ensure these dependencies are added to your `pom.xml` file in your Maven project.

## Project Structure

- **src/main/java**: Contains the Java source code files.
- **src/main/resources**: Contains the Hibernate configuration files, such as `hibernate.cfg.xml`.
- **pom.xml**: Maven project configuration file.

## Notes

- **Exception Handling**: Handle exceptions appropriately, especially for input/output operations and database transactions.
- **DTOs and DAOs**: Ensure that the necessary Data Transfer Object (DTO) and Data Access Object (DAO) classes are available and properly configured.

## Contributors

- shubham puri
- shubhampuri8297@gmail.com

## License
