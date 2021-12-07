package com.vtoebe.times_table.utils;

import javax.swing.*;

public class Printer {
    final String REQUIRE_NUMBER = "Write a number to get it's time table!";
    final String CONTINUE_LINE = "Would you like to continue?";

    public String inputNumber(){ return JOptionPane.showInputDialog(null, REQUIRE_NUMBER, "Times Table Generator", JOptionPane.INFORMATION_MESSAGE); }

    public int continueCheck(){ return JOptionPane.showConfirmDialog(null, CONTINUE_LINE, "Continue", JOptionPane.YES_NO_OPTION); }

    public void timesTableResult(String[] multiplied) { JOptionPane.showMessageDialog(null, new JList<>(multiplied)); }


}
