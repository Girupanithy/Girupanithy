import java.io.*;
import java.util.*;
class Pair
{
    private static final int max=100000;
    static void print(int arr[],int sum)
    {
        boolean[] value = new boolean[max];
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];
            if (temp>=0 && value[temp])
            {
                System.out.println("Pair with given sum " +  sum + " is (" + arr[i] ", "+temp+")");
            }
            value[arr[i]] = true;
        }
    }
    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        int m;
        m=input.nextInt();
        int A[]=new Int[m];
        for(int i=0;i<m;i++)
        {
            A[i]=input.nextInt();
        }
        int n;
        n=input.nextInt();
        printpairs(A,  n);
    }
}
