import java.util.Scanner;

public class TypeCast {

	public static void main(String[] args) {
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		
		System.out.println("Enter value for s:");
		Scanner s1 = new Scanner (System.in);
		s=s1.nextShort();
		
		System.out.println("Enter value for b");
		Scanner s2= new Scanner (System.in);
		b=s2.nextByte();
		
		i=s+b;
		System.out.println("i= " +i);
		
		l=i+s;
		System.out.println("l= " +l);

		f=l+i;
		System.out.println("f= " +f);
		
		d=l+f;
		System.out.println("d= " +d);
	}

}
