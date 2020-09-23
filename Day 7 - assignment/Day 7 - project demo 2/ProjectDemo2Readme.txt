Customer - It is an entity calss which defines attributes of a customer.

CustomerDao - It is a data layer interface which serves as guidlines for implementation.

CustomerDaoImpl - It is an implementation class of DAO interface.

CustomerService - It is a service layer class which invokes various methods of implementation class after getting data from user.

UserApplication - It is a UI layer class which acts as a communication medium between user and application.

CustomerFactoryMethod - It is a Factory method class to establish connection with the database.

CustomerExistsException - It is a data layer exception class, it's object is thrown in case if customer exists.


CustomerNotFoundException - It is a data layer exception class, it's object is thrown in case if customer not found.