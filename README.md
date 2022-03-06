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


APIs Exposed:-
1. authenticate
1.1 POST /authenticate
This Api is used to generate JWT token to be used for further access of the application APIs
REQUEST: { "username": "gotproject", "password":"password" }
RESPONSE
STATUS CODE - 200: OK
RESPONSE MODEL - application/json { "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJnb3Rwcm9qZWN0IiwiZXhwIjoxNjQ3MzAyNjExLCJpYXQiOjE2NDY0MDI2MTF9.RNNoJMq3FpNeVnDKg8CzwziOfnB-R7Od8leo6k7cWddXzkgfp_YjGOvV9kj8R1iqvKVJeBwX9W9YOSJOe-5LCA" }
2.count
1.1 GET /count
This Api is used to get count of different records in the Got Project
REQUEST
http://ec2-18-207-156-14.compute-1.amazonaws.com:8081/count
REQUEST HEADER – Authorization : Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJnb3Rwcm9qZWN0IiwiZXhwIjoxNjQ3MjEwNDkyLCJpYXQiOjE2NDYzMTA0OTJ9.G8wox7HFhXtRYM7L9-DXM_nS3DZ_v-5P6y9-vIQ2pE_CzjXYnQtHjZcZZ25rIPIwsb9NeQHx67E613Z15mrRgA
RESPONSE
STATUS CODE - 200: OK
RESPONSE MODEL - application/json { "totalNumberOfBattles": 38, "totalNumberOfAttackers": 12, "totalNumberOfAttackerCommanders": 50, "totalnumberOfDefenders": 17, "statusMessage": "Request Processed Successfully", "totalNumberOfDefenderCommanders": 50 }
2.details
1.1 GET /details/{battleid}
This Api is used to get all details of a particular battle by providing battle id in the request URL
REQUEST-
{battleid} = Integer battle id( 0-38 records)
http://ec2-18-207-156-14.compute-1.amazonaws.com:8081/details/2
REQUEST HEADER – Authorization : Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJnb3Rwcm9qZWN0IiwiZXhwIjoxNjQ3MjEwNDkyLCJpYXQiOjE2NDYzMTA0OTJ9.G8wox7HFhXtRYM7L9-DXM_nS3DZ_v-5P6y9-vIQ2pE_CzjXYnQtHjZcZZ25rIPIwsb9NeQHx67E613Z15mrRgA
RESPONSE
STATUS CODE - 200: OK
RESPONSE MODEL - application/json { "getallDetailsResponse": [ { "battle_name": "Battle at the Mummer Ford", "attacker_outcome": "win", "attacker_size": null, "battle_type": "ambush", "deffender_size": "120", "major_capture": "0", "major_death": "1", "attacker_king": "Joffrey/Tommen Baratheon", "deffender_king": "Robb Stark", "summer": "1", "defender_name": "Baratheon", "year": "298", "attacker_Name": "Lannister", "attackerCommander": null } ], "attackerCommander": [ { "attacker_commander_name": "Gregor Clegane" } ], "deffenderCommander": [ { "deffender_commander_name": "Edmure Tully" } ] }
2.regions
1.1 GET /regions
This Api is used to generate JWT token to be used for further access of the application APIs
REQUEST-
http://ec2-18-207-156-14.compute-1.amazonaws.com:8081/regions
REQUEST HEADER – Authorization : Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJnb3Rwcm9qZWN0IiwiZXhwIjoxNjQ3MjEwNDkyLCJpYXQiOjE2NDYzMTA0OTJ9.G8wox7HFhXtRYM7L9-DXM_nS3DZ_v-5P6y9-vIQ2pE_CzjXYnQtHjZcZZ25rIPIwsb9NeQHx67E613Z15mrRgA
RESPONSE
STATUS CODE - 200: OK
RESPONSE MODEL - application/json
{ "distinctRegion": [ "Golden Tooth", "Mummers Ford", "Riverrun", "Green Fork", "Whispering Wood", "Darry", "Moat Cailin", "Deepwood Motte", "Stony Shore", "Torrhens Square", "Winterfell", "Oxcross", "Storms END", "Red Fork", "Harrenhal", "Crag", "Kings Landing", "Duskendale", null, "Ruby Ford", "The Twins", "Seagard", "Castle Black", "Saltpans", "Shield Islands", "Ryamsport, Vinetown, Starfish Harbor", "Dragonstone", "Raventree" ], "distinctlocation": [ "Golden Tooth", "Mummers Ford", "Riverrun",
"Green Fork", "Whispering Wood", "Darry", "Moat Cailin", "Deepwood Motte", "Stony Shore", "Torrhens Square", "Winterfell", "Oxcross", "Storms END", "Red Fork", "Harrenhal", "Crag", "Kings Landing", "Duskendale", null, "Ruby Ford", "The Twins", "Seagard", "Castle Black", "Saltpans", "Shield Islands", "Ryamsport, Vinetown, Starfish Harbor", "Dragonstone", "Raventree" ] }



To access the above APIs user would have to pass in the header a token generated through authenticate POST API with the given body.

Formate of passing header :

Key              Value
Authorization    Bearer {generated_token}

Token should be placed after Bearer key follewed by a space.
