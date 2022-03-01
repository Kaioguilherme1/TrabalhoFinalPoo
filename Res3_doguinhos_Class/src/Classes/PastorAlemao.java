package Classes;


import Enums.Focinho;
import Enums.Pelo;

public class PastorAlemao extends Cachorro {

	
	public PastorAlemao() {
		super();
		setFocinho(Focinho.MESOCEFALICOS);
		this.corPelo.put(1, "Capa Preta");
		this.corPelo.put(2, "Branco");
		System.out.println(this.corPelo.get(1));
	}


	public PastorAlemao(String cao_nome) {
		super(cao_nome);
		setFocinho(Focinho.MESOCEFALICOS);
	}

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au! ");
		
	}
	
	public void definirPelo(String entrada) {
		if(entrada.equals("curto")) {
			setPelo(Pelo.CURTO);
		}else if (entrada.equals("longo")){
			setPelo(Pelo.LONGO);
		}else {
			System.out.println("Digite um valor válido");
		}
	}

	

	

}
