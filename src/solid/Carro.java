package solid;

public class Carro {
	int velocidade = 0;
	int combustivel = 0;
	boolean isLigado = false;
	
	public void acelerarCarro() {
		this.velocidade++;
	}
	
	public void freiarCarro() {
		if(velocidade > 1) {
			this.velocidade--;

		} else {
			this.velocidade = 0;
		}
	}
	
	//Esse método não faz parte dessa classe, não é obrigação
	//do carro se abastecer, essa função é de outro objeto
	//no caso o posto. Por isso usamos um método da classe
	//posto para nos abastecer
	public void abastecerCarro() {
		Posto posto = new Posto();
		posto.abastecer(this);
	}
	
	public void queimarCombustivel() {
		this.combustivel--;
	}
	
	public void ligarCarro() {
		this.isLigado = true;
	}
	
}
