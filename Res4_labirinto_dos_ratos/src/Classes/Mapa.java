package Classes;

public class Mapa {
    // Atributos
    private char[][] mapa;
    private int[] Entrada;
    private int[] Saida;

    // Construtor
    public Mapa() {
        this.mapa = new char[9][33];
        this.Entrada = new int[2];
        this.Saida = new int[2];
        this.Fechar_linha(0);
        this.Fechar_linha(8);

        //coluna 1
        this.mapa[1][0] = '*';
        this.mapa[2][0] = '*';
        this.mapa[3][0] = '*';
        this.mapa[4][0] = '*';
        this.mapa[5][0] = '*';
        this.mapa[6][0] = '*';
        this.mapa[7][0] = '*';
        
        
        //coluna 32
        this.mapa[1][32] = '*';
        this.mapa[2][32] = '*';
        this.mapa[3][32] = '*';
        this.mapa[4][32] = '*';
        this.mapa[5][32] = '*';
        this.mapa[6][32] = '*';
        this.mapa[7][32] = '*';
        
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 32; j++) {
                this.mapa[i][j]= '@';
            }
            
        }

        

    }
    // get

    public char[][] getMapa() {
        return this.mapa;
    }

    public int[] getEntrada() {
        return this.Entrada;
    }

    public int[] getSaida() {
        return this.Saida;
    }

    // Metodos
    private void Fechar_linha(int linha) {
        for (int i = 0; i < 33; i++) {
            this.mapa[linha][i] = '*';
        }
    }

    public void add_posicao(int x, int y, char nome) {
        this.mapa[x][y] = nome;
    }

    public void set_mapa(int x, int y, char objeto){
        if (x != 0 && x != 8 && y != 0 && y != 32) {
            this.mapa[x][y] = objeto;
        } else {
            System.out.println("Posição de objeto inválida");
        }
    }

    public void add_Entrada(int x, int y) {
        if((x == 0 || x == 8 || y == 0 || y == 32)){
            this.Entrada[0] = x;
            this.Entrada[1] = y;
            this.mapa[x][y] = 'E';   
            
        }else{
            System.out.println("Posição de entrada inválida");
        }
        
    }

    public void add_Saida(int x, int y) {
        if((x == 0 || x == 8 || y == 0 || y == 32)){
            this.Entrada[0] = x;
            this.Entrada[1] = y;
            this.mapa[x][y] = 'S';

        } else {
            System.out.println("Posição de saida inválida");
        }
    }

    public void print_mapa() {
        System.out.print("\033[H\033[2J");
        System.out.println("|====== Labirinto dos ratos ======|");
        for (int i = 0; i < 9; i++) {
            System.out.print("|");
            for (int j = 0; j < 33; j++) {
                System.out.format("%c",this.mapa[i][j]);
            }
            System.out.printf("|\n");
        }
        System.out.println("|============== Java =============|");
    }

}
