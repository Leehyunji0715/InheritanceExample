package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person{
	private int facultyNumber;
	public Faculty()    { 
		super();        
		facultyNumber = 0;  
	}
	public Faculty(String newName,int newFacultyNumber ) {
		setName(newName);
		facultyNumber = newFacultyNumber;
	}
	
	public void reset(String newName,int newFacultyNumber ) {
		setName(newName);
		facultyNumber = newFacultyNumber;
	}
	public int getFacultyNumber() {
		return facultyNumber;
	}
	public void setFacultyNumber(int newFacultyNumber) {
		facultyNumber = newFacultyNumber;
	}
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Student Number : "+ facultyNumber);
	}
	public boolean equals(Faculty otherFaculty) {
		return hasSameName(otherFaculty)&&(this.facultyNumber==otherFaculty.facultyNumber);//name & number!
	}
	
	
}
