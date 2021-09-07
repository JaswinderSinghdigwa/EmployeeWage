package com.bl.employee;

public class EmployeeWageBuilderUC1 {
	public static void main(String[] args) {
		int isPresent = 1;
		int empcheck = (int) Math.floor(Math.random()*10) % 2;
		if (empcheck == isPresent) {
			System.out.print("Employee is Persent" );
		}
		else {
			System.out.print("Employee is NotPersent");
		}
	}
}
