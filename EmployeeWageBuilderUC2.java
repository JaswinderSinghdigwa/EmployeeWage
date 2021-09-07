package com.bl.employee;

public class EmployeeWageBuilderUC2 {
	public static void main(String[] args) {
		int isfulltime = 1;
		int emprateperhour = 20;
		int wage, emphrs=8;
		int empcheck = (int) Math.floor(Math.random()*10) % 2;
		if (empcheck == isfulltime) {
			wage = emphrs*emprateperhour;
			System.out.print("Employee is Persent" +wage);
		}
		else {
			System.out.print("Employee is NotPersent");
		}
   }
}