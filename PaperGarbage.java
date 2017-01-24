public class PaperGarbage extends Garbage {
	boolean isSqueezed;
	public PaperGarbage(String name, boolean isSqueezed){
		super(name);
		this.isSqueezed = isSqueezed;
	}
	public boolean isSqueezed(){
		return this.isSqueezed;
	}
	public void squeeze(){
		this.isSqueezed = true;
	}
	
}

