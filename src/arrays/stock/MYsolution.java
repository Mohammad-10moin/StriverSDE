package arrays.stock;
//Could not solve an easy Question.
//No worries , Lets learn from this question.
public class MYsolution {
    public static int smallest(int[]a,int s, int e){
        int min=Integer.MAX_VALUE;
        int mI=-1;
        for(int i=s;i<e;i++){
            if(min>a[i] && a[i]>=0){
                min=a[i];
                mI=i;
            }
        }
        return mI;
    }
    public static int largest(int[]a,int s, int e){
        int max=Integer.MIN_VALUE;
        int maI=-1;
        for(int i=s;i<e;i++){
            if(max<=a[i]){
                max=a[i];
                maI=i;
            }
        }
        return maI;
    }
    public static void main(String[] args) {
        int [] prices={2,1,2,1,0,1,2};
        int SI=-1;
        int LI=-1;
        for(int i=0;i<prices.length;i++){
            LI=largest(prices,0,prices.length);
            if(LI!=0){
                SI=smallest(prices,0,LI);
                if(SI!=-1){
                    System.out.println(prices[LI]-prices[SI]);
                    break;
                }
            }
            else{
                prices[LI]=-1;
            }
            if(i==prices.length-1){
                System.out.println(0);
            }
        }
    }
}
