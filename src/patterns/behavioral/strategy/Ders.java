package patterns.behavioral.strategy;

public enum Ders {

	TURKCE("Türkçe"),
	MATEMATIK("Matematik"),
	FEN("Fen"),
	SOSYAL("Sosyal");
	
	
	private String ders;
	
	Ders(String ders){
		this.ders = ders;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ders;
	}
}
