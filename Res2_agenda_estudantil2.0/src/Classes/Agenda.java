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
    public void add_Compromisso(int Hora, int dia, String nome ) {
        if(Hora > 8){
            System.out.println("Hora invalida");
        }
        else if(dia > 5){
            System.out.println("Dia invalido");
        }
        else{
            horario.add_compromiso(Hora, dia, nome);
        }
    }


    public void set_Curso(Curso curso) {
        this.curso = curso;
    }

    //gets
    public Horario get_horario() {
       return this.horario;
    }

    public void print_disciplinas(){
        curso.print_disciplinas(aluno.get_Periodo());
    }

    public void print_atividades() {
        curso.print_atividades(aluno.get_Periodo());
    }

    public void print_horario() {
        this.horario.print_horario(horario);
    }
    
    public int soma_notas(String sigla_disciplina) {
        int soma = 0;
        Disciplina d = curso.get_Single_Disciplina(sigla_disciplina);
        for(Atividade a : d.get_Atividades()){
            if(a.get_status_boolean()){
                soma = soma + a.get_nota();
            }
        }
        return soma;
    }

    public float get_media(int soma, int num_atividades) {
        if(soma == 0 && num_atividades == 0){
            return 0;
        }
        else{
            return (float) soma/num_atividades;
        }
    }
}
