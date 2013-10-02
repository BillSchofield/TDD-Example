Introduction to Test Driven Development
=======================================

What is TDD?
------------
Test Driven Development is a programming practice that combines Test First Development and Refactoring. This means that when we want to extend our program, we first write a failing unit test, write code to make the test pass, and then refactor.

Let's look at each of these steps in a little more detail.

**Write a failing unit test**  
For our purposes, a unit test is a small piece of code that verifies the behavior of a method in the class under test. Before we can write this test code we need to know what behavior we want to add and which class and method it will initially live in. 

Our test will have three parts: setup, action, verification. These parts are know by many names, all of which describe the same concept.

_Setup_
This is where we create and arrange the objects that are required to take the action that occurs in the next step. For instance, if we are testing the class *Foo*  
**Make the test pass**  
**Refactor**  

How should I do TDD?
--------------------


