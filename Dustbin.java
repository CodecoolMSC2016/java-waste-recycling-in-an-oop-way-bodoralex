import java.util.ArrayList;

public class Dustbin {
	
	String color;
	ArrayList<PaperGarbage> paperContent = new ArrayList<>();
	ArrayList<PlasticGarbage> plasticContent = new ArrayList<>();
	ArrayList<Garbage> houseWasteContent = new ArrayList<>();
	
	public Dustbin(String color){
		this.color = color;
	}
	public void throwOutGarbage(Garbage garbage)throws DustbinContentException{
	
		if(garbage instanceof PlasticGarbage){
			PlasticGarbage plasticGarbage = (PlasticGarbage) garbage;
			if(plasticGarbage.isClean()){
				plasticContent.add(plasticGarbage);
			}else throw new DustbinContentException();

		}else if(garbage instanceof PaperGarbage){
			PaperGarbage paperGarbage = (PaperGarbage) garbage;
			if(paperGarbage.isSqueezed()){
				paperContent.add(paperGarbage);
			}else throw new DustbinContentException();
			
		}else if(garbage instanceof Garbage){
			houseWasteContent.add(garbage);
		
		}else throw new DustbinContentException();
		
	}
	public PaperGarbage[] getPaperContent(){
		return paperContent.toArray(new PaperGarbage[0]);
	}
	public PlasticGarbage[] getPlasticContent(){
		return plasticContent.toArray(new PlasticGarbage[0]);
	}
	public Garbage[] getHouseWasteContent(){
		return houseWasteContent.toArray(new Garbage[0]);
	}
	public void emptyContents(){
		paperContent.clear();
		plasticContent.clear();
		houseWasteContent.clear();
	}
}
