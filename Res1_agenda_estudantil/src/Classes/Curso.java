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
    public void matricular_Aluno(Estudante aluno, int semestre){
        //adiciona dados do aluno
        aluno.set_Curso(Curso.this);
        aluno.set_Periodo(semestre);
        aluno.set_Matricula(Alunos.size()+1);

        //matricula os alunos nas diciplinas
        

        for(Disciplina d : Disciplinas.values()){
            if(d.get_Periodo() == semestre){
                System.out.println(d.get_Nome());
            }
        }
        
        
        
        this.Alunos.put(aluno.get_Matricula(), aluno);
    }


    //adiciona horario de disciplina
    public void add_Horario(Disciplina disciplina, int hora, int dia, String aula){
        int Semestres = disciplina.get_Periodo();
        if(this.Horarios.containsKey(Semestres)){
            //cria novo horario caso não exista no hashmap
            this.Horarios.get(Semestres).add_compromiso(hora, dia, disciplina.get_Sigla());
        }else{
            Horario horario = new Horario();
            horario.add_compromiso(hora, dia, disciplina.get_Sigla());
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

    //retorna o horario
    public Horario get_Horario(int semestre) {
        return Horarios.get(semestre);
    }

    
    /**
     * Retorna disciplina apartir do nomedo da disciplina
     * se quiser retornar todas as disciplinas, passe all como parametro
     */
    public Disciplina get_Simgle_Disciplina(String nome_disciplina ){
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
        System.out.printf("nome %s\n", this.Nome);
        System.out.printf("Sigla %s\n", this.Sigla);
        System.out.printf("N° De Semetres %d\n", this.Semestres);
        System.out.printf("N° De Disciplinas %d\n", this.Disciplinas.size());
        System.out.printf("N° De Alunos cadastrados %d\n", this.Alunos.size());

    }

    public void Print_all_Disciplinas(){
        System.out.printf("N° de Disciplinas Cadastradas %s\n", this.Disciplinas.size());
        System.out.printf("Disciplinas:\n");
        System.out.printf("=======================\n");
        for(Map.Entry<String, Disciplina> entry : this.Disciplinas.entrySet()){
            System.out.printf("| %s\t | \n ", entry.getValue().get_Nome());
        }
        System.out.printf("=======================\n");
    }

    public void Print_alunos(){
        System.out.printf("N° De Alunos cadastrados\n", this.Alunos.size());
        System.out.printf("=======================\n");
        System.out.printf("Matricula\tNome\n");
        for(Map.Entry<Integer, Estudante> entry : this.Alunos.entrySet()){
            System.out.printf("| %d \t| %s |\n", entry.getValue().get_Nome(), entry.getValue().get_Matricula());
        }
        System.out.printf("=======================\n");
    }

    //imprime as atividades de determinado periodo
    public void print_atividades(int periodo) {
        String[] heys = Disciplinas.keySet().toArray(new String[Disciplinas.size()]);
        for (String key : heys) {
            if (Disciplinas.get(key).get_Periodo() == periodo) {
                System.out.printf("Atividades de %s\n", Disciplinas.get(key).get_Nome());
                Disciplinas.get(key).print_atividades();
            }
        }
    }

    //imprime as diciplinas de de acordo com o Periodo
    public void print_disciplinas(int periodo){
        String[] heys = Disciplinas.keySet().toArray(new String[Disciplinas.size()]);
        System.out.printf("| Disciplina \f| Sigla \f| Professor \f|\n");
        for (String key : heys) {
            if (Disciplinas.get(key).get_Periodo() == periodo) {
                System.out.printf("| %s \f| %s \f| %s \f|\n",Disciplinas.get(key).get_Nome(), Disciplinas.get(key).get_Sigla(), Disciplinas.get(key).get_Professor());
            }
        }
    }

}   
