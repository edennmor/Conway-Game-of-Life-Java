The files implement Conway’s Game of Life in Java, including full logic for computing successive generations of a cell grid based on neighbor rules and real-time visualization using the StdDraw graphics library. The NextGeneration class evaluates cell states according to live-neighbor counts, while GameOfLife runs the simulation loop and renders each generation frame-by-frame. The project demonstrates the integration of algorithmic logic, matrix handling, and interactive graphical rendering.





# Conway's Game of Life – Java

## Overview
This project is a Java implementation of Conway’s Game of Life, featuring a simple 2D visualization using the `StdDraw` graphics library.  
It simulates a grid of cells that evolve over discrete time steps according to classic Game of Life rules, and renders each generation on screen.

## Project Structure
- `GameOfLife.java`  
  - Main entry point of the application.  
  - Configures the drawing canvas, initializes the cell grid, and runs the simulation loop.  
  - Uses a boolean matrix to represent live/dead cells, seeds the grid, and repeatedly computes and displays new generations.

- `NextGeneration.java`  
  - Contains the core logic for computing the next generation of the grid.  
  - Implements:
    - `nextGeneration(boolean[][] cells)` – returns a new grid based on the current one.
    - `numberOfNeighbors(...)` – counts live neighbors for each cell.
    - `checkCell(...)` and `isInside(...)` – safe access and boundary checks for the grid.
  - Encapsulates Conway’s rules (survival with 2–3 neighbors, birth with exactly 3 neighbors).

- `stddraw/StdDraw.java`  
  - Third-party utility class (from Princeton’s introcs library) used for drawing lines, squares, and text to the screen.  
  - Handles low-level window, coordinate system, and rendering details.

## How It Works
1. A 2D boolean array represents the cell grid (`true` = alive, `false` = dead).
2. The grid is initialized (e.g., with a random pattern of live cells).
3. For each iteration (generation):
   - `NextGeneration.nextGeneration(...)` calculates the next grid state based on neighbor counts.
   - `GameOfLife` clears the canvas, draws the grid lines, and then draws filled squares for every live cell.
   - The program pauses briefly between frames to create an animation effect.

The simulation visually shows how patterns emerge, move, stabilize, or disappear according to the Game of Life rules.

## Requirements
- Java Development Kit (JDK) 8 or later.

## Compilation & Execution

Make sure the `StdDraw.java` file is located in a `stddraw` directory that matches its package declaration:

```bash
src/
  GameOfLife.java
  NextGeneration.java
  stddraw/
    StdDraw.java

javac stddraw/StdDraw.java NextGeneration.java GameOfLife.java
java GameOfLife

gameOfLife(240, 10);
