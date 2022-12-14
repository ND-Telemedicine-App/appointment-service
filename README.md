<h1>ND Telemedicine App - Appointment Service</h1>
<h2>RMIT SEPT 2022 Major Project Team 4</h2>

**Members:**
- Doan Yen Nhi (s3880599)
- Nguyen Hoang Linh (s3880313)
- Jack Dean (s3722961)
- Matthew Rigo (s3840775)
- Mingkai Wang (s3773115)

**Records**
- Github repository : https://github.com/ND-Telemedicine-App
- Jira Board : https://septteam4.atlassian.net/jira/software/projects/SEPTT4S/boards/3/roadmap?shared=&atlOrigin=eyJpIjoiMzI5YzNmOWIzODBhNDY1NThhYjAyODczM2NmM2EzNTYiLCJwIjoiaiJ9

**Code documentation - Release 1.0 Major changes & Features - Date: 5/9/22**
- Appointment Class
  + Attributes
  + Getters and setters
  + To String method
- Appointment Controller:
  + viewAppointmentById API
  + viewAppointmentOfPatient API
  + viewAppointmentOfDoctor API
  + createAppointment API
  + deleteAppointment API
- Appointment Service:
  + findbyId method
  + findByPatientId method
  + findByDoctorId method
- Appointment Repository:
  + findAppointmentById
  + findAppointmentsByPatientId
  + findAppointmentsByDoctorId

**Code documentation - Release 1.1 Major changes & Features - Date: 19/9/22**
- Appointment Class
  + Changed attributes of Appointment (Now includes start time and end time)
- Appointment Controller:
  + getAll API (Gets all appointments in database)
- AppointmentServiceApplicationTests:
  + Created various tests for the APIs
- All classes:
  + Debug and code cleanup
  + Created mock data

**Code documentation - Release 1.2 Major changes & Features - Date: 6/10/22**
- AppointmentServiceApplicationTests:
  + Test for createAppointment
  + Added comments for tests
- All classes:
  + Debug and code cleanup
  + CI Build and test

To run this service locally on MySQL:

1. Run mvn package to build project and create jar files
2. Add a Dockerfile with specific commands to allow for dockerization of service
3. Add heroku.yml file with specific commands to deploy the service on Heroku
4. Create a new app on Heroku, connect the app with this service's Github repo, change the app's stack to container
5. If the code is not on Github, push your code to Heroku's Container Registry using Heroku CLI
6. Set environment variables on Heroku like database link and username
7. Build and deploy service on Heroku. If done correctly, you can open and run the app
