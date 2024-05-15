package jogo;

public class ContadorTempo extends Thread{
	private int segundos;
	
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				segundos++;
			}
		} catch(InterruptedException e){
		}
	}
	
	public int getSegundos() {
		return segundos;
	}

}