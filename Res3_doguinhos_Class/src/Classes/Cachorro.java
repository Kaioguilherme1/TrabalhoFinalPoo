package Classes;

import Enums.CorDoPelo;
import Enums.Focinho;
import Enums.Pelo;

public class Cachorro {
	//atributos
    private String cao_nome;
	private boolean dono = false;
	private String dono_nome;
	private Pelo pelo;
    private Focinho focinho;
    private String raca;
    private String sentimento;
    private CorDoPelo cor_de_pelo;
    private boolean saude = false;
    
    //const
    public Cachorro(String nome, String raca, String sentimento) {
		super();
		this.cao_nome = nome;
		this.pelo = Pelo.CURTO;
		this.focinho = Focinho.BRAQUICEFALICOS;
		this.raca = raca;
		this.sentimento = sentimento;
		this.cor_de_pelo = CorDoPelo.CINZA;
	}//implementar para se ter os enums no próprio construtor   

	@Override
	public String toString() {
		return  cao_nome + ", pelo:" + pelo + ", focinho:" + focinho + ", raca:" + raca
				+ ", sentimento:" + sentimento + ", cor do pelo:" + cor_de_pelo;
	}

	public Cachorro() {
		
	}

	//----metodos----
    public boolean Passear() {
    	if(this.dono == true) {
    		System.out.println("Vamos passear "+this.cao_nome+ "!");
    		return true;
    	}else {
    		System.out.println(this.cao_nome+ " ,doguinho não tem dono :(");
    		System.out.println(dono);
    		return false;
    	}
    }
    
    public boolean Correr() {
    	if(this.saude == true) {
    		//Só testando depois implementar certo a saida
    		System.out.println("Doguinho correndo livremente");
    		return true;
    	}else {
    		System.out.println("Doguinho precisa de cuidados médicos");
    		return false;
    	}
    }
    
    //definir se o cão tem dono ou não
    public boolean TemDono(String entrada_dono) {
    	if(entrada_dono == "sim") {
    		System.out.println("Digite qual o nome do dono.");
    		//implementar o scanner para nome do dono
    		//this.nome_dono = <entrada do scanner>
    		this.dono = true;
    		return true;
    	}else if(entrada_dono == "não"){
    		return false;
    	}else {
    		System.out.println("Digite sim/não!");
    		return false;
    	}
    }
    
    public void NovoDono(String novo_dono) {
    	if(dono == true) {
    		this.dono_nome = novo_dono;
    	}else {
    		this.dono_nome = novo_dono;
    		this.dono = true;
    		System.out.println("Parabéns "+this.dono_nome +", você é o primeiro dono do(a) "+this.cao_nome);
    	}
    }
    
    //-----------
    
      
    //----Gets----
	public String getNome() {
		return cao_nome;
	}
	public boolean isDono() {
		return dono;
	}
	public Pelo getPelo() {
		return pelo;
	}
	public Focinho getFocinho() {
		return focinho;
	}
	public String getRaca() {
		return raca;
	}
	public String getSentimento() {
		return sentimento;
	}
	public CorDoPelo getCor_de_pelo() {
		return cor_de_pelo;
	}

	public boolean getSaude() {
		return saude;
	}
	public String getDono_nome() {
		return dono_nome;
	}
    
}
