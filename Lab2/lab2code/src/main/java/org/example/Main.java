package org.example;
import org.example.Matrix;

import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) {
        org.example.Matrix mat1 = new org.example.Matrix(4,4);
        mat1.fillMatrix();
        mat1.printMatrix();
        mat1.toUpperTriangular();
        mat1.printMatrix();
    }
}