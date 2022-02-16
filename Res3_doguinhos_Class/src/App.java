import Classes.Cachorro;

/************************************************************
| TITULO: Classe doguinhos                                  |
| AUTORES: Kaio Guilherme, Lucas Anderson, Wandressa Reis   |
| DATA DE INICIO: 07/02/2022                                |
| DATA DE TERMINO: 00/00/0000                               |
| PROPOSITO:                                                |   
| INSTITUI√á√ÉO: Uiversidade federal De Roraima               |
************************************************************/


public class App {
    public static void main(String[] args) throws Exception {
    	//testando se esta tudo certo
        Cachorro dog = new Cachorro("Sebasti„o", "Pitbull", "Feliz");
        System.out.println(dog);
        dog.TemDono("n„o");
        dog.NovoDono("Lucas");
        dog.Passear();
        dog.Correr();
        
    }
}
