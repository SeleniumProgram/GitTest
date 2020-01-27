package varibleProgram;
//class//
public class This {
	String s;
	String s1;
	String s2;
	//constructor//
	public This(String s,String s1, String s2){
	this.s=s;
	this.s1=s1;
	this.s2=s2;
	
}
//method//
public void print(String name) {
	System.out.println(""+name);
}
//main method//
public static void main(String[] args) {
	This obj=new This("ABCD","XYZ","EFGH");
	System.out.println("obj data");
	System.out.println(obj.s);
	System.out.println(obj.s1);
	System.out.println(obj.s2);
	This obj1=new This("WHAT","WHY","WHO");
	System.out.println("obj1 data");
	System.out.println(obj1.s);
	System.out.println(obj1.s1);
	System.out.println(obj1.s2);

	
}
}


