package varibleProgram;

public class MtehodUsingHardcode {
	public int mul(int a, int b,int c) {
	int d=a*b*c;
		System.out.println(d);
		return d;
		}
	public static void main(String[] args) {
		MtehodUsingHardcode obj1=new MtehodUsingHardcode() ;
			obj1.mul(100,200,300);
		System.out.println();
	}
}

