package arrays.setMatrixZeros;

import java.util.Scanner;

public class S_better {
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
       int []row=new int[matrix.length];
       int []col=new int[matrix[0].length];
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[0].length; j++) {
               if (matrix[i][j]==0) {
                   row[i]=1;
                   col[j]=1;
               }
           }
       }
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[0].length; j++) {
               if(row[i]==1 || col[j]==1 ){
                   matrix[i][j]=0;
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
}
