package com.osamabodiaf;

import java.io.File;

public class Parser {
    public static boolean isParsable(File grammarFile, File sourceFile) {
        return new AnalysisTable(grammarFile, sourceFile).isComplete();
    }
}
