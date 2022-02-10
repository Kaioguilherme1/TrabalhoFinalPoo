package Classes;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Curso {
    
    //atributos
    private String Nome;
    private String Sigla;
    private int Periodo;
    private Map<String, Disciplina> Disciplinas;; 

    //construtor
    public Curso(String Nome, String Sigla, int Periodo) {
        this.Nome = Nome;
        this.Sigla = Sigla;
        this.Periodo = Periodo;
        this.Disciplinas = new HashMap<String, Disciplina>();
    }

    //adiciona disciplina
    public void add_Disciplina(Disciplina disciplina){
        this.Disciplinas.put(disciplina.get_Nome(), disciplina);
    }

    //retorna disciplina apartir do nome
    public Disciplina get_Disciplina(String nome_disciplina){
        return this.Disciplinas.get(nome_disciplina);
    }

}   
