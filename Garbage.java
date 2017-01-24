public class Garbage {
	String name;
	public Garbage(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public static void main(String[] args){
		Garbage a = new Garbage("lufasz");
		System.out.println(a.getName());
	}
}
