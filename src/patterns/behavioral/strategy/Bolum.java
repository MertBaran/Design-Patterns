package patterns.behavioral.strategy;

public enum Bolum {

	SAYISAL("Sayisal"),
	SOZEL("Sözel"),
	ESITAGIRLIK("Eşit ağırlık");
	
	private String bolum;
	
		Bolum(String bolum) {
		this.bolum=bolum;
		
		
	}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return bolum;
		}
	
}
