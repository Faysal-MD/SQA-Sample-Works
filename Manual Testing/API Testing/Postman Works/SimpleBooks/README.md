# SimpleBooks

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
1. ### Get API Status
  	> Verify Status code is 200
2. ### Get Book List
	> Verify that books are shown
  	> Verify Status code is 200

3. ### Get a Book 
  	> Verify that book is shown
  	> Verify Status code is 200

4. ### Token
	> Generate Token

5. ### Create a Order
   > In the test case you need to validate the following field values:
     1. > bookId
     2. > customerName
     3. > Verify Status code is 201
        
6. ### Get Order List 
	  > Verify that all orders are shown
	  > Verify Status code is 200

7. ### Get a Order 
	  > Verify that the specific order is shown
	  > Verify Status code is 200
  
8. ### Update Order
	> In the test case you need to validate the following field values:
	1. > Successfull message
	2. > Response Time below 350ms

9. ### Order Status after Update
	> In the test case you need to validate the following field values:
	1. > bookId
	2. > customerName
	3. > createdBy
	4. > quantity
	5. > timestamp

10. ### Delete Booking
	> Verify Status code
 

