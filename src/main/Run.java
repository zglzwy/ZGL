package main;

import read.ClazzSort;
import read.GradeSort;

public class Run {
    public static void main(String[] args ) throws Exception {
        new GradeSort().gradeSort();
        new ClazzSort().clazzSort();
    }
}
