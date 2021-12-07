package com.vtoebe.times_table.utils;

import javax.swing.*;

public class Printer {
    final String CONTINUE_LINE = "Would you like to continue?";

    public int continueCheck(){ return JOptionPane.showConfirmDialog(null, CONTINUE_LINE, "Continue", JOptionPane.YES_NO_OPTION); }
}
