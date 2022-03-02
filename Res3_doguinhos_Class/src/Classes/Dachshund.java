package Classes;

import Enums.Focinho;
import Enums.Pelo;

public class Dachshund extends Cachorro{

	public Dachshund() {
		super();
		setFocinho(Focinho.DOLICOCEFALICOS);
		cores();
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Latido de Dachshund");
		
	}
	
	//Dachshund apresenta variacao na sua pelagem
	public void definirPelo() {
		System.out.println("Qual o tipo de pelo?");
		System.out.println("- curto");
		System.out.println("- longo");
		System.out.println("- duro");
		String data_in = LerDados().nextLine();
		if(data_in.equals("curto")) {
			setPelo(Pelo.CURTO);
		}else if (data_in.equals("longo")){
			setPelo(Pelo.LONGO);
		}else if (data_in.equals("duro")){
			setPelo(Pelo.DURO);
		}else{
			System.out.println("Digite um valor valido");
		}
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
		getVariacaoCor().put(1, "Preto");
		getVariacaoCor().put(2, "Creme");
		getVariacaoCor().put(3, "Vermelho");
		getVariacaoCor().put(4, "Chocolate");
		getVariacaoCor().put(5, "Preto e Canela");
		getVariacaoCor().put(6, "Negro Prateado");
	}

}
