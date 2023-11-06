package org.example;
import org.example.Matrix;

import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) {
        org.example.Matrix mat1 = new org.example.Matrix(2,2);
        System.out.println(mat1.getRows());
        System.out.println(mat1.getColumns());
        System.out.println(mat1.get(1,0));
        mat1.fillMatrix();
        System.out.println(mat1.get(1,0));
        org.example.Matrix mat2 = new org.example.Matrix(mat1);
        System.out.println(mat2.getRows());
        System.out.println(mat2.getColumns());
        System.out.println(mat2.get(1,1));
    }
}