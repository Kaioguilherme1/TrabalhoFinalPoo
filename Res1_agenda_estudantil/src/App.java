
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Classes.Estudante;
import Classes.Atividade;
import Classes.Curso;
import Classes.Disciplina;
import Classes.Horario;



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
     * @param Titulo String
     * @param opcoes Opções do menu separadas por virgula, obs sem limite de quantidade
     * @return int opção escolhida
     */

    public static int Print_menu(Scanner Ler,String Titulo, String... opcoes) { //o nome dessa passagem e vararg, para passagem dinamica de parametros
        int seletor;

        System.out.println("=================================");
        System.out.println("| "+Titulo+" |");
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
    
    public static void pause(Scanner Ler){
        System.out.print("\nPressione ENTER para continuar...");
        Ler.nextLine();
        Ler.nextLine();
        
    }
    public static void main(String[] args) throws Exception {
        //variaveis
        int Seletor;
        boolean Usuario = true;
        Map<String, Curso> Cursos;
        Cursos = new HashMap<String, Curso>(); //inicialização do maps Curso

        Scanner Ler = new Scanner(System.in);
        //Criação dos Alunos
        Estudante aluno1 = new Estudante("Paulo cardoso");
        Estudante aluno2 = new Estudante("Anderson Andrade");
        Estudante aluno3 = new Estudante("Kaio Guilherme");
        Estudante aluno4 = new Estudante("Wandressa Reis");
        Estudante aluno5 = new Estudante("Lucas Anderson");
        Estudante aluno6 = new Estudante("Joao da Silva");
        Estudante aluno7 = new Estudante("Maria da almada");
        Estudante aluno8 = new Estudante("Jose da sapucaia");
        Estudante aluno9 = new Estudante("Pedro vasconselos");
        Estudante aluno10 = new Estudante("Maria da Silva");

        //Criação de cursos
        Curso curso = new Curso("Ciência Da Computação", "CC", 8);
        Curso curso2 = new Curso("Engenharia de Software", "ES", 8);
        Curso curso3 = new Curso("Engenharia de Produção", "EP", 8);
        Curso curso4 = new Curso("Engenharia Civil", "EP", 8);

        //Discplinas do curso
        Disciplina disciplina = new Disciplina("Algoritimo", "ALG", "Luan Cardoso", 1);
        Disciplina disciplina2 = new Disciplina("Programação", "PO", "Lia Mendez", 1);
        Disciplina disciplina3 = new Disciplina("Logica Proporcional", "LP", "Alberto Braga", 1);
        Disciplina disciplina4 = new Disciplina("Estrutura de Dados", "ED", "Jorge Foncesa", 1);
        Disciplina disciplina5 = new Disciplina("Sistemas Operacionais", "SO", "Luana", 1);

        //adicionando disciplinas ao curso
        curso.add_Disciplina(disciplina);
        curso.add_Disciplina(disciplina2);
        curso.add_Disciplina(disciplina3);
        curso.add_Disciplina(disciplina4);
        curso.add_Disciplina(disciplina5);

        //adicionando alunos ao curso
        curso.matricular_Aluno(aluno1, 1);
        curso.matricular_Aluno(aluno2, 1);
        curso.matricular_Aluno(aluno3, 1);
        curso.matricular_Aluno(aluno4, 1);
        curso.matricular_Aluno(aluno5, 1);
        curso.matricular_Aluno(aluno6, 1);
        curso.matricular_Aluno(aluno7, 1);
        curso.matricular_Aluno(aluno8, 1);
        curso.matricular_Aluno(aluno9, 1);
        curso.matricular_Aluno(aluno10, 1);
        
        

        //Ciclo Principal
        while(Usuario == true){

            //Menu
            
            Seletor = Print_menu(Ler,"Selecione o que deseja imprimir",
                                     "0 - Sair", 
                                     "1 - Estudantes", 
                                     "2 - Disciplina", 
                                     "3 - Curso");
            

            switch(Seletor){
                case -1:
                    System.out.println("Digitie um valor Valido");
                    continue;
                case 0:
                    Usuario = false;
                
                case 3:
                    Curso curso_selecionado = null;
                    Seletor = Print_menu(Ler,"Selecione o seu curso",
                                     "0 - Voltar", 
                                     "1 - Ciência da Computação", 
                                     "2 - Engenharia de Software", 
                                     "3 - Engenharia Civil",
                                     "4 - Engenharia Eletrica");
                    
                    switch(Seletor){
                        case 0:
                            break;
                        case 1:
                            curso_selecionado = curso;
                            break;
                        case 2:
                            curso_selecionado = curso2;
                            break;
                        case 3:
                            curso_selecionado = curso3;
                            break;
                        case 4:
                            curso_selecionado = curso4;
                            break;    
                        default:
                            System.out.println("Digite um valor Valido");
                            continue;
                    }
                    System.out.printf(curso_selecionado.get_Nome() + "\n");
                    Seletor = Print_menu(Ler,"Selecione o que deseja imprimir",
                                     "0 - Voltar", 
                                     "1 - Disciplinas", 
                                     "2 - Alunos", 
                                     "3 - Informações do curso");
                    switch(Seletor){
                        case 0:
                            break;
                        case 1:
                            curso_selecionado.Print_all_Disciplinas();
                            pause(Ler);
                            break;
                        case 2:
                            curso_selecionado.Print_alunos();
                            pause(Ler);
                            break;
                        case 3:
                            curso_selecionado.Print_curso();
                            pause(Ler);
                            break;
                        default:
                            System.out.println("Digite um valor Valido");
                            continue;
                    }

                    
                default:
                    System.out.println("Digite um valor Valido");
                    continue;
            }

        }
    }

    

    
}
