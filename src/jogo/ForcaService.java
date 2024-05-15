package jogo;

import java.util.ArrayList;

public class ForcaService {
	
	ArrayList<String> desenhoForca = new ArrayList<String>();
	
	public ForcaService() {
		estruturaForca();
	}
	
	public ArrayList<String> estruturaForca(){
		desenhoForca.add("  ___ ");
		desenhoForca.add(" |   |");
		desenhoForca.add(" |");
		desenhoForca.add(" |");
		desenhoForca.add(" |");
		desenhoForca.add(" |");
		desenhoForca.add("---");
		return desenhoForca;
	}
	
	public void desenhaForca() {
		for(String linha : desenhoForca) {
			System.out.println(linha);
		}
	}
	
	public ArrayList<String> desenharErros(int erros){
		
		if(erros == 1) {
			desenhoForca.set(2, " |   O");
		}
		if(erros == 2) {
			desenhoForca.set(3, " |   |");
		}
		if(erros == 3) {
			desenhoForca.set(3, " |  /|");
		}
		if(erros == 4) {
			desenhoForca.set(3, " |  /|\\");
		}
		if(erros == 5) {
			desenhoForca.set(4, " |  /");
		}
		if(erros == 6) {
			desenhoForca.set(4, " |  / \\");
		}
		return desenhoForca;
	}

}