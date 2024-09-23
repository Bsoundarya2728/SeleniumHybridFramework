package practise_Java;

public class FindUpperCaseCharacters {
 
public static void main(String[] arg) {	
	
String name ="QualizeAHJlIndia";
int count=0;
char ch;
	for(int i =0;i<name.length();i++)
	{
		ch=name.charAt(i);
		//Character.is
//		if(Character.isUpperCase(name.charAt(i)))
//		{
//			count=count+1;
//		}
		if(ch>='A' && ch<='Z')
		{
		count=count+1;
		}
	
	}
	
	System.out.println(count);
}
}
