package Classes;

public class Agenda {
    private Estudante aluno;
    private Curso curso;
    private Horario horario;
   

    public Agenda(Estudante aluno ) {
        this.aluno = aluno;
        this.curso = aluno.get_Curso();
        this.horario = curso.get_Horario(aluno.get_Periodo());
        
    }

    //sets
    //adicionar compromiso na agenda
    

    public void set_Curso(Curso curso) {
        this.curso = curso;
    }

    //gets

    public void print_disciplinas(){
        curso.print_disciplinas(aluno.get_Periodo());
    }

    public void print_atividades() {
        curso.print_atividades(aluno.get_Periodo());
    }

    public void print_horario() {
        this.horario.print_horario(horario);
    }
    
}
