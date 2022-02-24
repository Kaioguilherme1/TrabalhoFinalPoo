package Classes;


import java.util.ArrayList;


public class Disciplina {
    
    //atributos
    private String Nome;
    private String Sigla;
    private String Professor;
    private int Periodo; //semestres
    private Horario horario; 
    private ArrayList<Atividade> Atividades;
    private ArrayList<Estudante> Alunos;

    public Disciplina(String Nome, String Sigla, String Professor, int Periodo) {
        this.Nome = Nome;
        this.Sigla = Sigla;
        this.Professor = Professor;
        this.Periodo = Periodo; //semestres
        this.Atividades = new ArrayList<Atividade>();
        
    }

    //----Gets----
    public String[][] get_horario() {
        return horario.get_Horario();
    }
    
    public String get_Nome() {
        return Nome;
    }

    public String get_Sigla() {
        return Sigla;
    }

    public String get_Professor() {
        return Professor;
    }

    public int get_Periodo() {
        return Periodo;
    }

    /**
     * Retorna Um arratList de todas as atividades da disciplina
     * @return
     */
    public ArrayList<Atividade> get_Atividades() {
        return Atividades;
    }

    //----sets----
    public void set_Horario(Horario horario) {
        this.horario = horario;
    }

    public void set_professor(String nome){
        this.Professor = nome;
    }
        
    public void set_periodo(int periodo){
        this.Periodo = periodo;
    }

    public void add_atividades(String titulo, String descricao, String data_postagem, String data_entrega,boolean b, int i){

        //criar e adiciona na lista uma nova atividade
        Atividade atividade = new Atividade(titulo, descricao, data_postagem, data_entrega, b, i);
        this.Atividades.add(atividade);
        
    }

    //add Alunos
    public void add_Alunos(Estudante estudante){
        this.Alunos.add(estudante);
    }

    //print atividades da disciplina
    public void print_atividades(){
        System.out.printf("Titulo | Data De entrega | nota \n");
        for(Atividade atividade : this.Atividades){ //ele irar repetir o for para cada atividade dentro da lista de atividades
            System.out.printf("%s \t| %S \t | %ls \t|",atividade.get_titulo(),atividade.get_data_entrega(),atividade.get_nota());
        }
    }
}
