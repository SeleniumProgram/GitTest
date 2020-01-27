package varibleProgram;

public class Class {//class//
	
	int x;
	int y;
	

public Class(int x,int y) { //This Keyword//
	this.x=x;
	this.y=y;
}
public void print(int x,int y) {//method//
	System.out.println(""+x);
}
public static void main(String[] args) {//main method//
	Class obj=new Class(1,2);
	System.out.println();
	System.out.println(obj.x);
	System.out.println(obj.y);

}
}









