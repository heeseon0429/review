package poly;

abstract public class Item {

	protected String num;
	protected String name;

	public Item () {
	}
	public Item(String num, String name) {
		this.num = num;
		this.name = name;
	}
	abstract public void output();
	}

