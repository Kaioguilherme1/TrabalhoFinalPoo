package Classes;

import java.util.Random;

public class Comando implements Runnable{
    //atributos
    private Rato rato;
    private int comando;

    //metodo
    public Comando(Rato rato) {
        this.rato = rato;
    }

    private boolean Is_saida(Rato rato){
        return (rato.get_mapa().getMapa()[rato.get_y()][rato.get_x()] == 'E') ? true : false;
    }

    public boolean Algoritimo_Labirinto1() {
            Random gerador = new Random();
            this.comando = gerador.nextInt(4) + 1;
            if(!Is_saida(rato)){
                if(this.comando == 4){
                    this.comando++;
                    rato.mover(this.comando);
                    return false;
                }else{
                    rato.mover(this.comando);
                    return false;
                }
            }else{
                System.out.println("Chegou a saida");
                return true;
            }
    }

    @Override
    public void run()
    {   
        boolean saida = false;
        while(!saida){
            saida = Algoritimo_Labirinto1();
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Saiu do labirinto");
        Thread.currentThread().interrupt();
    }
}
