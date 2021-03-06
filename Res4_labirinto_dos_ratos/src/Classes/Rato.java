package Classes;

import java.util.LinkedList;

public class Rato {
    //Atributos
    private int posicaoX;
    private int posicaoY;
    private char nome;
    private Mapa mapa;
    private  LinkedList<int[]> caminho_percorrido;
    private Mapa mapa_caminho;


    
    
    //metodos 
    public Rato(int y , int x ,char nome, Mapa mapa){
        this.posicaoX = x;
        this.posicaoY = y;
        this.nome = nome;
        this.mapa = mapa;
        this.mapa.add_posicao(this.posicaoX, this.posicaoY, this.nome);
        this.caminho_percorrido = new LinkedList<int[]>();
        this.caminho_percorrido.add(new int[]{this.posicaoX,this.posicaoY});
        this.mapa_caminho = new Mapa();
    }

    private boolean Is_free(int x, int y) {
        return (this.mapa.getMapa()[y][x] != '*' && this.mapa.getMapa()[y][x] != 'E') ? true : false;
    }

    private void mover(int y, int x, char nome) {
        if((y == 0 || y == 8 || x == 0 || x == 32))
            this.mapa.add_posicao(y, x, 'S');
        else    
            this.mapa.add_posicao(y, x, nome);
    }

    public int get_x(){
        return this.posicaoX;
    }

    public int get_y(){
        return this.posicaoY;
    }

    public Mapa get_mapa(){
        return this.mapa;
    }

    public char get_nome(){
        return this.nome;
    }

    public LinkedList<int[]> get_caminho_percorrido(){
        return this.caminho_percorrido;
    }

    public void print_caminho_percorrido(){
        for(int i = 0; i < this.caminho_percorrido.size(); i++){
            mapa_caminho.add_posicao(this.caminho_percorrido.get(i)[0], this.caminho_percorrido.get(i)[1], this.nome);
        }
        System.out.println("Mapa com o caminho percorrido de  " + this.nome);
        mapa_caminho.print_mapa(false);
    }

    public boolean mover(int comando){
        switch (comando) {

            case 1://esquerda
                if (Is_free(this.posicaoX - 1, this.posicaoY)) {
                    this.mapa.getMapa()[this.posicaoY][this.posicaoX] = '@';
                    this.posicaoX--;
                    mover(this.posicaoY, this.posicaoX, this.nome);
                    this.caminho_percorrido.add(new int[]{this.posicaoY,this.posicaoX});
                    this.mapa.print_mapa(true);
                    return true;
                }
                break;
            case 2://baixo
                if (Is_free(this.posicaoX, this.posicaoY + 1)) {
                    this.mapa.getMapa()[this.posicaoY][this.posicaoX] = '@';
                    this.posicaoY++;
                    mover(this.posicaoY, this.posicaoX, this.nome);
                    this.caminho_percorrido.add(new int[]{this.posicaoY,this.posicaoX});
                    this.mapa.print_mapa(true);
                    return true;
                    
                }
                break;
            case 3://direita
                if (Is_free(this.posicaoX + 1, this.posicaoY)) {
                    
                    this.mapa.getMapa()[this.posicaoY][this.posicaoX] = '@';
                    this.posicaoX++;
                    mover(this.posicaoY, this.posicaoX, this.nome);
                    this.caminho_percorrido.add(new int[] { this.posicaoY, this.posicaoX });
                    this.mapa.print_mapa(true);
                    return true;
                    
                }
                break;
            case 5://cima
                if (Is_free(this.posicaoX, this.posicaoY - 1)) {
                    this.mapa.getMapa()[this.posicaoY][this.posicaoX] = '@';
                    this.posicaoY--;
                    mover(this.posicaoY, this.posicaoX, this.nome);
                    this.caminho_percorrido.add(new int[] { this.posicaoY, this.posicaoX });
                    this.mapa.print_mapa(true);
                    return true;
                    
                }

                break;
            default:
                System.out.println("Comando invalido");
                return false;
        }
        //System.out.println("Colis??o com a parede");
        return false;
    }
}
