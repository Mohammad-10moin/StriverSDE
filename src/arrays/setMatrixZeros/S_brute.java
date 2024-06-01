package arrays.setMatrixZeros;

import java.util.Scanner;

public class S_brute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.println("Enter the number of rows in the matrix");
        r=sc.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        c=sc.nextInt();
        int [][]matrix=new int[r][c];
        System.out.println("Enter the elements in the matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix,i);
                    markCol(matrix,j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
        for(int k = 0; k<matrix.length; k++) {
            for(int l = 0; l<matrix[0].length ; l++) {
                System.out.print(matrix[k][l]+" ");
            }
            System.out.println();
        }
    }
    public static void markRow(int[][]matrix,int row){
        for(int j=0;j<matrix[row].length;j++){
            if(matrix[row][j]!=0){
                matrix[row][j]=-1;
            }
        }
    }
    public static void markCol(int[][]matrix,int c){
        for(int j=0;j<matrix.length;j++){
            if(matrix[j][c]!=0){
                matrix[j][c]=-1;
            }
        }
    }
}
