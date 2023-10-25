package org.example;

public class Program {
    public class Matrix {
        private int rows;
        private int columns;
        private double[][] data;

        public Matrix() {
            this.rows = 0;
            this.columns = 0;
            this.data = new double[0][0];
        }

        public Matrix(int rows, int columns) {
            this.rows = rows;
            this.columns = columns;
            this.data = new double[rows][columns];
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

        public void fillMatrix(double value) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    data[i][j] = value;
                }
            }
        }

        public void setValue(int row, int column, double value) {
            if (row < 0 || row >= rows || column < 0 || column >= columns) {
                throw new IllegalArgumentException("Invalid matrix indices");
            }
            data[row][column] = value;
        }

        public int getRows() {
            return rows;
        }

        public int getColumns() {
            return columns;
        }

        public double get(int row, int column) {
            if (row < 0 || row >= rows || column < 0 || column >= columns) {
                throw new IllegalArgumentException("Invalid matrix indices");
            }
            return data[row][column];
        }

    }

}