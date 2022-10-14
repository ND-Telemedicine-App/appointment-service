**RMIT SEPT 2021 Major Project Team 4**

**Members:**
-Doan Yen Nhi (s3880599)
-Nguyen Hoang Linh (s3880313)
-Jack Dean (s3722961)
-Matthew Rigo (s3840775)
-Mingkai Wang (s3773115)

**Records**
Github repository : https://github.com/ND-Telemedicine-App
jira Board : https://septteam4.atlassian.net/jira/software/projects/SEPTT4S/boards/3/roadmap?shared=&atlOrigin=eyJpIjoiMzI5YzNmOWIzODBhNDY1NThhYjAyODczM2NmM2EzNTYiLCJwIjoiaiJ9

**Code documentation - Release 1.0 Major changes & Features - Date: 5/9/22**
- Appointment Class
  > Attributes
  > Getters and setters
  > To String method
- Appointment Controller:
  > viewAppointmentById API
  > viewAppointmentOfPatient API
  > viewAppointmentOfDoctor API
  > createAppointment API
  > deleteAppointment API
- Appointment Service:
  > findbyId method
  > findByPatientId method
  > findByDoctorId method
- Appointment Repository:
  > findAppointmentById
  > findAppointmentsByPatientId
  > findAppointmentsByDoctorId

**Code documentation - Release 1.1 Major changes & Features - Date: 19/9/22**
- Appointment Class
  > Changed attributes of Appointment (Now includes start time and end time)
- Appointment Controller:
  > getAll API (Gets all appointments in database)
- AppointmentServiceApplicationTests:
  > Created various tests for the APIs
- All classes:
  > Debug and code cleanup
  > Created mock data

**Code documentation - Release 1.2 Major changes & Features - Date: 6/10/22**
- AppointmentServiceApplicationTests:
  > Test for createAppointment
  > Added comments
- All classes:
  > Debug and code cleanup
  > CI Build and test

To run this service locally on MySQL:

1. Setup localhost in MySql Workbench
2. Create new schema nd-telemedicine-app
3. Go to target/classes/application.properties and Edit "spring.datasource.password" field with your own MySql Password
4. Run "AppointmentServiceApplication" located: src/main/java/com/team4/appointment_service
5. If done correctly you can refresh schemas and there should be a new tab