package Day3;

public class EmployeeWage {

	public static void main(String[] args) {
    DisplayStart();
    Attendance();
    DailyempWage();
    PartTimeWage();
    solvingUsingSwitchCase();
    monthlyWage();
	}
    static void DisplayStart() {
    	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
    }
    static void Attendance() {
    	int IS_PRESENT=1;
    	double empCheck=Math.floor(Math.random()*10)%2;
    	if(empCheck==IS_PRESENT) {
    		System.out.println("Employee is Present");
    	}
    	else {
    		System.out.println("Employee is Absent");
    	}
    }
    static void DailyempWage() {
    	double wagePerHour=20;
    	double hourFullDay=8;
    	double empWage;
    	empWage=wagePerHour*hourFullDay;
    	System.out.println("Employee FullTime Wage is"+empWage);
    }
    static void PartTimeWage() {
    	double wagePerHour=20;
    	double partTimeHour=8;
    	double empWage;
    	empWage=wagePerHour*partTimeHour;
    	System.out.println("Employee PartTime Wage is"+empWage);
    }
    static void solvingUsingSwitchCase(){
    	double empCheck=Math.floor(Math.random()*10)%2;
    	switch((int) empCheck) {
    	case 1:
    		System.out.println("Employee is present");
    		break;
    	case 0:
    		System.out.println("Employee is absent");
    		break;
    	}
    	double wagePerHour=20;
    	double hourFullDay=8;
    	double partTimeHour=8;
    	double empWage;
    	double timeCheck=Math.floor(Math.random()*10)%2;
    	switch((int)timeCheck) {
    	case 1:
    		System.out.println("Full Time employeee");
    		empWage=wagePerHour*hourFullDay;
    		System.out.println("Full Time employeee wage is"+empWage);
    		break;
    	case 0:
    		System.out.println("Part Time employeee");
    		empWage=wagePerHour*partTimeHour;
    		System.out.println("Part Time employeee wage is"+empWage);
    		break;		  	
    	}
    }
    static void monthlyWage() {
    	double wagePerHour=20;
    	double hourFullDay=8;
    	double partTimeHour=8;
       	double empWage;
    	double monthlyWage;
    	double workingDay=20;
       	double timeCheck=Math.floor(Math.random()*10)%2;
    	switch((int)timeCheck) {
    	case 1:
    		System.out.println("Full Time employeee");
    		empWage=wagePerHour*hourFullDay;
    		monthlyWage=empWage*workingDay;
    		System.out.println("Full Time employeee wage is"+empWage);
    		System.out.println("Full Time monthly wage is"+monthlyWage);
    		break;
    	case 0:
    		System.out.println("Part Time employeee");
    		empWage=wagePerHour*partTimeHour;
    		monthlyWage=empWage*workingDay;
    		System.out.println("Part Time employeee wage is"+empWage);
    		System.out.println("Part Time monthly wage is"+monthlyWage);
    		break;		  	
    	}
    	
    }
}

