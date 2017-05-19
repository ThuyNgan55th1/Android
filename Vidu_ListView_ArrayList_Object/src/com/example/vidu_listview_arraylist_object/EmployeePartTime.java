package com.example.vidu_listview_arraylist_object;

public class EmployeePartTime extends Employee{
	@Override 
	public double TinhLuong(){
		//TODO Auto-generated method stub
		return 150;
	}
@Override 
public String toString() {
	 // TODO Auto-generated method stub
	 return super.toString() +" -->PartTime="+TinhLuong();
	 }

	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double TinhLuong1() {
		// TODO Auto-generated method stub
		return 0;
	}

}
