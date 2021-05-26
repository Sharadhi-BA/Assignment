public class EmployeeWorkHours {
    int[] workHoursOfWeek=new int[7];
    float salary=0;
    int totalWorkHours=0;
    EmployeeWorkHours(int[] workHoursOfWeek)
    {
        this.workHoursOfWeek=workHoursOfWeek;
    }
    public float computeSalary()
    {
        int itr,daySalary;
        for(itr=1;itr<=5;itr++)
        {
            daySalary= computeDaySalary(workHoursOfWeek[itr]);
            this.salary=this.salary+daySalary;
            this.totalWorkHours=this.totalWorkHours+workHoursOfWeek[itr];
        }
        if(this.totalWorkHours>40)
            this.salary=this.salary+(totalWorkHours-40)*25;
        computeWeekendSalary(workHoursOfWeek[6],6);
        computeWeekendSalary(workHoursOfWeek[0],0);
        return this.salary;
    }
    public int computeDaySalary(int workHours)
    {
        int extraHoursSalary;
        if(workHours==0)
            return 0;
        if(workHours<=8)
            return workHours*100;
        else {
            extraHoursSalary = (workHours - 8) * 15;
            return (workHours * 100 + extraHoursSalary);
        }
    }
    public void computeWeekendSalary(int workHours,int day)
    {
        int bonus,daySalary;
        daySalary=computeDaySalary(workHours);
        if(day==6)
            this.salary = this.salary+ (float) (daySalary+daySalary*0.25);
        else
            this.salary = this.salary+ (float) (daySalary+daySalary*0.5);
    }
}
