package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[][] grid1 = new int[][]{{1,0},{0,1}};
        System.out.println(countServersThatCommunicate(grid1));

        int[][] grid2 = new int[][]{{1,0},{1,1}};
        System.out.println(countServersThatCommunicate(grid2));

        int[][] grid3 = new int[][]{{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
        System.out.println(countServersThatCommunicate(grid3));

    }

    public static int countServersThatCommunicate(int[][] grid) {

        int commServers = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1 && checkServer(grid, i, j)) { commServers++; }

            }

        }

        return commServers;

    }

    private static boolean checkServer(int[][] grid, int x, int y) {

        for (int i = 0; i < grid.length; i++) {

            if (grid[i][y] == 1 && i != x) { return true; }

        }

        for (int i = 0; i < grid[x].length; i++) {

            if (grid[x][i] == 1 && i != y) { return true; }

        }

        return false;

    }

}
