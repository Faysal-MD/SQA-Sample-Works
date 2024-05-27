# TicketSystem

## Technology used:
- Postman
- Newman


## How to run this project
- Clone this project
- Open with Postman / Command Shell

### Newman and Report Installation Process:
- Newman Install Command:
```console
npm install -g newman
```
- Newman Html Report Install Command:
```console
npm install -g newman-reporter-htmlextra
```
- Run Command for Report: 
```console 
newman run SimpleBooks.postman_collection.json -e SimpleBooksEnv.postman_environment.json -r cli,htmlextra
```


## Test case list:
1. ### Create Booking
	1. > Verify Status code is 200
2. ### Booking Status
	> In the test case you need to validate the following field values:
	1. > First Name
	2. > Last Name
	3. > Total Price
	4. > Deposit Paid
	5. > Checkin Date
	6. > Checkout Date
	7. > Additional Needs
	8. > Response Time below 350ms

3. ### Token
	> Generate Token
  
4. ### Update Booking
	> In the test case you need to validate the following field values:
	1. > Successfull message
	2. > Response Time below 350ms

5. ### Booking Status after Update
	> In the test case you need to validate the following field values:
	1. > First Name
	2. > Last Name
	3. > Total Price
	4. > Deposit Paid
	5. > Checkin Date
	6. > Checkout Date
	7. > Additional Needs
	8. > Response Time below 350ms 

6. ### Delete Booking
	> Verify Status code

