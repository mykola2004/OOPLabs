package org.example;
import org.example.Matrix;

import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) {
        org.example.Matrix mat1 = new org.example.Matrix();
        mat1.fillMatrix();

        org.example.Matrix mat2 = new org.example.Matrix();
        mat2.fillMatrix();
        mat2.addMatrix(mat1);
        System.out.print(mat2.get(0,0));
    }
}