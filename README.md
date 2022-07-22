# Final Thesis for autoTesting
#### webPage: https://www.benu.lt/
#### packagesUsed 
* TestNG `org.testng:testng`
* Selenium `org.seleniumhq.selenium:selenium-java`
* WebDriverManager `io.github.bonigarcia:webdrivermanager`

# Tests:
TS-C1 Test search function:

    * enter item in search field; (entry value "vitaminas c")
    * click search icon;
    * check if correct item appears in results. 


TS-C2 Test login function with invalid entries:

    * enter invalid data in mandatory fields:
    ** enter invalid email address,
    ** enter invalid password;
    * expected result - login is unsuccessfull.

TS-C3 Test register new user :

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

TS-C4 Test shopping cart:


TS-C5 Test wishlist:
   