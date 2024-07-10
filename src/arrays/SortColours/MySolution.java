package arrays.SortColours;

import java.util.ArrayList;
import java.util.Arrays;

public class MySolution {
    public static void main(String[] args) {
        int []nums={0,1,2,0,0,1,2,0};
        ArrayList<Integer>[] a = new ArrayList[3];

        // Initialize each element of the array
        for (int i = 0; i < a.length; i++) {
            a[i] = new ArrayList<>();
        }

        // Populate the lists
        for (int num : nums) {
            if (num == 0) {
                a[0].add(num);
            } else if (num == 1) {
                a[1].add(num);
            } else {
                a[2].add(num);
            }
        }
        int index = 0;
        for (ArrayList<Integer> list : a) {
            for (int num : list) {
                nums[index++] = num;
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(nums));
    }
}
