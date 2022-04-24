package EmployeeWage;

public class UC2_EmployeeDailyWage {
	public static void main(String[] args) {	
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
			empHrs = 8;
		}
		else {
			empHrs = 0;
			System.out.println("Employee is abscent");
		}
		empWage =empHrs*EMP_RATE_PER_HOUR;
		System.out.println(empWage);
		}
}
