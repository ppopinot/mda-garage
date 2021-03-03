package fr.miage.mda;

public class DigitalKey {
	
	private DigitalLock lock;
	
	public DigitalKey(DigitalLock lock) {
		super();
		this.lock = lock;
	}

	public void open() {
		lock.open(this);
	}
	
}
