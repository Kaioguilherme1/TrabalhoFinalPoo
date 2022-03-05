package Classes;


import Enums.Focinho;
import Enums.Pelo;

public class PastorAlemao extends Cachorro {

	public PastorAlemao() {
		super();
		setFocinho(Focinho.MESOCEFALICOS);
		cores();
	}

	@Override
	public void emitirSom() {
		System.out.println("Latido de Pastor Alemao");
		
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
	
	//Pastor alemao apresenta variacao na sua pelagem
	public void definirPelo() {
		System.out.println("Qual o tipo de pelo?");
		System.out.println("- curto");
		System.out.println("- longo");
    	String data_in = LerDados().nextLine();
		if(data_in.equals("curto")) {
			setPelo(Pelo.CURTO);
		}else if (data_in.equals("longo")){
			setPelo(Pelo.LONGO);
		}else {
			System.out.println("Digite um valor valido ou tudo minusculo");
		}
	}

	@Override
	public void cores() {
		getVariacaoCor().put(1, "Capa Preta");
		getVariacaoCor().put(2, "Cinza");
		getVariacaoCor().put(3, "Preto");
		getVariacaoCor().put(4, "Branco");
		
	}

	

	

}
