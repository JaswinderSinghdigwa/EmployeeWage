package com.bl.employee;

public class EmployeeWageBuilderUC3 {
	public static void main(String[] args) {
		int isparttime = 1; //this is Third Program
		int isfulltime = 2;
		int emprateperhour = 20;
		int wage,emphrs = 0;
		int empcheck = (int) Math.floor(Math.random()*10) % 2;
		if (empcheck == isfulltime) {
			emphrs = 8;
		}
		else if (empcheck == isparttime) {
			emphrs = 4;
		}
		else {
			System.out.print("Employee is NotPersent");
		}
		wage = emphrs*emprateperhour;
	}
}
