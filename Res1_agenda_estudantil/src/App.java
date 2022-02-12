/************************************************************
 | TITULO: Classe doguinhos                                  |
 | AUTORES: Kaio Guilherme, Lucas Anderson, Wandressa Reis   |
 | DATA DE INICIO: 07/02/2022                                |
 | DATA DE TERMINO: 00/00/0000                               |
 | PROPOSITO:                                                |   
 | INSTITUIÇÃO: Uiversidade federal De Roraima               |
 ************************************************************/





import Classes.Menu;

public class App {


    //esta dando problema pois o loop não para caso o loop se repita
    public static void main(String[] args) throws Exception {
        //variaveis
        int Seletor;
        Boolean Usuario = true;

        //Ciclo Principal
        while(Usuario == true){

            //Menu
            
            Seletor = Menu.Print_menu("0 - Sair", "1 - Estudantes", "2 - Disciplina", "3 - Curso");
            

            switch(Seletor){
                case 0:
                    Usuario = false;
                    break;

                case 1:
                    //estudantes
                    System.out.println("Estudantes");
                
            }
        }
    }

    

    
}
