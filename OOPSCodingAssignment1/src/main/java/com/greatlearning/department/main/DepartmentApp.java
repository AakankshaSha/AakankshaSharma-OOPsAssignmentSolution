package com.greatlearning.department.main;

import com.greatlearning.department.model.AdminDepartment;
import com.greatlearning.department.model.HrDepartment;
import com.greatlearning.department.model.TechDepartment;

public class DepartmentApp {
	public static void main(String[] args) {
		AdminDepartment adminDept = new AdminDepartment();
		System.out.println("Welcome to " + adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday() + "\n");

		HrDepartment hrDept = new HrDepartment();
		System.out.println("Welcome to " + hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday() + "\n");

		TechDepartment techDept = new TechDepartment();
		System.out.println("Welcome to " + techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());	
	}
}
