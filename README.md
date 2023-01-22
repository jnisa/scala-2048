
<p align="center">
    <img src="./images/2048.png" width="100" height="100">
</p>

<h1 align="center"> 
  <strong>in Scala </strong>
</h1>

<div align="center">

  <a href="code coverage">![coverage](https://img.shields.io/badge/coverage-73%25-green)</a>
  <a href="tests">![tests](https://img.shields.io/badge/tests-37%20passed%2C%200%20failed-brightgreen)</a>
  <a href="scala version">![scala_version](https://img.shields.io/badge/scala-3.2.1-blue)</a>
  <a href="sbt version">![sbt_version](https://img.shields.io/badge/sbt-1.8.0-blue)</a>

</div>

## **1. Intro**

Here's a repository for the game 2048, implemented in Scala! This project was created as a challenge to introduce me to the Scala programming language and its features.

2048 is a popular puzzle game that challenges players to slide tiles on a grid to combine them and create a tile with the number 2048. This implementation of the game allows players to experience the game in a new way while also learning about the power and elegance of the Scala language.

## **2. Under the Hood**

Under the hood we've got the following methods to make the game work:

1. `Game Over recognition`: a function that receives a board game and evaluates if that board corresponds to an end of the game state or not;

2. `Right and Left move`: two functions that allow the player to move the board to the right-hand or left-hand side, sum all the matching cells, and add the points - that result from that move - to the scoreboard;

3. `Transpose`: this function is responsible for transposing the board game. With it you can reuse the right and left move functions (mentioned in the previous point), to create the move up and down functions.

Recurring to the methods mentioned above and some others, it was fairly straightforward to replicate the game in Scala.

## **3. TDD Approach**

TDD was used during the development stage of this project. This way we can guarantee that every single function developed performs as expected in different circumstances in scenarios with different complexity levels.
