public class PlasticGarbage extends Garbage {
	boolean isClean;
	public PlasticGarbage(String name, boolean isClean){
		super(name);
		this.isClean = isClean;
		
	}
	public boolean isClean(){
		return this.isClean;
	}
	public void clean(){
		this.isClean = true;
	}

}

