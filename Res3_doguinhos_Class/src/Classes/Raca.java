package Classes;



public class Raca {
    //atributos
    private String nome;
    private String Cor_Do_Pelo;
    private String Tamanho_do_pelo;
    private String Tipo_do_focinho;
    
    //construtor
    public Raca(String nome, String cor_Do_Pelo, String Tamanho_do_pelo, String Tipo_do_focinho){
        this.nome = nome;
        this.Cor_Do_Pelo = cor_Do_Pelo;
        this.Tamanho_do_pelo = Tamanho_do_pelo;
        this.Tipo_do_focinho = Tipo_do_focinho;
    }

    //gets
    public String get_Nome(){
        return this.nome;
    }
    


}
