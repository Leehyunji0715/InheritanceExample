package edu.handong.csee.java.example.inheritance;

public class Student extends Person{
	
	private int studentNumber;
	public Student()    {// 컨스트럭터
		super();        //수퍼클래스에 있는 컨스트럭터를 불러오겠다.
		//Person();을 치면 안된다!!
		studentNumber = 0;//Indicating no number yet    
	}
	
	public Student(String initialName, int initialStudentNumber){
		super(initialName);        
		studentNumber = initialStudentNumber;    
	}
	
	public void reset(String newName, int newStudentNumber) {// 상속받은게 아님 점점 디테일하게 상속받음
		setName(newName);   //퍼블릭으로 선언되었기때문에 그냥 부를수 있는 것이다. 프라이빗으로 바꾸면 안됨!!proctected는 됨(하위개념에게만 공개한다는 의미)     
		studentNumber = newStudentNumber;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(int newStudentNumber) {
		studentNumber = newStudentNumber;
	}
	
	public void writeOutput() {//Person에 있는 같은 메서드는 무시한다(오버라이드 : 슈퍼클래스와 서브클래스가 같은 이름의 메서드를 갖는다면 내꺼 부른다.. 리턴 타입도 똑같다)
	//오버로딩은 같은! 클래스내에서 같은 이름 벗 패러미터가 다르면//메서드 시그네쳐 다르게 인식
		System.out.println("Name: " + getName());
		System.out.println("Student Number: " + studentNumber); 
	}
	
	public boolean equals(Student otherStudent) {
		return this.hasSameName(otherStudent) && (this.studentNumber == otherStudent.studentNumber);
	} 

}
