package model;

public class Student {
	private String name,email,phnNo,dob,schlName;
	private double phyMarks,totalMarks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSchlName() {
		return schlName;
	}
	public void setSchlName(String schlName) {
		this.schlName = schlName;
	}
	public double getPhyMarks() {
		return phyMarks;
	}
	public void setPhyMarks(double phyMarks) {
		this.phyMarks = phyMarks;
	}
	public double getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

}
