package calci;
import calci.Add.*;
import calci.Sub.*;
import calci.Mul.*;
import calci.Div.*;
import java.util.*;
public class Calculator {
	public static void main(String []args)
	{
		Add q=new Add();
		Sub s=new Sub();
		Mul m=new Mul();
		Div d=new Div();
		int a,b,x=0,o;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		System.out.println("1st value");
		a=sc.nextInt();
		System.out.println("2nd value");
		b=sc.nextInt();
		System.out.println("enter which operation you want to perform");
		System.out.println("1:addition");
		System.out.println("2:subtarction");
		System.out.println("3:multiplication");
		System.out.println("4:division");
		o=sc.nextInt();
		if(o==1)
		{
		x=q.addnum(a, b);	
		}
		else if(o==2)
		{
			x=s.subnum(a, b);
		}
		else if(o==3)
		{
			x=m.mulnum(a, b);
		}
		else if(o==4)
		{
			x=d.divnum(a, b);
		}
		System.out.println("your value is:"+x);
		}
}
