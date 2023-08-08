This is a simple REST API which includes basic CRUD functionality, there is no frontend to this so I had used postman to 
test the CRUD functions, there is a EmployeeService interface which is implemented in the EmployeeServiceImplementation 
to mimic JPARepository functionality.

I then inject the Service interface into the Controller class to implement find all users, find a specific user with @PathVariables,
which allows us to retrive a single variable via a GET method, using an endpoint I insert into postman it will return a specific Employee.

I can also create a user with the save method that makes use of @RequestBody which binds to an object and when I make a HTTP Request using 
Postman with the details linked to the specific fields that were in the Employee class, it had inserted the information into the 
database with the EmployeeService save method. Same story applies with the modifyEmployee method however this has a @PutMapping method 
which updates the details instead of posting the details with the @PostMapping method. 

Finally, there is the deleteEmployee method which features the @DeleteMapping method, also contains the @PathVariable in the parameter
with a variable of employeeID, we pass this through the parameters of the employeeService method so that it picks out the specific ID 
and then deletes it. 
