/**
 * 
 */
package com.springcore.springcore;

/**
 * @author NAMAN JAIN
 *
 */
public class Student {

	/**
	 * @param args
	 */
	public int studentId;
	public String studentName;
	public String studentAddress;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return studentId + " " + studentAddress + " " + studentName;
	}
	
}
