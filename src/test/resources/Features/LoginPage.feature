Feature: Verifying Adactin Details
Scenario Outline: Verifying adactin login with valid credentials.
Given User is on the adactin page
When User should enter "<username>""<password>"
And User should click login button
And User should select "<location>" ,"<hotel>" ,"<roomType>" ,"<noOfRoom>" ,"<checkIn>" ,"<checkOut>","<adults>","<childs>"
Then User should verify "Select Hotel" message    
Examples:
|username|password|location|hotel|roomType|noOfRoom|checkIn|checkOut|adults|childs|
|SheebaBuvana|Sheeba@24|New York|Hotel Sunshine|Deluxe|2 - Two|25/01/2022|26/01/2022|1 - One|1 - One|

Scenario Outline:








 
 
 
 
 
 
 
 
 
