package tech.becoming.mda.one;

public class Owner {
	
	private DigitalKey key;

	public Owner(DigitalKey key) {
		super();
		this.key = key;
	}
	
	public void open() {
		key.open();
	}
}
