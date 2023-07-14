import java.util.Arrays;
import java.util.Scanner;

public class EquilibriumIndex {
    public static int CalculateIndex(int[] array)
    {
        int [] prefix=new int[array.length];
        prefix[0]=array[0];
        int count=0;
        int min=Integer.MAX_VALUE;
        for(int i=1; i<array.length; i++)
        {
            prefix[i]=prefix[i-1]+array[i];
        }

        for(int i=1; i<prefix.length; i++)
        {
            if(prefix[i-1]==prefix[prefix.length-1]-prefix[i])
            {
                count++;
                if(min>i)
                {
                    min=i;
                }
            }
        }
        if(count==0)
        {
            return -1;
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] Array=new int[size];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<size;i++)
        {
            Array[i]=scan.nextInt();
        }
        int val=CalculateIndex(Array);
        System.out.println(val);

    }
}
