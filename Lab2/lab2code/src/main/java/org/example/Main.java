package org.example;
import org.example.Matrix;

import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) {
        org.example.Matrix mat1 = new org.example.Matrix();
        mat1.fillMatrix();

        org.example.Matrix mat2 = new org.example.Matrix(2,2);
        mat2.fillMatrix();
        mat2.multiplyByScalar(3);
        mat1.multiplyByScalar(4);
        System.out.println(mat2.get(1,1));
        System.out.println(mat1.get(0,0));

    }
}