package Classes;

import java.util.HashMap;
import java.util.Map;

public class Curso {
    
    //atributos
    private String Nome;
    private String Sigla;
    private int Semestres;
    private Map<Integer, Horario> Horarios;
    private Map<String, Disciplina> Disciplinas;
    private Map<Integer, Estudante> Alunos; 

    //construtor
    public Curso(String Nome, String Sigla, int Semestres) {
        this.Nome = Nome;
        this.Sigla = Sigla;
        this.Semestres = Semestres;
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
        int Semestres = disciplina.get_Periodo();
        if(this.Horarios.containsKey(Semestres)){
            //cria novo horario caso não exista no hashmap
            this.Horarios.get(Semestres).add_aula(hora, dia, aula);
        }else{
            Horario horario = new Horario();
            horario.add_aula(hora, dia, aula);
            this.Horarios.put(Semestres, horario);
        }
    }

    //----Gets----

    public String get_Nome() {
        return Nome;
    }

    public String get_Sigla() {
        return Sigla;
    }

    public int get_Semestres() {
        return Semestres;
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
        this.Semestres = periodo;
    }

    public void Print_curso(){
        System.out.printf("nome\n", this.Nome);
        System.out.printf("Sigla\n", this.Sigla);
        System.out.printf("N° De Semetres\n", this.Semestres);
        System.out.printf("N° De Disciplinas\n", this.Disciplinas.size());
        System.out.printf("N° De Alunos cadastrados\n", this.Alunos.size());

    }

    public void Print_Disciplinas(){
        for(Map.Entry<String, Disciplina> entry : this.Disciplinas.entrySet()){
            System.out.printf("%s\n", entry.getValue().get_Nome());
        }
    }

    public void Print_alunos(){
        for(Map.Entry<Integer, Estudante> entry : this.Alunos.entrySet()){
            System.out.printf("%s\n", entry.getValue().get_Nome());
        }
    }
}   
