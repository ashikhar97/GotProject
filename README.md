# GotProject

This project provides endpoints to users to access and use data of all the Got Battle: i.e Battle Name , Attackers of the Battle , Deffenders of the Battle along with their commanders with attacker and deffender sizes and outcomes etc.

The project has been buit using Springboot FrameWork with Mysql as Database , HIbernate JPA and JDBC to perform actions as required to process and return data.It scans and stores data after scanning and parsing CSV files to mysql database for further use.

Application has been deployed in the ec2 instance of AWS with public IP being:   ec2-18-207-156-14.compute-1.amazonaws.com

The Application uses JWT Token as an authentication layer to authenticate users before letting them use any of its APIs

To use the APIs of the application user has to generate JWT token by making a POST request to authenticate endpoint with request body 
{
"username":"gotproject"
"password":"password"
}
 where gotproject is the secret key
#ProjectStructure

The project is made up of different components:
1.Authentication 
2.CSV Reader
3.Controllers
4.Entities and Repositories
5.Response Objects
6.Service Layer to Process requests

![image](https://user-images.githubusercontent.com/100758716/156788111-ee13de1d-e30b-41a0-bedf-3f06f25a08ce.png)
