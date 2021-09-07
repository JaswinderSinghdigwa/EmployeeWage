package com.bl.employee;

public class EmployeeWageBuilderUC4 {
	public static final int isparttime = 1;
	public static final int isfulltime = 2;
	public static final int emprateperhour = 20;
	
	public static void main(String[] args) {
		int emprateperhour = 20;
		int wage,emphrs;
		int empcheck = (int)Math.floor(Math.random()*10) % 3;
		switch(empcheck) {
			case  isparttime:
				emphrs = 4;
				break;
			case  isfulltime: 
				emphrs = 8;
				break;		
			default:
				emphrs = 0;
		}
	wage = emphrs*emprateperhour;
	}

}
