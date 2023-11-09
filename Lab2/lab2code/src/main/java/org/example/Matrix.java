package org.example;
import java.util.Objects;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Matrix otherMatrix = (Matrix) obj;
        if (rows != otherMatrix.rows || columns != otherMatrix.columns) {
            return false;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (data[i][j] != otherMatrix.data[i][j]) {
                    return false;
                }
            }
        }

        if (rows == 0 && columns == 0){
            if (data[0][0] != otherMatrix.data[0][0]){
                return false;
            }

        }

        return true;
    }


    @Override
    public int hashCode() {
        int result = Objects.hash(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result = 31 * result + Double.hashCode(data[i][j]);
            }
        }

        if (rows == 0 && rows == 0){
            result = 31 * result + Double.hashCode(data[0][0]);
        }

        return result;
    }

    public final class ImmutableMatrix {
        private final int rows;
        private final int columns;
        private final double[][] data;

        public ImmutableMatrix(int rows, int columns, double[][] data) {
            this.rows = rows;
            this.columns = columns;
            this.data = new double[rows][columns];

            for (int i = 0; i < rows; i++) {
                System.arraycopy(data[i], 0, this.data[i], 0, columns);
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


        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ImmutableMatrix otherMatrix = (ImmutableMatrix) obj;
            if (rows != otherMatrix.rows || columns != otherMatrix.columns) {
                return false;
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (data[i][j] != otherMatrix.data[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(rows, columns);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result = 31 * result + Double.hashCode(data[i][j]);
                }
            }
            return result;
        }
    }

    public void addMatrix(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            throw new IllegalArgumentException("Matrix dimensions must match for addition");
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] += other.data[i][j];
            }
        }

        if (rows == 0 && columns == 0){
            this.data[0][0] += other.data[0][0];
        }
    }

    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] *= scalar;
            }
        }

        if (rows == 0 && columns == 0){
            this.data[0][0] *= scalar;
        }
    }


    public void multiplyByMatrix(Matrix other) {
        if (this.columns != other.rows) {
            throw new IllegalArgumentException("Matrix dimensions must match for multiplication");
        }

        if (this.rows == 0 && other.columns == 0){
            this.data[0][0] = this.data[0][0] * other.data[0][0];
            System.out.print(this.data[0][0]);
            this.columns = 0;
            this.rows = 0;

        }
        else{
            double[][] result = new double[this.rows][other.columns];

            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < other.columns; j++) {
                    for (int k = 0; k < this.columns; k++) {
                        result[i][j] += this.data[i][k] * other.data[k][j];
                    }
                    System.out.print(result[i][j]);
                    System.out.print(' ');
                }
                System.out.println();
            }
            this.columns = other.columns;
            this.data = result;
        }
    }

    public void printMatrix() {
        if (rows == 0 && columns == 0){
            System.out.println(data[0][0]);
        }
        else{
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(data[i][j] + "\t");
                }
                System.out.println();
            }

        }
    }

    public void transpose() {
        double[][] transposedData = new double[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedData[j][i] = data[i][j];
            }
        }

        data = transposedData;
        int temp = rows;
        rows = columns;
        columns = temp;
    }

    public void setValue(int row, int col, double value) {
        if (row >= 0 && row < data.length && col >= 0 && col < data[row].length) {
            data[row][col] = value;
        } else {
            throw new IndexOutOfBoundsException("Invalid row or column index.");
        }
    }

    public static Matrix createDiagonal(double[] vector) {
        Matrix diagonalMatrix = new Matrix(vector.length, vector.length);
        for (int i = 0; i < vector.length; i++) {
            diagonalMatrix.setValue(i, i, vector[i]);
        }
        return diagonalMatrix;
    }
}