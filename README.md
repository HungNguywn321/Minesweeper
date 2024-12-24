# MineSweeper Game


##### Topic Project: MineSweeper Game

![image](https://github.com/bachtung2003/mine-sweeper-game/assets/91307850/51e6f412-2b2a-47e0-91af-a184a1533f9f)



## 📖 About The Game

### 📜 Introduction
Minesweeper is a popular single-player computer puzzle game invented in the 1970s.
When the game starts, the player is given an R×C rectangular grid of covered squares or cells. A fixed number of N mines are randomly placed on the RxC unit and hidden from the player. The game starts in an empty field. Each player has his own starting position. Players open (by clicking) one field at a time. If there is a mine in the field, the player will explode and the game will be over. Otherwise, a box containing a single value between 0 and 8 will be displayed. The number of mines in this area is 0 and the displayed value is empty. This value represents the total number of mines adjacent (horizontally, vertically and diagonally) to the uncovered area. The object of the game is to discover all areas that are free of mines.

### 🎯 Rules

- The board is a two-dimensional space of NXM cells, which has a predetermined number of mines.
- Each cell has 4 properties:
    - Closed or open.
    - Are there mines or not?
    - Number of mines around.
    - Is it marked or not?
- There are 2 mouse interactions with each cell:
    - Left click to open the box. Then the value of the cell is displayed.
    - Right-click to highlight a cell that you believe contains a mine.
- When the cell is opened, there are three possible values:
    - If that cell has a mine, the mine image is displayed, all cells are opened and the game ends.
    - If that box has a number, that is the number of mines around. The number of surrounding cells is 8, or 5 (if the cell is on the edge), or 3 (if the cell is in the corner).
    - If there are no mines around that cell, or in other words the number of mines around is 0, the displayed value is empty.
- We can only highlight a cell with the right mouse button when the cell is in the closed state. Click the first time to mark, click again to unmark.
- The player wins when the number of unopened cells is exactly equal to the number of mines, and loses when the player opens a cell containing mines.


