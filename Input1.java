public class Input1 {
    public static void main(String[] args) {
        scanner in=new scanner(System.in);
        int[] arr=new int[5];
        arr[0]=23;
        arr[1]=30;
        arr[2]=46;
        arr[3]=70;
        arr[4]=98;
        System.out.println(arr[3]);
        //input using for loops
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+"");

        }
        for(int j:arr)
        {
            System.out.println(num+"");

        }
    }
}
