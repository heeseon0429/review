
package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		Object[] result = dataSet();
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for(int i = 0; i <result.length; i++) {
			System.out.println(result[i]);
		}
	}

	static Object[] dataSet()
	{
		String	name = "김태희";
		int		age = 31;	//int age = 31;
		double	height = 162.3;

		Object [] obj = new Object[3];
		obj[0] =  name;
		obj[1] =  age;
		obj[2] =  height;
		return obj;		//값을 한덩어리로 만들어서 위로 올려주는 것
	}
}
