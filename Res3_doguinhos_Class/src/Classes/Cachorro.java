package Classes;

import java.util.HashMap;
import java.util.Scanner;

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
    private HashMap<Integer, String> VariacaoCor; //defini a variacao de cores para a raca
	private String corPelo; //defini uma cor para o cao
    private boolean saude = true;
    private String situcaoSaude;
	



	//construtor 
    public Cachorro() {
    	super();
    	this.VariacaoCor = new HashMap<Integer, String>();
    }

	//----metodos----
    
    public String toString() {
		if(saude == true){
			return  "Doguinho: " + cao_nome + ",  tem o pelo:" + pelo + ", focinho:" + focinho
				+ "\nSentindo:" + sentimento + ", Cor:" + corPelo + ", Dono: "+ dono_nome;
		}else{
			return  "Doguinho: " + cao_nome + ",  tem o pelo:" + pelo + ", focinho:" + focinho
				+ "\nSentindo:" + sentimento + ", Cor:" + corPelo + ", Dono: "+ dono_nome
				+ "\nSituacao do doguinho: " + situcaoSaude;
		}
	}
    
    public void Passear() {
    	if(this.dono == true) {
    		System.out.println("Vamos passear "+this.cao_nome+ "!");
    	}else {
    		System.out.println("Doguinho nao tem dono :(");
    	}
    }
    
    public void Correr() {
    	if(this.saude == true) {
    		System.out.println("Doguinho correndo livremente");
    	}else {
    		System.out.println("Doguinho precisa de cuidados medicos, antes de correr");
    	}
    }
    
    //Verificar tem dono ou nao
    public void TemDono() {
    	if(dono == true) {
			System.out.println("O cachorro ja tem dono");
    	}else{
    		System.out.println("O cachorro ainda nao tem dono");
			System.out.println("Para adotar ou dar o cachorro escolher a opcao 2");
    	}
    }
    
	//adotar / novo dono 
    public void NovoDono() {
		System.out.println("Qual o nome do novo dono?");
    	String data_in = LerDados().nextLine();
    	if(dono == true) {
    		this.dono_nome = data_in;
			System.out.println("Parabens "+this.dono_nome +", voce e o novo dono do doguinho :)");
    	}else {
    		this.dono_nome = data_in;
			System.out.println("Qual o nome para o doguinho escolheu?");
    		this.cao_nome = LerDados().nextLine();
    		this.dono = true;
    		System.out.println("Parabens "+this.dono_nome +", voce e o primeiro dono do doguinho :)");
    	}
    }
    
    //metodo para descrever a situacao de saude do dog
    public void SituacaoSaude() {
    	System.out.println("O doguinho esta bem de Saude? s/n");
    	String data_in = LerDados().nextLine();
    	if(data_in.equals("n")) {
    		this.saude = false;
    		System.out.println("Descreva a situacao de saude do doguinho");
    		this.situcaoSaude = LerDados().nextLine();
    	}else if(data_in.equals("s")){
    		System.out.println("Excelente!");
    	}else{
    		System.out.println("Digite somente s/n !");
    	}
    	
    }
    
    //metodo para entrada de dados
    public Scanner LerDados() {
    	Scanner ler = new Scanner(System.in);
    	return ler;
    }
    
    public abstract void emitirSom();
    
    public abstract void cores();
    
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

	public void setSentimento() { //definir sentimento do doguinho
		System.out.println("Como o doguinho esta se sentindo?");
    	String data_in = LerDados().nextLine();
		this.sentimento = data_in;
	}

	public HashMap<Integer, String> getVariacaoCor() {return VariacaoCor;}

	public void setVariacaoCor(HashMap<Integer, String> VariacaoCor) {this.VariacaoCor = VariacaoCor;}

	public boolean isSaude() {return saude;}

	public void setSaude(boolean saude) {this.saude = saude;}
	
	public String getSitucaoSaude() {return situcaoSaude;}

	public void setSitucaoSaude(String situcaoSaude) {this.situcaoSaude = situcaoSaude;}

	public String getCorPelo() {return corPelo;}

	public void setCorPelo(String corPelo) {this.corPelo = corPelo;} //

	public void setCorPelo() {};
   
}
