package varibleProgram;

public class Twoprogarmcallingone {
	String s1="Automation";
	public static void main(String[] args) {//main method//
Oneprogramcalltoanotherprogram obj=new Oneprogramcalltoanotherprogram(); //object//
		System.out.println(obj.s);//calling first method
		Twoprogarmcallingone obj1=new Twoprogarmcallingone();//object//
		System.out.println(obj1.s1); //calling Second Obj//
		
	}

}
