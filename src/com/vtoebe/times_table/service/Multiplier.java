package com.vtoebe.times_table.service;

public class Multiplier {
    int[] timesTable = new int[10];

    public int[] multiply(int number){
        for (int i = 1; i <= 10; i += 1){
            timesTable[i-1] = number * i;
        }
        return timesTable;
    }
}
