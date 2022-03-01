import Classes.Pitbull;

import java.util.HashMap;

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
    public static void main(String[] args) throws Exception {
    	
         PastorAlemao dog = new PastorAlemao("Hercules");
         dog.definirPelo("curto");
         dog.TemDono("n�o");
         dog.NovoDono("Lucas");
         dog.Passear();
         dog.Correr();
         dog.emitirSom();
         System.out.println(dog);
   
    }
}
