package sessionfour.assignments;

import java.util.Date;

public class Employee {
	
	private String name;
	private String dept;
	private String address;
	private long contact;
	private Date hireDate;
	private boolean local;
	private int dayRate;
	private int leaves;
	private double leavesAmount;
	private String formula;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public boolean isLocal() {
		return local;
	}
	public void setLocal(boolean local) {
		this.local = local;
	}
	public int getDayRate() {
		return dayRate;
	}
	public void setDayRate(int dayRate) {
		this.dayRate = dayRate;
	}
	public int getLeaves() {
		return leaves;
	}
	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}
	public double getLeavesAmount() {
		return leavesAmount;
	}
	public void setLeavesAmount(double leavesAmount) {
		this.leavesAmount = leavesAmount;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	
	

}
