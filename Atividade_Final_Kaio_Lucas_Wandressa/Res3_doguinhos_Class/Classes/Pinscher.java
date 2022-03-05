package Classes;

import Enums.Focinho;
import Enums.Pelo;

public class Pinscher extends Cachorro{
	
	public Pinscher() {
		super();
		cores();
		setPelo(Pelo.CURTO);
		setFocinho(Focinho.BRAQUICEFALICOS);
	}

	@Override
	public void emitirSom() {
		System.out.println("Latido de Pinscher");
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
	public void cores() {
		getVariacaoCor().put(1, "Preto e Ferrugem");
		getVariacaoCor().put(2, "Vermelho-Cervo");
		getVariacaoCor().put(3, "Chocolate e Ferrugem");
	}

}
