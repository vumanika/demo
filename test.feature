Feature: ConferenceRegistration
Scenario: Registering for the Conference
Given Open Webpage
When I enter firstname empty 
Then I enter my firstname as MANI
When I enter lastname empty 
Then I enter my lastname as KANTA
When email format wrong 
Then my email as abc@gmail.com
When contact number wrong 
Then entered contact number as 7842280695
When number of people attending none 
Then no of people attended are 3
When address1 of building is empty  
Then Correct Address1 is YashodaComplex
When address2 of building is empty 
Then Address2 is Guntur
When Entering city is empty 
Then City is Bangalore
When State column is empty 
Then name of the State is Telangana
When membership not selected
Then clicking on membership as a member

When CardHoldername is empty 
Then name of the card holder name is Vunnam

When debitcardnumber is empty 
Then debit card number is 21547852444

When cvv is empty 
Then cvv number is 215

When card expiration month 
Then expiration month is january

When card expiration year 
Then Year of expiration is 2022