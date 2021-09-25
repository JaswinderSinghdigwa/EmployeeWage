package com.bl.employee;

public class EmployeeWageBuilderUC5 {
	public static final int isparttime = 1;
	public static final int isfulltime = 2;
	public static final int emprateperhour = 20;
	public static final int numofworkingdays= 20;
	public static final int maxhrsinmonth=100;
	public static void main(String[] args) {
		
		int emphrs = 0 , totalemphrs =0 , totalWorkingDays = 0;
		totalWorkingDays++;
		int empcheck = (int) Math.floor(Math.random()*10) % 3;
		switch(empcheck) {
			case  isparttime :
				emphrs = 4;
				break;
			case  isfulltime: 
				emphrs = 8;
				break;
			default:
				emphrs = 0;
		}
		totalemphrs += emphrs;
		System.out.println("Day = :" + totalWorkingDays + " Emp Hr = " +emphrs);
	}
}
