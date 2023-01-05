package patterns.behavioral.strategy;

public class Ogrenci {
	
	private Bolum bolum;
	private SinavStratejisi sinavStratejisi;
	
	
	Ogrenci(Bolum bolum){
		this.bolum=bolum;
		
		if(bolum == null)
			throw new NullPointerException("bolumu olmayan ogrenci olmaz");
		
		
		switch(bolum){
		
		case SAYISAL: sinavStratejisi = new SayisalStratejisi(); break;
		
		case SOZEL: sinavStratejisi = new SozelStratejisi(); break;
		
		case ESITAGIRLIK:  sinavStratejisi = new EsitAgirlikStratejisi(); break;
		
		default: break;
			
		}
		
	}
	
	public String getOncelikSiralamasi() {
		
		System.out.println(bolum + " icin strateji: ");
		
		String siralama = "Önce "+ sinavStratejisi.getBirinci() + " çöz. \n" +
				"sonra " + sinavStratejisi.getIkinci() + " çöz.\n" +
				"daha sonra " + sinavStratejisi.getUcuncu() + " çöz. \n" + 
				"zaman kalırsa " + sinavStratejisi.getDorduncu() + " çözersin. \n" ;
		
		return siralama;
		
	}
}
