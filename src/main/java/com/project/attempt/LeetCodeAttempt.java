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

    // This method returns the number of servers that
    // are able to communicate with another server.
    public static int countServersThatCommunicate(int[][] grid) {

        // int commServers will contain the number of servers that can communicate with another.
        int commServers = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                // For every server in the grid, we will call a helper method that checks
                // whether or not this server can communicate with another. If it can, then
                // we increment int commServers to indicate this.
                if (grid[i][j] == 1 && checkServer(grid, i, j)) { commServers++; }

            }

        }

        // Once we tested all servers in the grid and added all that are capable of
        // communication, we return the total value that int commServers has accumulated.
        return commServers;

    }

    // This is a helper method to check if the server at the
    // specified index can communicate with another server or not.
    private static boolean checkServer(int[][] grid, int x, int y) {

        // We iterate through all indexes in the same column to see if there's any other servers.
        // If yes, then return true as the original server has another to communicate with.
        for (int i = 0; i < grid.length; i++) {

            if (grid[i][y] == 1 && i != x) { return true; }

        }

        // We iterate through all indexes in the same row to see if there's any other servers.
        // If yes, then return true as the original server has another to communicate with.
        for (int i = 0; i < grid[x].length; i++) {

            if (grid[x][i] == 1 && i != y) { return true; }

        }

        // If we couldn't find anything in the same row or column, return false.
        return false;

    }

}
