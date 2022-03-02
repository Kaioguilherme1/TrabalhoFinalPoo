package Classes;

import Enums.Focinho;
import Enums.Pelo;

public class HuskySiberiano extends Cachorro{

	public HuskySiberiano() {
		super();
		setPelo(Pelo.MEDIO);
		setFocinho(Focinho.MESOCEFALICOS);
		cores();
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Husky Latindo e uivando");
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
		getVariacaoCor().put(1, "Preto e branco");
		getVariacaoCor().put(2, "Cinza Prateado");
		getVariacaoCor().put(3, "Marrom");
		getVariacaoCor().put(4, "Cobre");
		getVariacaoCor().put(5, "Branco");
		getVariacaoCor().put(6, "Negro Prateado");
	}

}
