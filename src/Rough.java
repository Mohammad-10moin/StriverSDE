import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {
        int [] nums={3,2,1};
        for(int m=0;m<nums.length-1;m++){
            for(int j=0;j< nums.length-m-1;j++){
                if(nums[j]>nums[j+1]){
                    int dupe=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=dupe;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
