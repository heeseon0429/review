package poly;

public class Dvd extends Item{


	String actor;
	String director;

	public Dvd() {	}

	public Dvd(String num, String name, String actor, String director) {
		super.num = num;
		super.name = name;

		this.actor = actor;
		this.director = director;
	}
	public void output() {
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);
		System.out.println("배우 : " + actor);
		System.out.println("감독 : " + director);
	}
}
