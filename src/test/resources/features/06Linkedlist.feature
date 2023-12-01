@tag
Feature: LinkedList Page
Background: 
<<<<<<< HEAD

Given The user is in the Linkedlist page after loggedin


Scenario: Introduction Page
    
    When The user clicks Introduction button
    And The user clicks Try Here button in Introduction Page
    Then The user should be redirected to a page having an tryEditor with a Run button test 
    
    

  Scenario Outline: Creating Linked list Page
    
    When The user clicks Creating a Linked List button
    And The user clicks Try Here button in Creating Linked list Page
    Then The user should be redirected to a page having an tryEditor with a Run button test 
    
=======
Given The user is in the Linkedlist page after loggedin
 
  Scenario: Introduction Page
    
    When The user clicks Introduction button
    Then The user should be directed to Linked list page
    And The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button test
    

  Scenario Outline: Creating a Linked list Page
    
    When The user clicks Creating a Linked List button
    Then The user should be directed to Creating a Linked list page
    And The user clicks Try Here button1
    Then The user should be redirected to a page having an tryEditor with a Run button test1
>>>>>>> origin/master
    

  Scenario Outline: Types of Linked list Page
    
    When The user clicks Types of Linked List button
<<<<<<< HEAD
    And The user clicks Try Here button in Types of Linked list Page
    Then The user should be redirected to a page having an tryEditor with a Run button test 
=======
    Then The user should be directed to Types a Linked list page
    And The user clicks Try Here button2
    Then The user should be redirected to a page having an tryEditor with a Run button test2
>>>>>>> origin/master
  
 
   Scenario Outline: Implement Linked list in Python 
    
    When The user clicks Implement Linked List in Python button
<<<<<<< HEAD
    And The user clicks Try Here button in Implement Linked list in Python
   Then The user should be redirected to a page having an tryEditor with a Run button test  
=======
    Then The user should be directed to Implement Linked list in python page
    And The user clicks Try Here button3
    Then The user should be redirected to a page having an tryEditor with a Run button test3 
    
>>>>>>> origin/master

 Scenario Outline: Traversal Page
    
    When The user clicks Traversal button
<<<<<<< HEAD
    And The user clicks Try Here button in Traversal Page
    Then The user should be redirected to a page having an tryEditor with a Run button test 
=======
    Then The user should be directed to Traversal Page
    And The user clicks Try Here button4
    Then The user should be redirected to a page having an tryEditor with a Run button test4
>>>>>>> origin/master
    
  
 Scenario Outline: Insertion Page
    
    When The user clicks Insertion button
<<<<<<< HEAD
    And The user clicks Try Here button in Insertion Page
    Then The user should be redirected to a page having an tryEditor with a Run button test 
=======
    Then The user should be directed to Insertion Page
    And The user clicks Try Here button5
    Then The user should be redirected to a page having an tryEditor with a Run button test5
>>>>>>> origin/master
    
 
 Scenario Outline: Deletion Page and Practise Questions
    
    When The user clicks Deletion button
<<<<<<< HEAD
    And The user clicks Try Here button in Deletion Page
    Then The user should be redirected to a page having an tryEditor with a Run button test 
    Then The user navigates back and clicks Practise Questions button
=======
    Then The user should be directed to Deletion Page
    And The user clicks Try Here button6
    Then The user should be redirected to a page having an tryEditor with a Run button test6 
    Then The user clicks Practise Questions button
 

    
    
    
    
     
   
>>>>>>> origin/master
