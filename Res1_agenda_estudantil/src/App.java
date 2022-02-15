
import java.util.Scanner;


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
        Boolean Usuario = true;
        Scanner Ler = new Scanner(System.in);

        //Ciclo Principal
        while(Usuario == true){

            //Menu
            
            Seletor = Print_menu(Ler,"0 - Sair", "1 - Estudantes", "2 - Disciplina", "3 - Curso");
            

            switch(Seletor){
                case -1:
                    System.out.println("Digitie um valor Valido");
                case 0:
                    Usuario = false;
                    break;

                case 1:
                    //estudantes
                    break;
                
            }
        }
    }

    

    
}
