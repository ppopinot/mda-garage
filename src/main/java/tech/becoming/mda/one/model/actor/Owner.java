package tech.becoming.mda.one.model.actor;

import tech.becoming.mda.one.model.garage.DigitalKey;

public class Owner {
	
	private DigitalKey key;

	public Owner(DigitalKey key) {
		this.key = key;
	}
	
	public void open() {
		key.open();
	}
}
