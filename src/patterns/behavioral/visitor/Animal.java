package patterns.behavioral.visitor;

public interface Animal {
	void eat();
	
	String getName();
	
	void accept(Feeder feeder);
}
