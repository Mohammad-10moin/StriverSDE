package arrays.pascalTriangle;

import java.util.*;

public class optimal_n3_to_n2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(generate(i+1));
        }
        System.out.println("The list is : ");
        System.out.println(list);
    }
    public static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<>();
        int ans=1;
        list.add(1);
        for (int i = 1; i < n; i++) {
            ans = (int) ((ans*(n-i)) /i);
            list.add(ans);
        }
        return list;
    }
}
