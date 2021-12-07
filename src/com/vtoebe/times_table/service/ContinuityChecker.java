package com.vtoebe.times_table.service;

import com.vtoebe.times_table.utils.Printer;

public class ContinuityChecker {
    Printer print = new Printer();

    public boolean check(){ return print.continueCheck() == 0; }
}