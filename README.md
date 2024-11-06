2048 Game
Welcome to the 2048 Game repository! This is a Java-based implementation of the classic 2048 puzzle game, where players merge numbers to reach the target tile.

📜 Description
In 2048, the objective is to combine tiles with the same numbers to create higher-value tiles, eventually aiming to reach the 2048 tile (or beyond). This game is implemented in Java, making use of object-oriented principles to handle the game logic, board updates, and user input.

🎮 How to Play
Game Controls:
0: Move left
1: Move right
2: Move up
3: Move down
Objective:
Combine tiles by choosing moves to reach the highest tile possible.
The game is won when you create a tile with the value 2048 (but you can continue playing to reach even higher scores!).
Rules:
Each move shifts all tiles in the chosen direction.
Identical tiles that collide will merge into one tile with their combined value.
🚀 Getting Started
Prerequisites
Java: Ensure Java is installed on your system. Download Java here.
Installation
Clone the Repository:

bash
Copy code->
git clone https://github.com/curiousGeekAyon/Game-2048.git

cd Game-2048

Compile and Run the Game:

Compile the Java files:
bash
Copy code
javac src/*.java
Run the game:
bash
Copy code
java src.Main

🛠️ Features
User-friendly controls: Enter numbers to move tiles in any direction.
Random tile generation: Adds a 2 (or sometimes 4) tile in a random empty spot after each move.
Win and lose detection: Automatically ends the game when no moves are possible or the target tile is reached.

📚 Code Structure
Main.java: Entry point to start the game.
Board.java: Manages the game board, tile movements, and merging logic.
GameService.java: Handles game mechanics, checks win/lose conditions, and processes moves.

🔍 Future Enhancements
Add a graphical user interface (GUI) for a more interactive experience.
Implement score tracking and high-score saving.
Enable undo functionality to revert the last move.
🤝 Contributions
Contributions, issues, and feature requests are welcome! Feel free to fork this repo and make improvements.

📄 License
This project is licensed under the MIT License. See the LICENSE file for details.

This README gives users an overview of the game and instructions on how to play, run, and contribute. Let me know if you'd like any adjustments!
