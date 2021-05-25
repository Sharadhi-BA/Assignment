import java.util.Scanner;
public class FindMangoTree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Number of Rows:");
        int totalNumberOfRows = sc.nextInt();
        System.out.println("Enter total Number of Columns:");
        int totalNumberOfColumns = sc.nextInt();
        System.out.println("Enter tree number to find Mango tree or not:");
        int keyTreeNumber = sc.nextInt();
        int itr;
        if(totalNumberOfColumns<=0 || totalNumberOfRows<=0)
        {
            System.out.println("The given input is Invalid.Please provide positive value for total number of rows and columns.");
            System.exit(0);
        }
        if(keyTreeNumber>totalNumberOfRows * totalNumberOfColumns || keyTreeNumber<=0)
        {
            System.out.println("The given tree number "+keyTreeNumber+" is Invalid");
            System.exit(0);
        }
        for (itr = 1; itr <= totalNumberOfRows * totalNumberOfColumns; itr++) {
            if(itr<=totalNumberOfColumns || (itr%totalNumberOfColumns==0) || (itr%totalNumberOfColumns==1))
            {
                if(keyTreeNumber==itr)
                {
                    System.out.println("The given tree with tree number "+keyTreeNumber+" is a MANGO tree");
                    System.exit(0);
                }
            }
        }
        System.out.println("The given tree with tree number "+keyTreeNumber+" is NOT a MANGO tree");
    }
}
