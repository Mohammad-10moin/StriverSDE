package arrays.setMatrixZeros;

import java.util.Scanner;

public class S_optimal {
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
        int colo=1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if(j!=0){
                        matrix[0][j]=0;
                    }else {
                        colo=0;
                    }
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i]=0;
            }
        }
        if(colo==0){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0]=0;
            }
        }
        for(int k = 0; k<matrix.length; k++) {
            for(int l = 0; l<matrix[0].length ; l++) {
                System.out.print(matrix[k][l]+" ");
            }
            System.out.println();
        }
    }
}
