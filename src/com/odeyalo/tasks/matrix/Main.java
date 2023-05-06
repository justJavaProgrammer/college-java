package com.odeyalo.tasks.matrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        Matrix matrix = new Matrix(matrix1);
        matrix.print();

        matrix.multiplicationByNumber(2);

        System.out.println();

        matrix.print();
    }
}
