<<<<<<< HEAD
@signin
Feature: Validating Login page

  @signin_01
  Scenario: Verifying Register link
    Given The user is on signin page
    When The user clicks on register link on signin page
    Then The user redirected to Registration page from signin page

  @signin_02
  Scenario Outline: User on login page and login with invalid inputs "<username>" and "<password>"
    Given The user is on signin page
    When The user enter invalid "<username>" and "<password>"
    Then click login button to verify

    Examples: 
      | username | password |
      | user     |          |
      |          | passowrd |
      |          |          |

  @signin_03
  Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and <RowNumber>
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    Then click login button

    Examples: 
      |Sheetname  |RowNumber  |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |

  @signin_04
  Scenario: Verifying signout link
    Given The user is on signin page with valid username "Numpysdet84" and password "sdet84batch"
    When The user click signout button
    Then The user redirected to homepage
=======
@tag
Feature: DSAlgo user signin
  I want to use this template for my feature file

  Scenario Outline: Login keeping username and password fields empty
    Given user navigates to  sign-in page
    When user dont enter any credentials and click on login button
    Then It should display an error "Please fill out this field" below username field
   
   Scenario Outline: Login keeping password empty and filling username field
    Given user navigates to  sign-in page
    When user enters username and keep password field empty and click on login button
    Then It should display an error "Please fill out this field" below pwd field 
       
    Scenario Outline: Login with invalid Credentials
    Given user navigates to  sign-in page
    When user enters invalid username and password click on login button
    Then It should display an error "Invalid Username and Password" message
    
   Scenario Outline: Login with invalid user id and valid password combination
    Given user navigates to  sign-in page
    When user enters invalid username and valid password and clicks on login button
    Then It should display an error "Invalid Username and Password" message
   
   Scenario Outline: Login with valid user id and invalid password combination
    Given user navigates to  sign-in page
    When user enters valid username and invalid password and clicks on login button
    Then It should display an error "Invalid Username and Password" message
    
    Scenario Outline: Login with valid Credentials
    Given user navigates to  sign-in page
    When user enters valid username and password click on login button
    Then The user should be redirected to Home Page with the message "You are logged in" and with the user name on the top
    When The user clicks Sign out
    Then User will be logged out
    
    
>>>>>>> origin/master
