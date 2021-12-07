package com.vtoebe.times_table.utils;

public class Writer {
    public int saveInputNumber(String inputValue){
        return Integer.parseInt(inputValue);
    }

    public String[] generatedTable(int[] multiplied){
        String[] tableValues = new String[multiplied.length];

        for (int i = 0; i< multiplied.length; i += 1){
            String operation = (multiplied[0] + " x " + (i+1) + " = " + multiplied[i] + "\n");
            tableValues[i] = operation;
            System.out.println(operation);
        }
        return tableValues;
    }
}
