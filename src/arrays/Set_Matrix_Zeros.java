package arrays;
import java.util.Scanner;
public class Set_Matrix_Zeros {// ---Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
/* ex:  1   1   1               1   0   1
        1   0   1      ===>     0   0   0
        1   1   1               1   0   1
 */
//    here is MY brute force solution.
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
        int [][] i2 =new int[matrix.length][matrix[0].length];
        for(int k = 0; k<matrix.length; k++) {
            for(int l = 0; l<matrix[0].length ; l++) {
                if(matrix[k][l]==0) {
                    i2[k][l]=1;
                }
            }
        }
        for(int k = 0; k<matrix.length; k++) {
            for(int l = 0; l<matrix[0].length ; l++) {
                if(i2[k][l]==1) {
                    for (int j = 0; j<matrix[0].length ; j++) {
                        matrix[k][j]=0;
                    }
                    for(int i = 0; i<matrix.length ; i++) {
                        matrix[i][l]=0;
                    }
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
