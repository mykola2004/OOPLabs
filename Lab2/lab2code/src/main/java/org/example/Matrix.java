package org.example;
import java.util.Scanner;

public class Matrix {
    private int rows;
    private int columns;
    private double[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix() {
        this.rows = 0;
        this.columns = 0;
        this.data = new double[][]{{0}};
    }

    public Matrix(Matrix other) {
        this.rows = other.getRows();
        this.columns = other.getColumns();
        this.data = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] = other.get(i, j);
            }
        }
    }

    public void fillMatrix() {
        if (rows == 0 && columns == 0){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value for cell (" + 0 + ", " + 0 + "): ");
            double value = scanner.nextDouble();
            data[0][0] = value;
        }
        else{
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Enter the value for cell (" + i + ", " + j + "): ");
                    double value = scanner.nextDouble();
                    data[i][j] = value;
                }
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public double get(int row, int column) {
        //if (row < 0 || row >= rows || column < 0 || column >= columns) {
        //    throw new IllegalArgumentException("Invalid row or column index");
        //}
        return data[row][column];
    }

    public int[] getDimensions() {
        int[] dimensions = {rows, columns};
        return dimensions;
    }

}