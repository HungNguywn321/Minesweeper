# MineSweeper Game


##### Topic Project: MineSweeper Game

 


## 📖 About The Game

### 📜 Introduction
Minesweeper is a popular single-player puzzle game invented in the 1970s. When the game starts, the player is given an R×C rectangular grid of covered squares or cells. A fixed number of N mines are randomly placed on the grid and hidden from the player. The game begins with an empty field, and each player has their own starting position. Players open one field at a time by clicking. If there is a mine in the field, the player will explode and the game ends. Otherwise, a value between 0 and 8 will be displayed. If the value is 0, the field remains empty. This number represents the total number of mines adjacent to the uncovered field (horizontally, vertically, and diagonally). The goal of the game is to discover all areas that are free of mines.

🎯 Rules
The board is a two-dimensional space with N rows and M columns, containing a predetermined number of mines.
Each cell has 4 properties:
Closed or open.
Whether it contains a mine or not.
The number of mines around it.
Whether it is marked or not.
There are two mouse interactions with each cell:
Left-click to open the cell. The value of the cell will then be displayed.
Right-click to mark a cell that you believe contains a mine.
When a cell is opened, there are three possible outcomes:
If the cell contains a mine, a mine image is displayed, all cells are opened, and the game ends.
If the cell has a number, it represents the number of mines around it. The number of surrounding cells can be 8 (if the cell is not on the edge), 5 (if the cell is on the edge), or 3 (if the cell is in the corner).
If there are no mines around the cell, the value displayed will be empty.
A cell can only be marked with the right mouse button when it is closed. Clicking once marks the cell, and clicking again unmarks it.
The player wins when the number of unopened cells is exactly equal to the number of mines, and loses when the player opens a cell containing a mine.
