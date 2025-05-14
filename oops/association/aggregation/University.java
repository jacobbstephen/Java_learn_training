package oops.association.aggregation;

public class University {
	Student student;
	String universityName;
	
	University(String universityName, Student student ){
		this.universityName = universityName;
		this.student =  student;
	}
}
