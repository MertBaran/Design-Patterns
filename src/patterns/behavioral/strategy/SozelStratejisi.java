package patterns.behavioral.strategy;

public class SozelStratejisi implements SinavStratejisi{
	
	@Override
	public Ders getBirinci() {
		// TODO Auto-generated method stub
		return Ders.TURKCE;
	}

	@Override
	public Ders getIkinci() {
		// TODO Auto-generated method stub
		return Ders.SOSYAL;
	}

	@Override
	public Ders getUcuncu() {
		// TODO Auto-generated method stub
		return Ders.MATEMATIK;
	}

	@Override
	public Ders getDorduncu() {
		// TODO Auto-generated method stub
		return Ders.FEN;
	}

}
