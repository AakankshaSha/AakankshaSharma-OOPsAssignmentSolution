package com.greatlearning.department.model;

public class HrDepartment extends SuperDepartment {
	@Override
	public String departmentName() {
		return "HR Department";
	}
	@Override
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";	
	}
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "Team Lunch";
	}
}
