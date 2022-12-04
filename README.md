# Damavis Snake Challenge

This repository contains the solution that I have developed to solve the Damavis Snake Challenge. In this challenge we are given rectangular board where we put an snake. Our goal is calculate the number of possible paths with a determined depth that our snake can do. In order to do this we are given the following input:

- **board**: board is a numeric array that represents the two dimension of the board. Board always have a length of 2, board[0] represents the numbers of rows and board[1] represents the number of columns of the board. It is guaranteed that 1 <= board[i] <= 10.
- **snake**: snake is a numeric bidimensional array that represents the positions of the snake on the board. Every single element of snake is an array with only two that represents one square of the board. It is guaranteed that snake[i] is going to be adjacent to snake[i + 1]. It is guaranteed that 3 <= snake.length <= 7. The snake only can do 4 posible movements (up, down, left and right). Our snake can only do a movement if and only if after doing that movement does not get out of the board and does not collide with another part of his body. 
- **depth**: depth is a number that represents the path depth. We are guaramteed that 1 <= depth <= 20.

As the output of our challenge we have to give a single number representing the number of possible paths. As long as this number can be huge we have to give the solution in modulo 10e9 + 7.

## Usage

To run the code simply use Java IDE with support for JUnit 5. In my case I have used IntelliJ.

## Tools

To solve this problem I have used the following tecnologies:
- Java: As the main programming language.
- JUnit5: As the framework used to do the testing.

## Solution

To develop this solution I have applied TDD. Mention that I have tried to follow the S and the D from the SOLID principles in order to have a more decoupled code. Also mention that although I would have used different data structures to represent some of the input of the challenge I have strictly followed Challengge's input and output requirements.

## The Algorithm

The main idea behind the algorithm that I have used to solve the problem is to search between all the possible paths that have the depth given as parameter. This can be seen into the following pseudo-code:

```
int calculateNumberOfSolutions(int[]board, int[][]snake, int depth) {
  if (depth == 0) return 1;
  numberOfSolutons = 0;
  
  for (Movement movement: posibleMovements)
    if (canDoMovement())
      numberOfSolutons += calculateNumberOfSolutions(board, applyMovement(snake), depth - 1);
  
  return numberOfSolutions;
}
```

As we can see when the depth reaches the value 0, it means that we have found a valid path. In consequence we return the value 1. About the time complexity of this algorithm, we can see that is O(4 ^ n) where n is the depth of the path. This is caused because our snake can do 4 posible movements. About the Space complexity of this solution we can see that is O(n * m) where n is the depth of the path and m is the length of the snake. This is caused because if we look at our algorithm, on every recursive call we are making a copy of the snake. This means that we are allocating m extra space.
