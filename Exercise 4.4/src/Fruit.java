public class Fruit {
	
	protected String name; //universe cannot access the data
	public Fruit(String name) {
		this.name = name;
	    System.out.println("Fruit constructor is invoked");
	  }
}
