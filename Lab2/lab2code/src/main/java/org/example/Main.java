package org.example;
import org.example.Matrix;

import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) {
        org.example.Matrix mat1 = new org.example.Matrix(1,1);
        mat1.fillMatrix();
        mat1.printMatrix();
        mat1.transpose();
        mat1.printMatrix();

        org.example.Matrix mat2 = new org.example.Matrix(2,3);
        mat2.fillMatrix();
        mat2.printMatrix();
        mat2.transpose();
        System.out.println();
        mat2.printMatrix();
    }
}