package com.vtoebe.times_table;

import com.vtoebe.times_table.service.ContinuityChecker;
import com.vtoebe.times_table.service.Multiplier;
import com.vtoebe.times_table.utils.Printer;
import com.vtoebe.times_table.utils.Writer;

public class Main {
    public static void main(String[] args){

        Printer print = new Printer();
        Writer write = new Writer();
        Multiplier mult = new Multiplier();
        ContinuityChecker continuity = new ContinuityChecker();

        do {
            print.timesTableResult(
                    write.generatedTable(
                            mult.multiply(
                                    write.saveInputNumber(
                                            print.inputNumber()
                                    )
                            )
                    )
            );
        } while( continuity.check() ) ;
    }
}
