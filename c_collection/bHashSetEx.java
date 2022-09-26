package c_collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		HashSet <String> set = new HashSet<String>();
		set.add("rabbit");
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");	
		//set은 순서를 저장하지 않고 중복해서 들어가지 못함
		//generics 사용
		
		System.out.println( set );		
	}
}
