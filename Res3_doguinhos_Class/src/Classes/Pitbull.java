package Classes;

import Enums.Focinho;
import Enums.Pelo;

public class Pitbull extends Cachorro {
	

	public Pitbull() {
		super();
		setFocinho(Focinho.MESOCEFALICOS);
		setPelo(Pelo.CURTO);
		cores();
	}

	@Override
	public void setCorPelo(){
		System.out.println("Cores da Raca: ");
		for (Integer key: getVariacaoCor().keySet()){  
			System.out.println(key+ " = " + getVariacaoCor().get(key));
		}
		System.out.println("Qual a cor do seu doguinho?");
    	Integer data_in = LerDados().nextInt();
		setCorPelo(getVariacaoCor().get(data_in));
	}

	@Override
	public void emitirSom() {
		System.out.println("\nLatido de pitbull");
	}
	
	@Override
	public void cores() {
		getVariacaoCor().put(1, "Marrom(Chocolate)");
		getVariacaoCor().put(2, "Preto");
		getVariacaoCor().put(3, "Ruivo");
		getVariacaoCor().put(4, "Cinza");
		getVariacaoCor().put(5, "Branco");
		getVariacaoCor().put(6, "Tricolor");
		getVariacaoCor().put(7, "Merle");
	}

}
