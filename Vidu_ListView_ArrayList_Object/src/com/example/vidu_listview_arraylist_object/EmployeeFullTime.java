package com.example.vidu_listview_arraylist_object;

public class EmployeeFullTime extends Employee {
	@Override
	 public double TinhLuong() {
	 return 150;
	 }
	 @Override
	 public String toString() {
	 // TODO Auto-generated method stub
	 return super.toString() +" -->FullTime="+TinhLuong();
	 }
	//@Override
	public double TinhLuong1() {
		// TODO Auto-generated method stub
		return 0;
	}
	}