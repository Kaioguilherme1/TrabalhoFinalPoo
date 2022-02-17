package Classes;

import java.util.HashMap;
import java.util.Map;

public class Curso {
    
    //atributos
    private String Nome;
    private String Sigla;
    private int Periodo;
    private Map<Integer, Horario> Horarios;
    private Map<String, Disciplina> Disciplinas;
    private Map<Integer, Estudante> Alunos; 

    //construtor
    public Curso(String Nome, String Sigla, int Periodo) {
        this.Nome = Nome;
        this.Sigla = Sigla;
        this.Periodo = Periodo;
        this.Disciplinas = new HashMap<String, Disciplina>();
        this.Alunos = new HashMap<Integer,Estudante>();
    }

    //adiciona disciplina
    public void add_Disciplina(Disciplina disciplina){
        this.Disciplinas.put(disciplina.get_Nome(), disciplina);
    }

    //adiciona aluno
    public void add_Aluno(Estudante aluno){
        this.Alunos.put(aluno.get_Matricula(), aluno);
    }


    //adiciona horario de disciplina
    public void add_Horario(Disciplina disciplina, int hora, int dia, String aula){
        int periodo = disciplina.get_Periodo();
        //em desenvolvimento
    }

    //----Gets----

    public String get_Nome() {
        return Nome;
    }

    public String get_Sigla() {
        return Sigla;
    }

    public int get_Periodo() {
        return Periodo;
    }

    
    /**
     * Retorna disciplina apartir do nomedo da disciplina
     * se quiser retornar todas as disciplinas, passe all como parametro
     */
    public Disciplina get_Disciplina(String nome_disciplina ){
        if(nome_disciplina == "all")
            return (Disciplina) this.Disciplinas;
        else
            return this.Disciplinas.get(nome_disciplina);
    }

    /**
     * Retorna o estudante apartir do numero de matricula
     * se quiser retornar todos os estudantes, passe all como parametro
     * @return
     * Alunos
     */
    public Estudante get_Estudante(int Matricula){
        if(Integer.toString(Matricula) == "all")
            return (Estudante) this.Alunos;
        else
            return this.Alunos.get(Matricula);
    }

    //----sets----

    public void set_periodo(int periodo) {
        this.Periodo = periodo;
    }

    public void Print_curso(){
        System.out.printf("nome\n", this.Nome);
        System.out.printf("Sigla\n", this.Sigla);
        System.out.printf("N° De Semetres\n", this.Periodo);
        System.out.printf("N° De Disciplinas\n", this.Disciplinas.size());
        System.out.printf("N° De Alunos cadastrados\n", this.Alunos.size());

    }
}   
