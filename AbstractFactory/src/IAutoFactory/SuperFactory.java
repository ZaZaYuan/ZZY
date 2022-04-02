package IAutoFactory;

public class SuperFactory implements IAutoFactory {
	public ISport creatSport() {
		return new SuperSport();
	}
	public ISUV creatSUV() {
		return new SuperSUV();
		
	}

}



