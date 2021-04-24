package com.osamabodiaf;

import java.io.File;

public class Test {
    public Test(String grammarFileName, String sourceFileName) {
        var grammarFile = new File("assets\\" + grammarFileName);
        var sourceFile = new File("assets\\" + sourceFileName);
        var reporter = new Reporter(new AnalysisTable(grammarFile, sourceFile));

        reporter.printParsingSummary();
        reporter.printAnalysisTable();
    }
}