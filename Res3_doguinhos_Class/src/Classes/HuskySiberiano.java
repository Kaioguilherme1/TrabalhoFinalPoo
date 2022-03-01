package Classes;

import Enums.Focinho;
import Enums.Pelo;

public class HuskySiberiano extends Cachorro{

	public HuskySiberiano() {
		super();
		setPelo(Pelo.MEDIO);
		setFocinho(Focinho.MESOCEFALICOS);
	}

	public HuskySiberiano(String cao_nome) {
		super(cao_nome);
		setPelo(Pelo.MEDIO);
		setFocinho(Focinho.MESOCEFALICOS);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Auuuuuuuuuuuu!");
		
	}

}
