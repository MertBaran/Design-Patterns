package patterns.behavioral.strategy;

public class SayisalStratejisi implements SinavStratejisi{

	@Override
	public Ders getBirinci() {
		// TODO Auto-generated method stub
		return Ders.MATEMATIK;
	}

	@Override
	public Ders getIkinci() {
		// TODO Auto-generated method stub
		return Ders.FEN;
	}

	@Override
	public Ders getUcuncu() {
		// TODO Auto-generated method stub
		return Ders.TURKCE;
	}

	@Override
	public Ders getDorduncu() {
		// TODO Auto-generated method stub
		return Ders.SOSYAL;
	}

}
