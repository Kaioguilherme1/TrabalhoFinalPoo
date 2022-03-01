package Classes;

import Enums.Focinho;

public class Dachshund extends Cachorro{

	
	
	public Dachshund() {
		super();
		setFocinho(Focinho.DOLICOCEFALICOS);
		
	}

	public Dachshund(String cao_nome) {
		super(cao_nome);
		setFocinho(Focinho.DOLICOCEFALICOS);
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au! ");
		
	}

}
