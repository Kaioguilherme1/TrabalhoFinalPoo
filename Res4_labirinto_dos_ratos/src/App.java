
import Classes.Comando;
import Classes.Mapa;
import Classes.Rato;

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

        Rato rato = new Rato(1,1,'K',mapa);
        Rato ratoL = new Rato(1,1,'L',mapa);
        Rato ratoW = new Rato(1,1,'W',mapa);

        Comando rato1 = new Comando(rato);
        Comando rato2 = new Comando(ratoL);
        Comando rato3 = new Comando(ratoW);

        //Scanner Ler = new Scanner(System.in);
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
        try {
            Thread t = new Thread(rato1);
            Thread t2 = new Thread(rato2);
            Thread t3 = new Thread(rato3);
            t.start();
            t2.start();
            t3.start();
        } catch (Exception e) {
            System.out.println("venceu" );
        }

        // do{    
        //     System.out.println("Digite o comando: ");
        //     System.out.println("  5  ");
        //     System.out.println("1 2 3 ");
        //     System.out.print(">>> ");
        //     int c = Ler.nextInt();
        //     rato.mover(c);
        //     if(rato.get_x() - 1 == mapa.getSaida()[1] && rato.get_y() - 1 == mapa.getSaida()[0] ){
        //         venceu = true;
        //         System.out.println("Você venceu!");
        //     }
        // }while(venceu == false);
        
    }
}
