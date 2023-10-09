// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.until.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr)
    {
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1;i>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
}
