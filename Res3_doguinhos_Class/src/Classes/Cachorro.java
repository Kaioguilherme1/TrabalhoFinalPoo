package Classes;

import java.util.HashMap;

import Enums.Focinho;
import Enums.Pelo;

public abstract class Cachorro {
	//atributos
    private String cao_nome;
    private boolean dono = false;
    private String dono_nome;
    private Pelo pelo; //tipo pelo
    private Focinho focinho;
    private String sentimento;
    protected HashMap<Integer, String> corPelo;
    private boolean saude = true;
	
    
    //construtor para um cachorro que tem um dono
    //ou seja, já tem nome
    public Cachorro(String cao_nome) {
		super();
		this.cao_nome = cao_nome;
		this.corPelo = new HashMap<Integer, String>();
	}
    
    //construtor para um cachorro que não tem dono
    public Cachorro() {
    	
    }

	public String toString() {
		return  "pelo:" + pelo + ", focinho:" + focinho
				+ ", sentimento:" + sentimento + " Cores:" + corPelo;
		
	}



	//----metodos----
    public boolean Passear() {
    	if(this.dono == true) {
    		System.out.println("Vamos passear "+this.cao_nome+ "!");
    		return true;
    	}else {
    		System.out.println(this.cao_nome+ " ,doguinho nao tem dono :(");
    		System.out.println(dono);
    		return false;
    	}
    }
    
    public boolean Correr() {
    	if(this.saude == true) {
    		//Sï¿½ testando depois implementar certo a saida
    		System.out.println("Doguinho correndo livremente");
    		return true;
    	}else {
    		System.out.println("Doguinho precisa de cuidados medicos");
    		return false;
    	}
    }
    
    //definir se o cï¿½o tem dono ou nï¿½o
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
    
    
    public abstract void emitirSom();
    
    //-----------
    
      
    //----GETTERS E SETTERS----
	public String getCao_nome() {return cao_nome;}

	public void setCao_nome(String cao_nome) {this.cao_nome = cao_nome;}

	public boolean isDono() {return dono;}

	public void setDono(boolean dono) {this.dono = dono;}

	public String getDono_nome() {return dono_nome;}

	public void setDono_nome(String dono_nome) {this.dono_nome = dono_nome;}

	public Pelo getPelo() {return pelo;}

	public void setPelo(Pelo pelo) {this.pelo = pelo;}

	public Focinho getFocinho() {return focinho;}

	public void setFocinho(Focinho focinho) {this.focinho = focinho;}

	public String getSentimento() {return sentimento;}

	public void setSentimento(String sentimento) {this.sentimento = sentimento;}

	public HashMap<Integer, String> getCorPelo() {return corPelo;}

	public void setCorPelo(HashMap<Integer, String> corPelo) {this.corPelo = corPelo;}

	public boolean isSaude() {return saude;}

	public void setSaude(boolean saude) {this.saude = saude;}
    
}
