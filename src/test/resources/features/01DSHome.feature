@tag
Feature: DS-AlGO Project

Scenario: Navigate to portal page 
    Given The user opens DS-Algo portal link
    Given  The user clicks the Get Started button
    Then  The user should be redirected to homepage
    When  The user clicks get started button
    Then  the user get alert message 
    When  The user clicks Data structure drop down
    When  The user selects any data structures item from dropdown without sign in
    Then  It should alert the user with a message You are not Logged in.
    When  The user clicks Sign in
    Then  The user should be redirected to Sign in page
    Given The user navigates to Homepage
    When  The user clicks Register 
    Then  The user should be redirected to Register form 