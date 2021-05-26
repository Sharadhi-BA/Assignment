import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] workHoursOfWeek=new int[7];
        int itr;
        float salary;
        System.out.println("Enter the working hours of week");
        for(itr=0;itr<7;itr++)
        {
            //Reading Input
            workHoursOfWeek[itr]=sc.nextInt();
            //Validating the work hours
            if(workHoursOfWeek[itr]<0)
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        EmployeeWorkHours employeeObject=new EmployeeWorkHours(workHoursOfWeek);
        salary=employeeObject.computeSalary();
        System.out.println("The total salary of week is "+salary);
    }
}
