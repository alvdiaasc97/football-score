## Football World Cup Score Board
This project is a Java implementation of a Live Football World Cup Score Board that allows you to start games, finish games, update scores and get a summary of games by total score.

## Installation

Clone the repository from GitHub:

```bash
  git clone https://github.com/alvdiaasc97/football-scoreboard.git

```

Open the project in your preferred Java IDE (such as Eclipse or IntelliJ IDEA).

Run the ScoreBoardTest file located in the test folder to test the implementation.

## Usage

To use the Football World Cup Score Board, create a new instance of the `ScoreBoard` class and call the appropriate methods to perform the desired operations:


```javascript
ScoreBoard scoreBoard = new ScoreBoard();

// Start a new game
scoreBoard.startGame("Mexico", "Canada");

// Update the score of a game
scoreBoard.updateScore("Mexico", "Canada", 2, 1);

// Finish a game
scoreBoard.finishGame("Mexico", "Canada");

// Get a summary of games by total score
List<String> summary = scoreBoard.getSummary();
System.out.println(summary);

```


This will output the following summary:

```
[]
```
