package arrays.kadane;

import java.util.Scanner;

public class MYsol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = nums[0];
        int sum=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]>sum){
                sum=nums[i]+nums[i-1];
            }else if(nums[i]>sum+nums[i]){
                sum = nums[i];
            }
            else{
                sum = sum + nums[i];
            }
            if(max<sum){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
