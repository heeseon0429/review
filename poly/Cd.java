package poly;

public class Cd extends Item {

	String singer;

	public Cd() {}

	public Cd(String num, String name, String singer ) {
		super.num = num;
		super.name = name;

		this.singer = singer;
	}
	public void output() {
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);
		System.out.println("가수 : " + singer);
	}

}
