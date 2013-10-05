Introduction to Test Driven Development
=======================================

What is TDD?
------------
Test Driven Development is a programming practice that combines Test First Development and Refactoring. This means that when we want to extend our program, we first write a failing unit test, write code to make the test pass, and then refactor.

Let's look at each of these steps in a little more detail.

**Write a failing unit test**  
For our purposes, a unit test is a small piece of code that verifies the behavior of a method in the class under test. Before we can write this test code we need to know what behavior we want to add and which class and method it will initially live in. 

Our test will have three parts: set the stage, take the action, and verify the result. These parts are know by several other names: "Given, When, Then" and "Arrange, Act, Assert".

_Set the stage_  
This is where we create and arrange the objects that are required to take the action that occurs in the next step. For instance, if we are testing the class *Foo* we would create an instance of *Foo* and instances of all its dependencies in the setup section of the test. This part of the test is also known as 'Arranging the objects' and the 'Given' section.

_Take the Action_  
Since we use unit tests to test a small amount of  behavior, we need to use that behavior. That means calling a method on the class we are testing. 

_Verify the result_

**Make the test pass**  
**Refactor**  

How should I do TDD?
--------------------


