package practise_Java;

public class SwappingNumbers {
	public static void main(String[] arg) {
		int a=10, b=200;
		System.out.println(b);
		int flag;
		
		flag=a;
		a=b;
		b=flag;
		
		a=a+b; //30
		b=a-b; //30-20=10
		a=a-b; //30-10=20
		
		a=a*b; //10*20=200
		b=a/b; //200/20=10;
		a=a/b; //200/10=20
		
		b=a+b-(a=b);
	}

	
}
