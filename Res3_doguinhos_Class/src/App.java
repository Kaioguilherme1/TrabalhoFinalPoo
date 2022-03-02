import java.util.Scanner;

import Classes.Pitbull;
import Classes.Dachshund;
import Classes.HuskySiberiano;
import Classes.PastorAlemao;
import Classes.Pinscher;
/************************************************************
| TITULO: Classe doguinhos                                  |
| AUTORES: Kaio Guilherme, Lucas Anderson, Wandressa Reis   |
| DATA DE INICIO: 07/02/2022                                |
| DATA DE TERMINO: 00/00/0000                               |
| PROPOSITO:                                                |   
| INSTITUIÇÃO: Universidade federal De Roraima               |
************************************************************/


public class App {
	
    public static int Print_menu(Scanner Ler,String Titulo, String... opcoes) { //o nome dessa passagem e vararg, para passagem dinamica de parametros
        int seletor;

        System.out.println("=================================");
        System.out.println("| "+Titulo+" |");
        for (String op : opcoes) {
            System.out.println(op);
        }
        System.out.println("=================================");
        System.out.print("Digite o correspende ao menu que deseja Acessar >>> ");
        try{
            seletor = Ler.nextInt();
        }catch(Exception e){
            System.out.print("Digite um numero valido >>> ");
            return -1;
        }

        // Limpa a tela no windows, no linux e no MacOS(VSCODE)
        System.out.print("\033[H\033[2J");

        return seletor;
    }

    //implementacao futura: 
    //-criar uma possivel funcao para o menu de metodos ficar menos repetitivo
    //-tirar o erro de algumas situações com erro de numero invalido para
    //-minimizar alguns metodos como temdono  e novo dono
    //-generalizar a funcao setPelo em cachorro
    public static void main(String[] args) throws Exception {
    	Scanner Ler = new Scanner(System.in);
    	int seletor;
    	boolean Usuario = true;
        boolean acao = true;
    	
    	
    	while(Usuario == true) {
    		seletor = Print_menu(Ler, "Raca Cachorro:", "0- Fechar Programa",
                                                        "1- Pitbull",
                                                        "2- Pastor Alemao",
                                                        "3- Husky Siberiano",
                                                        "4- Dachshund",
                                                        "5- Pinscher" );
    		switch (seletor) {
    	     case -1:
    	    	 System.out.println("Digitie um valor Valido");
    	    	 continue;
    	     case 0:
    	    	 Usuario = false;
                 System.exit(0);
    	     case 1:
    	    	Pitbull pitbull = new Pitbull();
                acao = true;
                while(acao == true){
                    seletor = Print_menu(Ler, "Metodos:",
                                                    "1- Verificacao se tem dono",
                                                    "2- Adotar / Novo dono ",
                                                    "3- Passear",
                                                    "4- Correr",
                                                    "5- Situacao saude",
                                                    "6- Como o doguinho esta se sentindo",
                                                    "7- Cor do dog",
                                                    "8- Latir ou uivar",
                                                    "9- Voltar");
                    switch (seletor) {
                        case -1:
                            System.out.println("Digitie um valor Valido");
                            continue;
                        case 1:
                            pitbull.TemDono();
                            break;
                        case 2:
                            pitbull.NovoDono();
                            break;
                        case 3:
                            pitbull.Passear();
                            break;
                        case 4:
                            pitbull.Correr();
                            break;
                        case 5:
                            pitbull.SituacaoSaude();
                            break;
                        case 6:
                            pitbull.setSentimento();
                            break;
                        case 7:
                            pitbull.setCorPelo();
                            break;
                        case 8:
                            pitbull.emitirSom();
                            break;
                        case 9:
                            acao = false;
                            break;
                        default:
                            System.out.println("Numero invalido");
                    }
                }
                System.out.println(pitbull);
                break;
             case 2:
                PastorAlemao pastor_alemao = new PastorAlemao();
                acao = true;
                while(acao == true){
                    seletor = Print_menu(Ler, "Metodos:",
                                                    "1- Verificacao se tem dono",
                                                    "2- Adotar / Novo dono ",
                                                    "3- Passear",
                                                    "4- Correr",
                                                    "5- Situacao saude",
                                                    "6- Como o doguinho esta se sentindo",
                                                    "7- Cor do dog",
                                                    "8- Latir ou uivar",
                                                    "9- Definir pelagem",
                                                    "10 - Voltar");
                    switch (seletor) {
                        case -1:
                            System.out.println("Digitie um valor Valido");
                            continue;
                        case 1:
                            pastor_alemao.TemDono();
                            break;
                        case 2:
                            pastor_alemao.NovoDono();
                            break;
                        case 3:
                            pastor_alemao.Passear();
                            break;
                        case 4:
                            pastor_alemao.Correr();
                            break;
                        case 5:
                            pastor_alemao.SituacaoSaude();
                            break;
                        case 6:
                            pastor_alemao.setSentimento();
                            break;
                        case 7:
                            pastor_alemao.setCorPelo();
                            break;
                        case 8:
                            pastor_alemao.emitirSom();
                            break;
                        case 9:
                            pastor_alemao.definirPelo();
                            break;
                        case 10:
                            acao = false;
                            break;
                        default:
                            System.out.println("Numero invalido");
                    }
                }
                System.out.println(pastor_alemao);
                break;
             case 3:
                HuskySiberiano husky_siberiano = new HuskySiberiano();
                acao = true;
                while(acao == true){
                    seletor = Print_menu(Ler, "Metodos:",
                                                    "1- Verificacao se tem dono",
                                                    "2- Adotar / Novo dono ",
                                                    "3- Passear",
                                                    "4- Correr",
                                                    "5- Situacao saude",
                                                    "6- Como o doguinho esta se sentindo",
                                                    "7- Cor do dog",
                                                    "8- Latir ou uivar",
                                                    "9- Voltar");
                    switch (seletor) {
                        case -1:
                            System.out.println("Digitie um valor Valido");
                            continue;
                        case 1:
                            husky_siberiano.TemDono();
                            break;
                        case 2:
                            husky_siberiano.NovoDono();
                            break;
                        case 3:
                            husky_siberiano.Passear();
                            break;
                        case 4:
                            husky_siberiano.Correr();
                            break;
                        case 5:
                            husky_siberiano.SituacaoSaude();
                            break;
                        case 6:
                            husky_siberiano.setSentimento();
                            break;
                        case 7:
                            husky_siberiano.setCorPelo();
                            break;
                        case 8:
                            husky_siberiano.emitirSom();
                            break;
                        case 9:
                            acao = false;
                            break;
                        default:
                            System.out.println("Numero invalido");
                    }
                }
                System.out.println(husky_siberiano);
                break;
             case 4:
                Dachshund dachshund = new Dachshund();
                acao = true;
                while(acao == true){
                    seletor = Print_menu(Ler, "Metodos:",
                                                    "1- Verificacao se tem dono",
                                                    "2- Adotar / Novo dono ",
                                                    "3- Passear",
                                                    "4- Correr",
                                                    "5- Situacao saude",
                                                    "6- Como o doguinho esta se sentindo",
                                                    "7- Cor do dog",
                                                    "8- Latir ou uivar",
                                                    "9- Definir pelagem",
                                                    "10- Voltar");
                    switch (seletor) {
                        case -1:
                            System.out.println("Digitie um valor Valido");
                            continue;
                        case 1:
                            dachshund.TemDono();
                            break;
                        case 2:
                            dachshund.NovoDono();
                            break;
                        case 3:
                            dachshund.Passear();
                            break;
                        case 4:
                            dachshund.Correr();
                            break;
                        case 5:
                            dachshund.SituacaoSaude();
                            break;
                        case 6:
                            dachshund.setSentimento();
                            break;
                        case 7:
                            dachshund.setCorPelo();
                            break;
                        case 8:
                            dachshund.emitirSom();
                            break;
                        case 9:
                            dachshund.definirPelo();
                            break;
                        case 10:
                            acao = false;
                            break;
                        default:
                            System.out.println("Numero invalido");
                    }
                }
                System.out.println(dachshund);
                break;
             case 5:
                Pinscher pinscher = new Pinscher();
                acao = true;
                while(acao == true){
                    seletor = Print_menu(Ler, "Metodos:",
                                                    "1- Verificacao se tem dono",
                                                    "2- Adotar / Novo dono ",
                                                    "3- Passear",
                                                    "4- Correr",
                                                    "5- Situacao saude",
                                                    "6- Como o doguinho esta se sentindo",
                                                    "7- Cor do dog",
                                                    "8- Latir ou uivar",
                                                    "9- Voltar");
                    switch (seletor) {
                        case -1:
                            System.out.println("Digitie um valor Valido");
                            continue;
                        case 1:
                            pinscher.TemDono();
                            break;
                        case 2:
                            pinscher.NovoDono();
                            break;
                        case 3:
                            pinscher.Passear();
                            break;
                        case 4:
                            pinscher.Correr();
                            break;
                        case 5:
                            pinscher.SituacaoSaude();
                            break;
                        case 6:
                            pinscher.setSentimento();
                            break;
                        case 7:
                            pinscher.setCorPelo();
                            break;
                        case 8:
                            pinscher.emitirSom();
                            break;
                        case 9:
                            acao = false;
                            break;
                        default:
                            System.out.println("Numero invalido");
                    }
                }
                System.out.println(pinscher);
                break;
             default:
                System.out.println("Numero invalido");
            }
    	}
    	
    }
}
   