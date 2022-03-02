import Classes.Mapa;

/************************************************************
| TITULO: Classe doguinhos                                  |
| AUTORES: Kaio Guilherme, Lucas Anderson, Wandressa Reis   |
| DATA DE INICIO: 07/02/2022                                |
| DATA DE TERMINO: 00/00/0000                               |
| PROPOSITO:                                                |   
| INSTITUIÇÃO: Uiversidade federal De Roraima               |
************************************************************/

public class App {
    public static void main(String[] args) throws Exception {
        
        Mapa mapa = new Mapa();
        mapa.add_Entrada(0, 1);
        mapa.add_Saida(8, 26);

        //desenhando mapa
        //linha 1
        mapa.set_mapa(1, 2, '*');
        mapa.set_mapa(1, 8, '*');
        mapa.set_mapa(1, 21, '*');
        mapa.set_mapa(1, 25, '*');
        
        //linha 2
        mapa.set_mapa(2, 2, '*');
        mapa.set_mapa(2, 3, '*');
        mapa.set_mapa(2, 4, '*');
        mapa.set_mapa(2, 5, '*');
        mapa.set_mapa(2, 6, '*');
        mapa.set_mapa(2, 10, '*');
        mapa.set_mapa(2, 14, '*');
        mapa.set_mapa(2, 15, '*');
        mapa.set_mapa(2, 16, '*');
        mapa.set_mapa(2, 17, '*');
        mapa.set_mapa(2, 18, '*');
        mapa.set_mapa(2, 19, '*');
        mapa.set_mapa(2, 20, '*');
        mapa.set_mapa(2, 21, '*');
        mapa.set_mapa(2, 23, '*');
        mapa.set_mapa(2, 24, '*');
        mapa.set_mapa(2, 25, '*');
        mapa.set_mapa(2, 26, '*');
        mapa.set_mapa(2, 28, '*');
        mapa.set_mapa(2, 30, '*');


        mapa.print_mapa();
    }
}
