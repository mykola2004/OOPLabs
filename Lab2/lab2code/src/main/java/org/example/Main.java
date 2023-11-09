package org.example;
import org.example.Matrix;

import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) {
        org.example.Matrix mat1 = new org.example.Matrix(2,1);
        mat1.fillMatrix();
        mat1.printMatrix();
        org.example.Matrix mat2 = new org.example.Matrix();
        double[] numbers = {1.0, 2.0, 3.0, 4.0};
        mat1 = mat1.createRowMatrixWithRandomValues(10, 1, 1000);
        mat1.printMatrix();
        
    }
}