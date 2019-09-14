public abstract class Aircraft {
	protected long 			id;
	protected String		name;
	protected Coordinates	coordinates;

	private long			idCounter;

	protected Aircraft()
	{

	}

	protected Aircraft(String name, Coordinates coordinates)
	{
		//TODO add realization constructor's body
	}

	private long nextId() {
		return 0; //TODO add realization nextId
	}
}
