package Classes;

import Enums.Focinho;
import Enums.Pelo;

public class Pitbull extends Cachorro {
	

	public Pitbull() {
		super();
		setFocinho(Focinho.BRAQUICEFALICOS);
		setPelo(Pelo.CURTO);
	}

	public Pitbull(String cao_nome) {
		super(cao_nome);
		setFocinho(Focinho.BRAQUICEFALICOS);
		setPelo(Pelo.CURTO);

	}

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au! ");
		
	}

}
