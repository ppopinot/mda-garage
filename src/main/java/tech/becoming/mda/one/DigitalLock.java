package fr.miage.mda;

public class DigitalLock {
	
	private Motor motor;
	
	public DigitalLock(Motor motor) {
		super();
		this.motor = motor;
	}

	public boolean validateKey(DigitalKey key) {
		return true;
	}

	public void open(DigitalKey digitalKey) {
		if(validateKey(digitalKey)) {
			motor.openGate();
		}
	}
	
}
