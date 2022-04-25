package EmployeeWage;

public class Employeecal {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;
	public static int computeEmpWage(String company,int empRatePerHour,int numOfWoringDays,int maxHoursPerMonth) {
		int empHrs = 0;
		int totalEmpWage=0;
		int totalDays = 0;
		int totalHrs=0;
		while(totalDays<=NUM_OF_WORKING_DAYS && totalHrs<=MAX_HRS_IN_MONTH) {
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			totalDays++;
			switch(empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalHrs+=empHrs;
			System.out.println("Day#"+ totalDays +"Emp hr: "+empHrs);
		}
			
		totalEmpWage = totalHrs*empRatePerHour;
		
		System.out.println("Total Emp wage for company :"+company+" is: "+totalEmpWage);
		
		return totalEmpWage;
		}
		
	
	
	public static void main(String[] args) {
		computeEmpWage("DMart",20,2,10);
		computeEmpWage("Relince",10,4,20);
		
	}
}
