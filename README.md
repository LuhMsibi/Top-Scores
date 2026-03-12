Top Scorers Project
Overview

This project implements a program that reads a CSV file containing people’s names and their test scores, identifies the top scorers, and outputs them along with their scores. The project is built in Java using Spring Boot and includes:

Manual CSV parsing from a string (no standard CSV library used)

Display of top scorers in alphabetical order

RESTful API endpoints for interacting with scores

Note: Due to machine performance, the database integration and POST/GET endpoints were planned but not fully implemented yet. These steps will be added in the next iteration.

Features Implemented

CSV Parsing

Reads TestData.csv from the resources folder

Parses CSV manually without using libraries

Stores the parsed data temporarily for processing

Top Scorers Calculation

Determines the highest score(s) in the CSV

Outputs the names of top scorers in alphabetical order along with their score

Example Output on Console:

Top Scorers:
George Of The Jungle
Sipho Lolo
Score: 78

API Testing (Partially Completed)

Tested top scorer retrieval via GET endpoint:

http://localhost:8080/api/scores/top

Example JSON returned:

[
  {
    "firstName": "Sipho",
    "secondName": "Lolo",
    "score": 78
  },
  {
    "firstName": "George",
    "secondName": "Of The Jungle",
    "score": 78
  }
]
Project Structure
topscorer
│
├── src/main/java/com/lungisani/topscorer
│    ├── controller
│    │     ScoreController.java
│    ├── service
│    │     CsvService.java
│    │     ScoreService.java
│    ├── model
│    │     Score.java
│    └── repository
│          ScoreRepository.java
└── src/main/resources
      └── application.properties
      └── data/TestData.csv
Next Steps (Planned)

Database Integration

Store scores in a local H2/Postgres database

Map Score entity to a database table

API Endpoints

POST /api/scores — add new scores to the database

GET /api/scores/person?firstName=…&secondName=… — retrieve scores of a specific person

Security Implementation

Use Spring Security with JWT or API keys to secure POST/GET endpoints

Cloud Hosting

Deploy the API to AWS Elastic Beanstalk / Azure App Service / GCP Cloud Run

Database hosted on AWS RDS / Azure SQL / GCP Cloud SQL

Frontend (optional) hosted on S3 / Azure Blob / Firebase Hosting

How to Run

Clone Repository

git clone <your-repo-url>
cd topscorer

Run Project

./mvnw spring-boot:run

or run TopScorerApplication.java in your IDE.

Test API

Open browser or use Postman:

http://localhost:8080/top-scorers
You should see the top scorers in JSON format.

Console Output

After starting the application, the console will show:

CSV data imported to database.
Top Scorers:
George Of The Jungle
Sipho Lolo
Score: 78
