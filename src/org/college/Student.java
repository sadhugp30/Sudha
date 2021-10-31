package org.college;

public class Student extends Dept{
public void studentName() {
	// TODO Auto-generated method stub
System.out.println("Stud name is: Sadhana");
}
public void studentDept() {
	// TODO Auto-generated method stub
System.out.println("Stud dept is: Mechanical");
}
public void studentId() {
	// TODO Auto-generated method stub
System.out.println("Stud id is: 25630");
}
public static void main(String[] args) {
	Student st = new Student();
	st.studentName();
	st.studentDept();
	st.studentId();
	st.hostelName();
	st.deptName();
	st.collegeName();
	st.collegeCode();
	st.collegeRank();
}
}
