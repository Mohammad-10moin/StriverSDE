package arrays.nextPermutation;

import java.util.Arrays;

public class MYsolution {
    public static void main(String[] args) {
        int [] nums={3,2,1};
        int ind=0;
        for (int i =nums.length-1; i >0; i--) {
            if(nums[i]>nums[i-1]){
                ind=i-1;
                break;
            }
        }
//        System.out.println(n[ind]);
        int small = Integer.MAX_VALUE;
        int ind1=0;
        for(int j=ind+1;j<nums.length;j++){
            if(small>(nums[j]-nums[ind]) ){
                small=nums[j]-nums[ind];
                if(small>0) {
                    ind1 = j;
                }
            }
        }
//        System.out.println(n[ind1]);
        if(nums[ind]==nums[ind1]){
            for(int i=0;i<nums.length-1;i++){
                for(int j=0;j< nums.length-i-1;j++){
                    if(nums[j]>nums[j+1]){
                        int dupe=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=dupe;
                    }
                }
            }
        }
        int temp=nums[ind1];
        nums[ind1]=nums[ind];
        nums[ind]=temp;
//        System.out.println(Arrays.toString(n));

        for(int i=ind+1;i<nums.length-1;i++){
            for(int j=ind+1;j<nums.length-(i-ind);j++){
                if(nums[j]>nums[j+1]){
                    int temp1=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp1;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        /*int ind=0;
        int big=Integer.MAX_VALUE;
        for (int i =nums.length-1; i >0; i--) {
            if(nums[i]>nums[i-1]){
                int j=i;
                for( j=i;j<nums.length;j++){
                    if(big>(nums[j]-nums[i-1])){
                        big = nums[j] - nums[i - 1];
                        if(big>0) {
                            ind=j;
                        }
                    }
                }
                int temp=nums[ind];
                nums[ind]=nums[i-1];
                nums[i-1]=temp;
                for(int k=i;k<nums.length-1;k++){
                    for(int l=i;l<nums.length-(k-i)-1;l++){
                        if(nums[l]>nums[l+1]){
                            int t=nums[l];
                            nums[l]=nums[l+1];
                            nums[l+1]=t;
                        }
                    }
                }
//                ind=i-1;
                break;
            }
            if(big==Integer.MAX_VALUE){
                for(int m=0;m<nums.length-1;m++){
                    for(int c=0;c< nums.length-m-1;c++){
                        if(nums[c]>nums[c+1]){
                            int dupe=nums[c];
                            nums[c]=nums[c+1];
                            nums[c+1]=dupe;
                        }
                    }
                }
                break;
            }
        }

        System.out.println(Arrays.toString(nums));
//        if(nums[ind]==nums[ind1]){
//            for(int i=0;i<nums.length-1;i++){
//                for(int j=0;j< nums.length-i-1;j++){
//                    if(nums[j]>nums[j+1]){
//                        int dupe=nums[j];
//                        nums[j]=nums[j+1];
//                        nums[j+1]=dupe;
//                    }
//                }
//            }
//        }
/*
        for(int i=ind+1;i<nums.length-1;i++){
            for(int j=ind+1;j<nums.length-(i-ind);j++){
                if(nums[j]>nums[j+1]){
                    int temp1=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp1;
                }
            }
        }
        System.out.println(Arrays.toString(nums));*/
    }
}
