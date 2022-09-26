
package c_collection;
import java.util.ArrayList;

class aArrayListEx1
{
	public static void main(String[] args) 
	{
		ArrayList result = dataSet();
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for(int i = 0; i <result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

	static ArrayList dataSet()
	{
		String	name = "김태희";
		int		age = 31;	//int age = 31;
		double	height = 162.3;

		ArrayList list = new ArrayList(); //몇개를 쓰는지 의미가 없어서 잘안씀
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;	//값을 한덩어리로 만들어서 위로 올려주는 것
	}
}
