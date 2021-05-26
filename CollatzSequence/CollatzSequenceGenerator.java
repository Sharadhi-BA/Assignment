import java.util.Scanner;
public class CollatzSequenceGenerator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Starting of the Sequence");
        int startOfSequence=sc.nextInt();
        if(startOfSequence>0)
        {
            System.out.println(startOfSequence);
            sequenceDisplayer(startOfSequence);
        }
        else
            System.out.println("Invalid Input");
    }
    public static void sequenceDisplayer(int sequenceNumber)
    {
        while(sequenceNumber!=1)
        {
            if(sequenceNumber%2==0)
                sequenceNumber=sequenceNumber/2;
            else
                sequenceNumber=3*sequenceNumber+1;
            System.out.println(sequenceNumber);
        }
    }
}
