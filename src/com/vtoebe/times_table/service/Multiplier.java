package com.vtoebe.times_table.service;

public class Multiplier {
    int[] timesTable = new int[9];

    public int[] multiply(int number){
        for (int i = 0; i < 10; i += 1){
            timesTable[i] = number * i;
        }
        return timesTable;
    }
}
