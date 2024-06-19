package arrays.pascalTriangle;
import java.lang.reflect.Array;
import java.util.*;
public class MYsolution {
    public static void main(String[] args) {
        System.out.println(nCr(11,5));
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int numberOfRows = sc.nextInt();
        List<List<Integer>> ls ;
        ls=generate(numberOfRows);
        System.out.println(ls);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            if (i == 0) {
                row.add(nCr(1,0));
                res.add(row);
                continue;
            }
            for (int j = 0; j <= i; j++) {
                row.add(nCr(i,j));
            }
            res.add(row);
        }
        return res;
    }
    public static int nCr(int n, int m) {
        double ans=1;
        for (int i = 1; i <= m; i++) {
            ans*= ((double) n /(double) i);
            n--;
        }
        return(int) Math.round(ans);
    }

}
