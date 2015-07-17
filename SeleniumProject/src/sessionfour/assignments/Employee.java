package sessionfour.assignments;

import java.util.Date;

import org.apache.poi.ss.usermodel.Row;

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


	public void assignValues(Row row) {
		this.name = row.getCell(0).toString();
		this.dept = row.getCell(1).toString();
		this.address = row.getCell(2).toString();
		this.contact = new Double(row.getCell(3).toString()).longValue();
		this.hireDate = new Date(row.getCell(4).toString());
		this.local = new Boolean(row.getCell(5).toString()).booleanValue();
		this.dayRate = new Double(row.getCell(6).toString()).intValue();
		this.leaves = new Double(row.getCell(7).toString()).intValue();
		this.leavesAmount = new Double(row.getCell(8).getNumericCellValue()).doubleValue();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", address=" + address + ", contact=" + contact
				+ ", hireDate=" + hireDate + ", local=" + local + ", dayRate=" + dayRate + ", leaves=" + leaves
				+ ", leavesAmount=" + leavesAmount + "]";
	}

}
