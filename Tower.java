import java.util.LinkedList;

public abstract class Tower {
	private LinkedList<Flyable> observers;

	public void register(Flyable flyable) {
		//TODO register
	}

	public void unregister(Flyable flyable) {
		//TODO unregister
	}

	protected void conditionsChanged(){
		//TODO condition changed
	}
}
