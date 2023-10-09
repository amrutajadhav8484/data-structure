import java.util.Arrays;
public class bubble_sort {
    public static void main(String[] args) {
    int[] array={4,7,8,3,2,1};
    bubble(array);
    System.out.println(Arrays.toString(array));
    }
    static void bubble(int[]array)
    {
        boolean swapped;
        // run the steps n-1 times
        for(int i=0;i<array.length;i++)
        {
            swapped=false;
            // for each step,max element will come at  last respective index
            for(int j=1;j< array.length-i;j++)
            {
                //swap if previous element is smaller
                if(array[j]<array[j-1])
                {
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
