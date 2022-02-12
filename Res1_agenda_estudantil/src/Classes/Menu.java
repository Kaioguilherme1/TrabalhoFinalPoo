package Classes;

//não sei se vai ser nescesario essa classe porem no momento estou testando assim
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    //limpa o terminal em todos os sistemas operacionais
    public static void Clear() throws InterruptedException, IOException {
        // Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }

    /**
     * //passar o numero de opções no menu separado por virgula
     * ex: 1,2,3,4,5,6,7,8,9,10
     * @param opcoes
     * @return int Seletor
     * @throws IOException
     * @throws InterruptedException
     */

    public static int Print_menu(String... opcoes) throws InterruptedException, IOException{ //o nome dessa passagem e vararg, para passagem dinamica de parametros
        int seletor;

        System.out.println("=================================");
        System.out.println("      Selecione uma opção:");
        for (String op : opcoes) {
            System.out.println(op);
        }
        System.out.println("=================================");
        System.out.print("Digite o correspende ao menu que deseja Acessar >>> ");
        //try (Scanner ler = new Scanner(System.in)) {
            Scanner ler = new Scanner(System.in);
            seletor = ler.nextInt();
            ler.close();
        //} catch (Exception e) {
            //System.out.println("Digite um numero valido!");
            //return 0;
        //}
        
        Clear();
        return seletor;
    }  
}
