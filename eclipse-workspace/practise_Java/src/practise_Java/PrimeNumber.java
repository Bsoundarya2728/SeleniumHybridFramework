package practise_Java;

public class PrimeNumber {
	static public void main(String[] arg) {
	
	int n =11;
	int count=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0) {
			count=count+1;
		}
	}
	if(count==2) {
		System.out.println("prime ");
		System.out.println(10+10+"prime "+10+20);
	}
	else
	System.out.println(" not prime ");

}
}
