package com.odeyalo.tasks.matrix;

import java.util.function.Function;

public class Matrix {
    private int[][] matrix;
    private int columnsNumber;
    private int rowsNumber;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
        this.rowsNumber = matrix.length;
        this.columnsNumber = matrix[0].length;
    }

    public void addition(int[][] input) {
        matrix = loopThroughTwoMatrixAndDo(matrix, input, Integer::sum);
    }


    public void multiplication(int[][] input) {
        matrix = loopThroughTwoMatrixAndDo(matrix, input, (first, second) -> first * second);
    }

    public void multiplicationByNumber(int number) {
        matrix = loopThroughSingleMatrixAndDo(matrix, (elem) -> elem * number);
    }

    protected int[][] loopThroughSingleMatrixAndDo(int[][] input, Function<Integer, Integer> calculator) {
        int columns = input[0].length;
        int rows = input.length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = calculator.apply(input[i][j]);
            }
        }
        return result;
    }

    protected int[][] loopThroughTwoMatrixAndDo(int[][] first, int[][] second, MatrixElementCalculator calculator) {
        if (!isEqualMatrixSize(first, second)) {
            throw new IllegalStateException("Матрицы должны иметь одинаковые размер!");
        }
        int rows = first.length;
        int columns = first[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = calculator.calculateResult(first[i][j], second[i][j]);
            }
        }
        return result;
    }


    public void print() {
        loopThroughSingleMatrixAndDo(matrix, (elem) -> {
            System.out.println(elem);
            return elem;
        });
    }

    @FunctionalInterface
    interface MatrixElementCalculator {

        int calculateResult(int firstMatrixNumber, int secondMatrixNumber);

    }


    protected boolean isEqualMatrixSize(int[][] first, int[][] second) {
        return first.length == second.length && first[0].length == second[0].length;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getColumnsNumber() {
        return columnsNumber;
    }

    public void setColumnsNumber(int columnsNumber) {
        this.columnsNumber = columnsNumber;
    }

    public int getRowsNumber() {
        return rowsNumber;
    }

    public void setRowsNumber(int rowsNumber) {
        this.rowsNumber = rowsNumber;
    }
}
