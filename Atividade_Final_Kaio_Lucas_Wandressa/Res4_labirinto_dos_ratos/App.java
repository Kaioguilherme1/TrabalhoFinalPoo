
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

        Rato ratok = new Rato(1,1,'K',mapa);
        Rato ratoL = new Rato(1,1,'L',mapa);
        Rato ratoW = new Rato(1,1,'W',mapa);

        Comando rato1 = new Comando(ratok);
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
        //linha 3
        mapa.set_mapa(3, 8, '*');
        mapa.set_mapa(3, 12, '*');
        mapa.set_mapa(3, 17, '*');
        mapa.set_mapa(3, 23, '*');
        mapa.set_mapa(3, 28, '*');
        mapa.set_mapa(3, 30, '*');
        mapa.set_mapa(3, 32, '*');
        //linha 4
        mapa.set_mapa(4, 2, '*');
        mapa.set_mapa(4, 3, '*');
        mapa.set_mapa(4, 4, '*');
        mapa.set_mapa(4, 5, '*');
        mapa.set_mapa(4, 6, '*');
        mapa.set_mapa(4, 7, '*');
        mapa.set_mapa(4, 8, '*');
        mapa.set_mapa(4, 10, '*');
        mapa.set_mapa(4, 12, '*');
        mapa.set_mapa(4, 13, '*');
        mapa.set_mapa(4, 14, '*');
        mapa.set_mapa(4, 15, '*');
        mapa.set_mapa(4, 17, '*');
        mapa.set_mapa(4, 19, '*');
        mapa.set_mapa(4, 20, '*');
        mapa.set_mapa(4, 21, '*');
        mapa.set_mapa(4, 22, '*');
        mapa.set_mapa(4, 23, '*');
        mapa.set_mapa(4, 24, '*');  
        mapa.set_mapa(4, 25, '*');
        mapa.set_mapa(4, 26, '*');
        mapa.set_mapa(4, 27, '*');
        mapa.set_mapa(4, 28, '*');
        
        //linha 5
        mapa.set_mapa(5, 6, '*');
        mapa.set_mapa(5, 10, '*');
        mapa.set_mapa(5, 12, '*');
        mapa.set_mapa(5, 20, '*');
        mapa.set_mapa(5, 23, '*');
        mapa.set_mapa(5, 28, '*');
        mapa.set_mapa(5, 29, '*');
        mapa.set_mapa(5, 30, '*');
        //linha 6

        mapa.set_mapa(6, 2, '*');
        mapa.set_mapa(6, 3, '*');
        mapa.set_mapa(6, 4, '*');
        mapa.set_mapa(6, 5, '*');
        mapa.set_mapa(6, 6, '*');
        mapa.set_mapa(6, 8, '*');
        mapa.set_mapa(6, 9, '*');
        mapa.set_mapa(6, 10, '*');
        mapa.set_mapa(6, 12, '*');
        mapa.set_mapa(6, 14, '*');
        mapa.set_mapa(6, 15, '*');
        mapa.set_mapa(6, 17, '*');
        mapa.set_mapa(6, 18, '*');
        mapa.set_mapa(6, 22, '*');
        mapa.set_mapa(6, 23, '*');
        mapa.set_mapa(6, 25, '*');
        mapa.set_mapa(6, 26, '*');
        mapa.set_mapa(6, 29, '*');
        mapa.set_mapa(6, 30, '*');

        //linha 7
        mapa.set_mapa(7, 8, '*');
        mapa.set_mapa(7, 12, '*');
        mapa.set_mapa(7, 14, '*');
        mapa.set_mapa(7, 20, '*');
        mapa.set_mapa(7, 25, '*');
        mapa.set_mapa(7, 28, '*');
        mapa.set_mapa(7, 29, '*');


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

        //controle manual do rato1
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
