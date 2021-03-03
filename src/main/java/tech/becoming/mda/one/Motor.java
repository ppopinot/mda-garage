package tech.becoming.mda.one;

public class Motor {
	
	private Gate gate;
	
	public Motor(Gate gate) {
		super();
		this.gate = gate;
	}

	public void openGate() {
		turnGears();
		gate.open();
	}

	private void turnGears() {
		// TODO Auto-generated method stub
		
	}

}
