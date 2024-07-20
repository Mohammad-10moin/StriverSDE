import java.util.*;
public class Rough {
    public static void swap(int[]a,int s,int e){
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
    }
    public static void main(String[] args) {
        String s="45320";
        int n= Integer.valueOf(s);
        System.out.println(n);
        int index=-1;
        int []num = new int[s.length()];
        int k=0;
        for(int j=n;j>0;j=j/10){
            num[num.length-1-k]=(j%10);
            k++;
        }
        System.out.println(Arrays.toString(num));
        for(int i=num.length-1;i>0;i--){
            if(num[i]>num[i-1]){
                index=i;
                break;
            }
        }
        System.out.println(index);
        System.out.println(index+1);
        swap(num,index,index+1);
        System.out.println(Arrays.toString(num));
    }
}