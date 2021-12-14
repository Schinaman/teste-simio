
# Teste Símios - Mercado Livre

## Overview
The project runs through an RESTful API and checks whether a DNA sequence belongs to a human or a simian. <br>
It will be simian, if a DNA has one or more sequences of four identical characters in horizontal, vertical or any diagonals. 
![alt text](https://github.com/Schinaman/teste-simio/blob/main/isSimian.jpg?raw=true)

## Restrictions:
*Characters in sequence msut be only: (A, T, C, G) , which represents each nitrogenous base of the DNA. <br>
*Array must be square table (NxN). <br>
*Array dimensions must be greater than or equal to 4.<br>

Any of those exceptions will return: "HTTP 403-FORBIDDEN" status.

## Endpoints

**POST** <br>
Responsible for send the genetic sequence: <br>
https://testesimian-meli.herokuapp.com/simian

<br>
Body format follows the example bellow: <br>

```
 { 
 "dna": ["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"]
 }
```

In case of success the response will return "HTTP 200-OK" status. <br>
The Hibernate, JPA implementation persists all the data on Postgres database hosted on heroku. <br>

<br>

__GET__ <br>
The GET method return statistics based on database. <br>
https://testesimian-meli.herokuapp.com/stats <br>

Response example:

```
{
  "count_mutant_dna": 25,
  "count_human_dna": 25,
  "ratio": 1.0
} 
```


## Test environment

Change profile to "test" in the "application.properties" file. <br>
Test environment database uses Spring Boot - H2 Database <br> 
It can be accessed from the following URI: <br>
//localhost:&#60;port&#62;/h2-console/


