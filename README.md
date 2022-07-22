# Final Thesis for autoTesting
### Testing webPage Benu vaistine
#### reference: https://www.benu.lt/
#### packages used:
    * TestNG `org.testng:testng`
    * Selenium `org.seleniumhq.selenium:selenium-java`
    * WebDriverManager `io.github.bonigarcia:webdrivermanager`

# Tests:
### TS-C1 Test search function:
###### steps:
    * enter item in search field; (entry value "vitaminas c")
    * click search icon;
    * check if correct item appears in results. 


### TS-C2 Test login function with invalid entries:
###### steps:
    * enter invalid data in mandatory fields:
    ** enter invalid email address,
    ** enter invalid password;
    * expected result - login is unsuccessfull.

### TS-C3 Test register new user :
###### steps:

    * enter valid data in mandatory fields:
    ** enter name,
    *+ enter surname,
    *+ enter email,
    ** enter phone number,
    ** enter birth date,
    ** enter password,
    ** enter password again,
    ** check privacy policy,
    * click button register;
    * expected result - registration is successfull.

### TS-C4 Test shopping cart:
###### steps:

     * go to sale;
     * put item from sale to a cart;
     * go to check if item is added to a cart;
     * expected result - item in the cart.

### TS-C5 Test find pharmacy:
###### steps:

      * click on Pharmacy Search;
      * choose city from the list;
      * check box On Duty 24/7;
      * click on Result;
      * expexted result - opened window with information.

   