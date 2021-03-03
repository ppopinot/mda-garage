package tech.becoming.mda.one;

public class Gate extends Thread{
	
	public Gate() {
		
	}
	
	public void open() {
		int i = 0;
		while(i <= 100) {
			System.out.println("La porte est ouverte a "+i+"%");
			try {
				Thread.sleep(100);
				i++;
			} catch (InterruptedException e) {
				System.out.println("Erreur lors de l'ouverture de la porte");
				e.printStackTrace();
			}
		}
		System.out.println("Bienvenue dans votre garage");
	}
}
