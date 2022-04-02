package IAutoFactory;

public class MedFactory implements IAutoFactory {
	public ISport creatSport() {
		return new MedSport();
	}
	public ISUV creatSUV() {
		return new MedSUV();
		
	}

}



