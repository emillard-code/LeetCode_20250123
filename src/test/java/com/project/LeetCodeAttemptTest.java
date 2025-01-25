package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void countServersThatCommunicateTest() {

        int[][] grid1 = new int[][]{{1,0},{0,1}};
        assertEquals(0, LeetCodeAttempt.countServersThatCommunicate(grid1));

        int[][] grid2 = new int[][]{{1,0},{1,1}};
        assertEquals(3, LeetCodeAttempt.countServersThatCommunicate(grid2));

        int[][] grid3 = new int[][]{{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
        assertEquals(4, LeetCodeAttempt.countServersThatCommunicate(grid3));

    }

}
