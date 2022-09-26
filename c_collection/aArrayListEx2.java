package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList<String>(4);	// 넣고자하는 자료혛을 넣어주면 노란표시가 사라짐
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정 
		//향상된 for문을 사용하려면 사실상 generics가 필요함
		
		//3번째 fox를 rat으로 바꿈(set을 바꾼다)
		list.set(3, "rat");	
		System.out.println(list);
		
		//1번째 zebra가 없어지면서 앞으로 떙겨짐
		list.remove(1);
		System.out.println(list); 
		
		Collections.sort(list);
		System.out.println(list);
		
		//System.out.println(list);
		//original for 문
		for(int i =0; i < list.size(); i++) {
			String data = (String)list.get(i);
			System.out.println(data);  
		}
		
		//향상된 for 문
		for (String data : list) {	//오른쪽이 집합. list에서 data를 뽑아냄
			System.out.println(data);
		}
	}
}
