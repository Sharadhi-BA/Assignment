import java.util.Scanner;
public class ArrayTypeFinder {
    static int[] arrayElements;
    static String outputMessage="The array is ";
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int itr,arrayTypeValue;
        int evenNumbersCount=0,oddNumbersCount=0;
        int sizeOfArray=sc.nextInt();
        arrayElements=new int[sizeOfArray];
        for(itr=0;itr<sizeOfArray;itr++)
        {
            arrayElements[itr]=sc.nextInt();
            if(arrayElements[itr]%2==0)
                evenNumbersCount++;
            else
                oddNumbersCount++;
        }
        arrayTypeValue=findTypeOfArray(evenNumbersCount,oddNumbersCount);
        outputMessage+=(arrayTypeValue==1)?("Even"):(arrayTypeValue==2)?("Odd"):("Mixed");
        System.out.println(outputMessage);
    }
    public static int findTypeOfArray(int evenNumbersCount,int oddNumbersCount)
    {
        return (oddNumbersCount==0)?1:(evenNumbersCount==0)?2:3;
    }
}
