import java.util.Scanner;
public class LoweTriangleMatrixIdentifier {
    static int numberOfRows,numberOfColumns;
    public static int validator()
    {
        return (numberOfRows!=numberOfColumns)?1:(numberOfRows<=0 || numberOfColumns<=0)?2:3;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int iterColumns,iterRows,flagLower=1;
        int [][] arrayElements;
        numberOfRows=sc.nextInt();
        numberOfColumns=sc.nextInt();
        int validatorResult;
        validatorResult=validator();
        if(validatorResult==1)
            System.out.println("Please enter a square matrix");
        else if(validatorResult==2)
            System.out.println("Please enter a valid matrix size");
        else
        {
            arrayElements=new int[numberOfColumns][numberOfRows];
            for(iterRows=0;iterRows<numberOfRows;iterRows++)
            {
                for(iterColumns=0;iterColumns<numberOfColumns;iterColumns++)
                {
                    arrayElements[iterRows][iterColumns]=sc.nextInt();
                    if(iterRows!=numberOfRows-1 && iterColumns>iterRows && arrayElements[iterRows][iterColumns]!=0)
                        flagLower=0;
                }
            }
            if(flagLower==0)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
