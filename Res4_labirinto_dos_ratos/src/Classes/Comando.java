package Classes;

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
            if(!Is_saida(rato)){
                if(this.comando == 4){
                    this.comando++;
                    return false;
                }else if(this.comando > 5){
                    this.comando = 1;
                    return false;
                }else{
                    rato.mover(this.comando);
                    this.comando++;
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
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        Thread.currentThread().interrupt();
    }
}
