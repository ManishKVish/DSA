package com.dsa.java.dsa1;

import java.util.ArrayList;

public class RatInMaze { 
    static void findPath(int currentRow, int currentColumn, int destinationRow, int destinationColumn,String currentPath,
        ArrayList<String> allPossiblePaths,
            int[][] maze
    ) {
        // Destination reached
        if(currentRow == destinationRow && currentColumn == destinationColumn) {
            allPossiblePaths.add(currentPath);
            return;
        }
        // Invalid conditions
        if(currentRow < 0 || currentColumn < 0 ||currentRow > destinationRow || currentColumn > destinationColumn ||
           maze[currentRow][currentColumn] == 0) {
            return;
        }

        // Mark current cell visited
        maze[currentRow][currentColumn] = 0;

       findPath(currentRow + 1, currentColumn, destinationRow, destinationColumn, currentPath + "D", allPossiblePaths, maze);
       findPath(currentRow, currentColumn - 1, destinationRow, destinationColumn, currentPath + "L", allPossiblePaths, maze);
       findPath(currentRow, currentColumn + 1, destinationRow, destinationColumn, currentPath + "R", allPossiblePaths, maze);
       findPath(currentRow - 1, currentColumn, destinationRow, destinationColumn, currentPath + "U", allPossiblePaths, maze);
        // Backtracking
        // Unmark current cell
        maze[currentRow][currentColumn] = 1;
    }


    static ArrayList<String> getAllPaths(int[][] maze){

        ArrayList<String> allPossiblePaths =
                new ArrayList<>();


        int matrixSize = maze.length;

        int startRow = 0;
        int startColumn = 0;

        int destinationRow =
                matrixSize - 1;

        int destinationColumn =
                matrixSize - 1;


        // If starting point blocked
        if(maze[startRow][startColumn] == 0){

            return allPossiblePaths;
        }


        findPath(
                startRow,
                startColumn,
                destinationRow,
                destinationColumn,
                "",
                allPossiblePaths,
                maze
        );

        return allPossiblePaths;
    }


    public static void main(String[] args) {

        int[][] maze = {

                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };

        ArrayList<String> result =
                getAllPaths(maze);

        System.out.println(
                "Possible Paths:"
        );

        for(String path : result){

            System.out.println(path);
        }
    }
}