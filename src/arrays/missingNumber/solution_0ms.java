package arrays.missingNumber;

public class solution_0ms {
    public static void main(String[] args) {
        int []nums={1,2};
        int actualsum = (nums.length*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            actualsum=actualsum-nums[i];
        }
        System.out.println(actualsum);
    }
}
