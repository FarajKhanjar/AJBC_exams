--Exam #7

/* Q[1]:
Display all the Products that have a lower price than the price of the Product with id number 4.
select * from Products
where UnitPrice < (select UnitPrice 
from Products 
where ProductID = 4) */


/* Q[2]:
Display the name and hire date of all the employees that got hired after the hire date of employee with id 6.
select LastName+' '+firstName  As 'Name', HireDate
from employees
where  HireDate > (select HireDate
from employees where EmployeeID = 6)*/  


/* Q[3]:
Display all product names and prices for products that have a lower price than all other prices of products from category number 7.
select ProductName, UnitPrice from Products
where UnitPrice < (select min(UnitPrice)
from Products
where CategoryID = 7)*/


/* Q[4]:
Display the details of the supplier that have the order with highest quantity (of all the items in the order) number of units on order.
select * from Suppliers 
where SupplierID =
(select SupplierID from Products
where UnitsOnOrder = (
select max(UnitsOnOrder) from products))*/




/* Q[5]:
Display the City, Company name, contact name for all customers and all suppliers but without any duplicated rows.*/
select CompanyName, ContactName, City 
from Customers
UNION
select CompanyName, ContactName, City 
from Suppliers
order by CompanyName, ContactName



   
