import java.util.Scanner;
public class ArrayRangeCalculator {
    static int[] arrayElements;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int itr;
        int minimumNumber= Integer.MAX_VALUE,maximumNumber=Integer.MIN_VALUE;
        int sizeOfArray=sc.nextInt();
        arrayElements=new int[sizeOfArray];
        for(itr=0;itr<sizeOfArray;itr++)
        {
            arrayElements[itr]=sc.nextInt();
            if(arrayElements[itr]>maximumNumber)
                maximumNumber=arrayElements[itr];
            if(arrayElements[itr]<minimumNumber)
                minimumNumber=arrayElements[itr];
        }
        System.out.println("The range of the array is "+(maximumNumber-minimumNumber));
    }
}
