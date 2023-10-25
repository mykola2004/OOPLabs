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

        

    }

}