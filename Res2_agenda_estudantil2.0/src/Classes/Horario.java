package Classes;

public class Horario {
    
    //atributos
    private String[][] horario = new String[9][6];;
    

    public Horario() {
        
        horario[0][0] = "     ";
        horario[0][1] = "Segunda";
        horario[0][2] = "Terça";
        horario[0][3] = "Quarta";
        horario[0][4] = "Quinta";
        horario[0][5] = "Sexta";
        horario[1][0] = "08:00";
        horario[2][0] = "09:00";
        horario[3][0] = "10:00";
        horario[4][0] = "11:00";
        horario[5][0] = "12:00";
        horario[6][0] = "13:00";
        horario[7][0] = "14:00";
        horario[8][0] = "15:00";
        for (int i = 1; i < this.horario.length; i++) {
            for (int j = 1; j < this.horario[i].length; j++) {
                horario[i][j] = "";
            }
            System.out.println("");
        }
    }
    //----Gets----
    public String[][] get_Horario() {
        return horario;
    }

    public String get_compromisso(int data, int hora) {
        return horario[data][hora];
    }

    public boolean is_empty(int hora, int dia){
        String aula = this.horario[hora][dia];
        if(aula == ""){
            return true;
        }
            return false;
    }

    

    //----sets----

    public void set_Horario(String[][] horario) {
        this.horario = horario;
    }

    /**
     * 
     * @param hora valor unico do  1 ao 8
     * @param dia valor unico do 1 ao 5
     * @param nome da aula
     */
    public void add_compromiso(int hora, int dia, String nome) {
            this.horario[hora][dia] = nome;
        
    }

    public void substituir_Compromiso(int hora, int dia, String nome) {
        this.horario[hora][dia] = nome;   
    }
    
    //print horario
    public void print_horario(Horario horario) {
        System.out.printf("  | %-8d| %-8d| %-8d| %-8d| %-8d| %-8d|\n", 0 , 1, 2, 3, 4, 5);
        for (int i = 0; i < horario.get_Horario().length; i++) {//coluna
            System.out.printf("%d ", i);
            for (int j = 0; j < horario.get_Horario()[i].length; j++) {//linha
                System.out.format("| %-8s",horario.get_Horario()[i][j]);
            }
            System.out.println("|");
        }
    }
}


    
