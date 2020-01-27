package varibleProgram;

public class Method {   //Class
	public void add() {    //Method//
		String s1="Automation"; //
		String s2= "Selenium";
		String s3=s1+s2;
		System.out.println(s3);
				
	}
	public static void main(String[] args) {  //Main Method//
		Method obj=new Method();  //Object//
		obj.add();
		System.out.println();
	}

}
