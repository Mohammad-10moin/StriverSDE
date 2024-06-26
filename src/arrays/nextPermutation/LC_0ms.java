package arrays.nextPermutation;

import java.util.Arrays;

public class LC_0ms {
    public static void main(String[] args) {
        int [] nums={5,4,7,5,3,2};
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
//        insightful part {
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }
//        } ends here
        reverse(nums,index+1,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int [] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int [] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}