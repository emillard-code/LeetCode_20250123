package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void countServersTest() {

        int[][] grid1 = new int[][]{{1,0},{0,1}};
        assertEquals(0, LeetCodeSolution.countServers(grid1));

        int[][] grid2 = new int[][]{{1,0},{1,1}};
        assertEquals(3, LeetCodeSolution.countServers(grid2));

        int[][] grid3 = new int[][]{{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
        assertEquals(4, LeetCodeSolution.countServers(grid3));

    }

}
