import java.util.*;
public class Rough {
    public static void main(String[] args) {
        int []nums={1,2};
        int temp=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==temp){
                temp--;
                i=-1;
                continue;
            }
            if(temp!=nums[i] && i==nums.length-1){
                System.out.println(temp);
                break;
            }
        }
    }
}