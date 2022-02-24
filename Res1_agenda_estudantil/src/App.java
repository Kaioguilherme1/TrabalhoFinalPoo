
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Classes.Estudante;
//import Classes.Atividade;
import Classes.Curso;
import Classes.Disciplina;
//import Classes.Horario;



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

        //Criação de objetos
        //Cursos
        Curso curso = new Curso("Ciência da Computação", "CC", 8);
        Curso curso2 = new Curso("Engenharia de Software", "ES", 8);
        Curso curso3 = new Curso("Engenharia Civil", "EC", 8);
        Curso curso4 = new Curso("Engenharia Eletrica", "EE", 8);
        //adiciona cursos ao map
        Cursos.put(curso.get_Sigla(), curso);
        Cursos.put(curso2.get_Sigla(), curso2);
        Cursos.put(curso3.get_Sigla(), curso3);
        Cursos.put(curso4.get_Sigla(), curso4);

        //Disciplinas
        //Algoritimo
        Disciplina Disciplina01 = new Disciplina("Algoritimo", "ALG", "Alberto", 1);
        Disciplina01.add_atividades("Exercicio 01", "fazer o algoritimo que execute fibonacci", "21/03/22", "25/03/22", false, 2);
        //Banco De dados
        Disciplina Disciplina02 = new Disciplina("Banco de Dados", "BD", "Bruno", 4);
        //Eletrica basica
        Disciplina Disciplina03 = new Disciplina("Eletrica basica", "EB", "Carlos", 1);
        Disciplina03.add_atividades("Exercicio 04", "Pesquisa sobre o circuito flipflop", "21/03/22", "25/03/22", false, 4);
        //Pré-calculo
        Disciplina Disciplina04 = new Disciplina("Pré-Calculo", "PC", "Jorge", 1);
        //Programação
        Disciplina Disciplina05 = new Disciplina("Programação", "PRG", "João", 2);
        //Sistemas Operacionais
        Disciplina Disciplina06 = new Disciplina("Sistemas Operacionais", "SO", "Pedro", 4);
        //calculo I
        Disciplina Disciplina07 = new Disciplina("Calculo I", "CI", "Paulo", 2);
        //calculo II
        Disciplina Disciplina08 = new Disciplina("Calculo II", "CII", "Paulo", 3);
        //calculo III
        Disciplina Disciplina09 = new Disciplina("Calculo III", "CIII", "Paulo", 4);
        //Programação Estruturada
        Disciplina Disciplina10 = new Disciplina("Programação Estruturada", "PE", "José", 5);

        //Adicionando disciplinas ao curso
        curso.add_Disciplina(Disciplina01);
        curso.add_Disciplina(Disciplina02);
        curso.add_Disciplina(Disciplina03);
        curso.add_Disciplina(Disciplina04);
        curso.add_Disciplina(Disciplina05);
        curso.add_Disciplina(Disciplina06);
        curso.add_Disciplina(Disciplina07);
        curso.add_Disciplina(Disciplina08);
        curso.add_Disciplina(Disciplina09);
        curso.add_Disciplina(Disciplina10);

        //Adicionando disciplinas ao curso2
        curso2.add_Disciplina(Disciplina01);  
        curso2.add_Disciplina(Disciplina02);
        curso2.add_Disciplina(Disciplina05);
        curso2.add_Disciplina(Disciplina06);
        curso2.add_Disciplina(Disciplina10);

        //Adicionando disciplinas ao curso3
        curso3.add_Disciplina(Disciplina04);
        curso3.add_Disciplina(Disciplina07);
        curso3.add_Disciplina(Disciplina08);
        curso3.add_Disciplina(Disciplina09);

        //Adicionando disciplinas ao curso4
        curso4.add_Disciplina(Disciplina03);
        curso4.add_Disciplina(Disciplina04);

        //criando Alunos
        Estudante alunos = new Estudante("jose bezzera da cunha");
        Estudante alunos2 = new Estudante("jorge amado de sousa");
        Estudante alunos3 = new Estudante("maria da silva");
        Estudante alunos4 = new Estudante("lia pereira ferreira");
        Estudante alunos5 = new Estudante("cabral armando lopes");
        Estudante alunos6 = new Estudante("vladimir kuralov duartes");
        Estudante alunos7 = new Estudante("joão pedro da silva");


        //Adicionando objetos no map
        Cursos.put(curso.get_Nome(), curso);
        Cursos.put(curso2.get_Nome(), curso2);
        Cursos.put(curso3.get_Nome(), curso3);
        Cursos.put(curso4.get_Nome(), curso4);
        
        //Matriculando alunos alunoCurso
        curso.matricular_Aluno(alunos,1);
        curso.matricular_Aluno(alunos2,2);
        curso.matricular_Aluno(alunos3,2);
        curso.matricular_Aluno(alunos4,2);
        curso.matricular_Aluno(alunos6,1);
        curso.matricular_Aluno(alunos7,1);

        curso2.matricular_Aluno(alunos4,2);
        curso2.matricular_Aluno(alunos5,1);


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
