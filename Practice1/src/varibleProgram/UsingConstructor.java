package varibleProgram;

public class UsingConstructor {
	String stdName;
	String stdDob;
	String stdMarks;
	String stdGrade;
	//constructor Method//
	public UsingConstructor(String a,String b,String c, String d) {
	
		stdName=a;
		stdDob=b;
		stdMarks=c;
		stdGrade=d;
		}
	//method//
	public void print(String stdmarks) {
		System.out.println(90);
		
	}
	//Main method//
	public static void main(String[] args) {
		UsingConstructor u1=new UsingConstructor("Anu","10/21/2010","50","B");
		System.out.println(u1.stdName);
		System.out.println(u1.stdDob);
        System.out.println(u1.stdMarks);
		System.out.println(u1.stdGrade);
		UsingConstructor u2=new UsingConstructor("Laxmi","11/11/2000","40","c");
		System.out.println(u2.stdName);
		System.out.println(u2.stdDob);
        System.out.println(u2.stdMarks);
		System.out.println(u2.stdGrade);


		
		
	}




	

}
