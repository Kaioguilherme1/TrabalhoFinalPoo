
/************************************************************
 | TITULO: Classe doguinhos                                  |
 | AUTORES: Kaio Guilherme, Lucas Anderson, Wandressa Reis   |
 | DATA DE INICIO: 07/02/2022                                |
 | DATA DE TERMINO: 00/00/0000                               |
 | PROPOSITO:                                                |   
 | INSTITUIÇÃO: Uiversidade federal De Roraima               |
 ************************************************************/

import java.util.Scanner;
import Classes.Estudante;
import Classes.Agenda;
import Classes.Curso;
import Classes.Disciplina;

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
        

        //registro das atividades e Horarios
        //Algoritimo
        disciplina.add_atividade("pesquisa for", "Pesquisar sobre o laço for", "10/10/2022", "14/10/2022", true , 2);
        disciplina.add_atividade("trabalho calculadora", "Implementa uma cauculadora em C", "18/10/2022", "22/10/2022", true , 4);
        disciplina.add_atividade("trabalho jogo", "Implementa uma jogo de pergunta e respostas em C", "26/10/2022", "01/11/2022", true , 4);
        curso.add_Horario(disciplina, 1, 1, disciplina.get_Sigla());
        curso.add_Horario(disciplina, 2, 1, disciplina.get_Sigla());
        curso.add_Horario(disciplina, 1, 3, disciplina.get_Sigla());
        curso.add_Horario(disciplina, 2, 3, disciplina.get_Sigla());

        //Programação
        disciplina2.add_atividade("trabalho jogo", "Implementa uma jogo de pergunta e respostas em python", "26/10/2022", "01/11/2022", false , 2);
        disciplina2.add_atividade("trabalho calculadora", "Implementa uma cauculadora em python", "18/10/2022", "22/10/2022", false , 4);

        curso.add_Horario(disciplina2, 3, 1, disciplina2.get_Sigla());
        curso.add_Horario(disciplina2, 4, 1, disciplina2.get_Sigla());
        curso.add_Horario(disciplina2, 3, 3, disciplina2.get_Sigla());
        curso.add_Horario(disciplina2, 4, 3, disciplina2.get_Sigla());

        //Logica Proporcional
        disciplina3.add_atividade("teste1", "Implementa uma jogo de pergunta e respostas em C", "26/10/2022", "01/11/2022", true , 2);
        disciplina3.add_atividade("teste2", "Implementa uma cauculadora em C", "18/10/2022", "22/10/2022", true , 4);

        curso.add_Horario(disciplina3, 1, 2, disciplina3.get_Sigla());
        curso.add_Horario(disciplina3, 2, 2, disciplina3.get_Sigla());
        curso.add_Horario(disciplina3, 1, 4, disciplina3.get_Sigla());
        curso.add_Horario(disciplina3, 2, 4, disciplina3.get_Sigla());

        //Estrutura de Dados
        curso.add_Horario(disciplina4, 3, 2, disciplina4.get_Sigla());
        curso.add_Horario(disciplina4, 4, 2, disciplina4.get_Sigla());
        curso.add_Horario(disciplina4, 3, 4, disciplina4.get_Sigla());
        curso.add_Horario(disciplina4, 4, 4, disciplina4.get_Sigla());

        //Sistemas Operacionais
        curso.add_Horario(disciplina5, 6, 2, disciplina5.get_Sigla());
        curso.add_Horario(disciplina5, 7, 2, disciplina5.get_Sigla());
        curso.add_Horario(disciplina5, 6, 4, disciplina5.get_Sigla());
        curso.add_Horario(disciplina5, 7, 4, disciplina5.get_Sigla());

        //Ciclo Principal
        while(Usuario == true){

            //Menu
            
            Seletor = Print_menu(Ler,"Selecione o que deseja imprimir",
                                     "0 - Sair", 
                                     "1 - Estudantes", 
                                     "2 - Cursos");
            

            switch(Seletor){
                case -1:
                    System.out.println("Digitie um valor Valido");
                    continue;
                case 0:
                    Usuario = false;
                case 1://aluno
                    System.out.println("   Paulo Cardoso   ");
                    Seletor = Print_menu(Ler,"Selecione o que deseja acessar",
                                     "0 - voltar", 
                                     "1 - Agenda", 
                                     "2 - Atividades", 
                                     "3 - perfil");
                    
                    switch(Seletor){
                        case 0:
                            break;
                        case 1://agenda
                            while(Seletor != 0){
                                System.out.print("\033[H\033[2J");
                                System.out.println("                           Agenda   \n");
                                Agenda agenda = new Agenda(aluno1);
                                agenda.print_horario();
                                int hora, dia;
                                String nome;

                                Seletor = Print_menu(Ler,"Selecione o que deseja acessar",
                                        "0 - voltar", 
                                        "1 - adicionar compromisso", 
                                        "2 - remover compromisso",
                                        "3 - acessar notas");
                                switch(Seletor){
                                    case 0:
                                        continue;
                                    case 1:
                                        agenda.print_horario();

                                        try {
                                            System.out.println("Digite a hora do dia");
                                            hora = Ler.nextInt();
                                            System.out.println("Digite o dia da semana");
                                            dia = Ler.nextInt();
                                            if(!agenda.get_horario().is_empty(hora, dia)){
                                                System.out.println("Horaio ja ocupado deseja substituir Compromiso(y/n) >>>");
                                                nome = Ler.next();
                                                if(nome.equals("y")){
                                                    System.out.println("Digite o nome do compromisso");
                                                    nome = Ler.next();
                                                    agenda.add_Compromisso(hora, dia, nome);
                                                }
                                            }
                                            else{
                                                System.out.println("Digite o nome do compromisso");
                                                nome = Ler.next();
                                                agenda.add_Compromisso(hora, dia, nome);
                                            }
                                        }catch(Exception e){
                                            System.out.println("Digite um valor valido");
                                            continue;
                                        }
                                        break;
                                    case 2:
                                        agenda.print_horario();

                                        try {
                                            System.out.println("Removendo Compromisso");
                                            System.out.print("Digite a hora do dia >>> ");
                                            hora = Ler.nextInt();
                                            System.out.print("Digite o dia da semana >>> ");
                                            dia = Ler.nextInt();
                                            if (!agenda.get_horario().is_empty(hora, dia)) {
                                                System.out.printf("Deseja Remover Compromisso %s (y/n) >>> ", agenda.get_horario().get_compromisso(hora, dia));
                                                nome = Ler.next();
                                                if (nome.equals("y")) {
                                                    agenda.add_Compromisso(hora, dia, "");
                                                }
                                            } else {
                                                System.out.println("Compromisso Não Existente");
                                            }
                                        } catch (Exception e) {
                                            System.out.println("Digite um valor valido");
                                            continue;
                                        }
                                        break;
                                    case 3:
                                        int soma, num_atividades;
                                        System.out.print("\033[H\033[2J");
                                        aluno1.get_Curso().print_disciplinas(aluno1.get_Periodo());
                                        System.out.printf("Digite a sigla da disciplina >>> ");
                                        nome = Ler.next();
                                        soma = agenda.soma_notas(nome);
                                        num_atividades = aluno1.get_Curso().get_Single_Disciplina(nome).get_Atividades().size();
                                        System.out.printf("media das atividades de %s é: %f",nome, agenda.get_media(soma, num_atividades));        
                                        pause(Ler);
                                        break;                    
                                }  
                            }

                        case 2://atividades
                            aluno1.get_Curso().print_atividades(aluno1.get_Periodo());
                            pause(Ler);
                            System.out.print("\033[H\033[2J");
                            break;

                        case 3:
                            System.out.printf("Nome: %s\n", aluno1.get_Nome());
                            System.out.printf("Matricula: %d\n", aluno1.get_Matricula());
                            System.out.printf("Periodo: %d\n", aluno1.get_Periodo());
                            System.out.printf("Curso: %s\n", aluno1.get_Curso().get_Nome());
                            System.out.printf("Disciplinas que esta matriculado\n");
                            aluno1.get_Curso().print_disciplinas(aluno1.get_Matricula());
                            pause(Ler);
                            System.out.print("\033[H\033[2J");
                            break;
                    }






                case 2:
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
