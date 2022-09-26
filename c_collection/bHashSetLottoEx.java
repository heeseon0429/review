package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> lottos = new HashSet<Integer>(); //int가 아니라 integer를 사용해야함.
		
		//for(int i=0; i<6;  i++) {
		while(lottos.size()<6) {	//6개의 값이 나와야하는데 for문을 쓰면 5개의 값이 나올때가 있기때문에 while 사용
			int num = (int)(Math.random()*45)+1;
			lottos.add(num);
		}
		
		System.out.println(lottos);
	
		ArrayList list = new ArrayList(lottos);
		Collections.sort(list);
		System.out.println(list);
	}
	
	
}
