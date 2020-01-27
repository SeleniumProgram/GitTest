package varibleProgram;

public class MethodRet {
	public int div()//Method//
	{
		int x=100;
		int y=2;
		int z=x/y;
		return z;
		
	}
public static void main(String[] args) {
	MethodRet obj=new MethodRet();
	int result=obj.div();
	System.out.println(result);
}
}
