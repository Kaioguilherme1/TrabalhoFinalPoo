
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Classes.*;


/************************************************************
 | TITULO: Classe doguinhos                                  |
 | AUTORES: Kaio Guilherme, Lucas Anderson, Wandressa Reis   |
 | DATA DE INICIO: 07/02/2022                                |
 | DATA DE TERMINO: 00/00/0000                               |
 | PROPOSITO:                                                |   
 | INSTITUIÇÃO: Uiversidade federal De Roraima               |
 ************************************************************/


public class App {

    /**
     * Função que crita o menu e retorna a opção escolhida
     * @param Ler objeto Scanner
     * @param opcoes Opções do menu separadas por virgula, obs sem limite de quantidade
     * @return int opção escolhida
     */

    public static int Print_menu(Scanner Ler,String... opcoes) { //o nome dessa passagem e vararg, para passagem dinamica de parametros
        int seletor;

        System.out.println("=================================");
        System.out.println("      Selecione uma opção:");
        for (String op : opcoes) {
            System.out.println(op);
        }
        System.out.println("=================================");
        System.out.print("Digite o correspende ao menu que deseja Acessar >>> ");
        //Corrigir essa exeção para retorna ao loop para uma nova tentativa de passar um valor
        try{
            seletor = Ler.nextInt();
        }catch(Exception e){
            System.out.print("Digite um numero valido >>> ");
            return -1;
        }

        // Limpa a tela no windows, no linux e no MacOS
        System.out.print("\033[H\033[2J");

        return seletor;
    }  
    
    public static void main(String[] args) throws Exception {
        //variaveis
        int Seletor;
        boolean Usuario = true;
        Map<String, Curso> Cursos;
        Cursos = new HashMap<String, Curso>(); //inicialização do maps Curso

        Scanner Ler = new Scanner(System.in);

        //Ciclo Principal
        while(Usuario == true){

            //Menu
            
            Seletor = Print_menu(Ler,"0 - Sair", 
                                     "1 - Estudantes", 
                                     "2 - Disciplina", 
                                     "3 - Curso");
            

            switch(Seletor){
                case -1:
                    System.out.println("Digitie um valor Valido");
                    continue;
                case 0:
                    Usuario = false;
                    
                case 1:
                    //Estudantes
                    Seletor = Print_menu(Ler, "0 - voltar", 
                                              "1 - Cadastrar Aluno", 
                                              "2 - acessar informações", 
                                              "3 - Acessar Agenda");
                    switch(Seletor){
                        case 0:
                            //voltar
                            break;
                        case 1:
                            //cadastrar aluno
                    }

                case 2:
                    //Disciplina
                case 3:
                    //Curso
                    Seletor = Print_menu(Ler, "0 - voltar", 
                                              "1 - Cadastrar Curso", 
                                              "2 - acessar informações",
                                              "3 - Acessar Lista De Disciplinas",
                                              "4 - Acessar Lista De Alunos");
                    switch (Seletor) {
                        case 0:
                            // voltar
                            break;
                        case 1:
                            // cadastrar curso
                            System.out.println("obs: Separe as palavras por virgula");
                            System.out.println("Digite as informações nesta ordem: Nome ,Sigla,Semetres");
                            String Leitura = Ler.next();
                            String[] parametros = Leitura.split(","); // separa as palavra por virgula
                            System.out.println(parametros[0]);

                            // if(Cursos.get(parametros[0]) == null){
                            // Curso curso = new Curso(parametros[0], parametros[1],
                            // Integer.parseInt(parametros[2]));
                            // Cursos.put(curso.get_Nome(), curso);
                            // }else{
                            // System.out.println("Este curso já esta cadastrado");
                            // break;
                            // }
                            break;

                            
                        case 2:
                            //acessar informações
                            Seletor = Print_menu(Ler, "0 - voltar", 
                                              "1 - Acessar Lista de Cursos", 
                                              "2 - acessar informações do curso");
                            switch (Seletor) {
                                case 0:
                                    // voltar
                                    break;
                                case 1:
                                    // acessar lista de cursos
                                    System.out.println("Lista de cursos");
                                    for(Curso curso : Cursos.values()){
                                        System.out.println(curso.get_Nome());
                                    }
                                    break;
                                case 2:
                                    // acessar informações do curso
                                    System.out.println("Digite o nome do curso que deseja acessar");
                                    String Nome = Ler.nextLine();
                                    try{
                                        Curso curso = Cursos.get(Nome);
                                        curso.Print_curso();
                                    }catch(Exception e){
                                        System.out.println("Curso não encontrado");
                                    }
                                    break;
                                    
                            }
                
                        }
            }
        }
    }

    

    
}
