
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Classes.Curso;
import Classes.Disciplina;


/************************************************************
 | TITULO: Classe doguinhos                                  |
 | AUTORES: Kaio Guilherme, Lucas Anderson, Wandressa Reis   |
 | DATA DE INICIO: 07/02/2022                                |
 | DATA DE TERMINO: 00/00/0000                               |
 | PROPOSITO:                                                |   
 | INSTITUIÇÃO: Uiversidade federal De Roraima               |
 ************************************************************/


public class App {

    /**
     * Função que crita o menu e retorna a opção escolhida
     * @param Ler objeto Scanner
     * @param opcoes Opções do menu separadas por virgula, obs sem limite de quantidade
     * @return int opção escolhida
     */

    public static int Print_menu(Scanner Ler,String... opcoes) { //o nome dessa passagem e vararg, para passagem dinamica de parametros
        int seletor;

        System.out.println("=================================");
        System.out.println("      Selecione uma opção:");
        for (String op : opcoes) {
            System.out.println(op);
        }
        System.out.println("=================================");
        System.out.print("Digite o correspende ao menu que deseja Acessar >>> ");
        //Corrigir essa exeção para retorna ao loop para uma nova tentativa de passar um valor
        try{
            seletor = Ler.nextInt();
        }catch(Exception e){
            System.out.print("Digite um numero valido >>> ");
            return -1;
        }

        // Limpa a tela no windows, no linux e no MacOS
        System.out.print("\033[H\033[2J");

        return seletor;
    }  
    
    public static void main(String[] args) throws Exception {
        //variaveis
        int Seletor;
        boolean Usuario = true;
        Map<String, Curso> Cursos;
        Cursos = new HashMap<String, Curso>(); //inicialização do maps Curso

        Scanner Ler = new Scanner(System.in);

        //Criação de objetos
        //Cursos
        Curso curso = new Curso("Ciência da Computação", "CC", 8);
        Curso curso2 = new Curso("Engenharia de Software", "ES", 8);
        Curso curso3 = new Curso("Engenharia Civil", "EC", 8);
        Curso curso4 = new Curso("Engenharia Eletrica", "EE", 8);
        //Disciplinas
        //Algoritimo
        Disciplina Disciplina01 = new Disciplina("Algoritimo", "ALG", "Alberto", 1);
        //Banco De dados
        Disciplina Disciplina02 = new Disciplina("Banco de Dados", "BD", "Bruno", 4);
        //Eletrica basica
        Disciplina Disciplina03 = new Disciplina("Eletrica basica", "EB", "Carlos", 1);
        //Pré-calculo
        Disciplina Disciplina04 = new Disciplina("Pré-Calculo", "PC", "Jorge", 1);
        //Programação
        Disciplina Disciplina05 = new Disciplina("Programação", "PRG", "João", 2);
        //Sistemas Operacionais
        Disciplina Disciplina06 = new Disciplina("Sistemas Operacionais", "SO", "Pedro", 4);
        //calculo I
        Disciplina Disciplina07 = new Disciplina("Calculo I", "CI", "Paulo", 2);
        //calculo II
        Disciplina Disciplina08 = new Disciplina("Calculo II", "CII", "Paulo", 3);
        //calculo III
        Disciplina Disciplina09 = new Disciplina("Calculo III", "CIII", "Paulo", 4);
        //Programação Estruturada
        Disciplina Disciplina10 = new Disciplina("Programação Estruturada", "PE", "José", 5);

        //Adicionando disciplinas ao curso
        curso.add_Disciplina(Disciplina01);
        curso.add_Disciplina(Disciplina02);
        curso.add_Disciplina(Disciplina03);
        curso.add_Disciplina(Disciplina04);
        curso.add_Disciplina(Disciplina05);
        curso.add_Disciplina(Disciplina06);
        curso.add_Disciplina(Disciplina07);
        curso.add_Disciplina(Disciplina08);
        curso.add_Disciplina(Disciplina09);
        curso.add_Disciplina(Disciplina10);

        //Adicionando disciplinas ao curso2
        curso2.add_Disciplina(Disciplina01);  
        curso2.add_Disciplina(Disciplina02);
        curso2.add_Disciplina(Disciplina05);
        curso2.add_Disciplina(Disciplina06);
        curso2.add_Disciplina(Disciplina10);

        //Adicionando disciplinas ao curso3
        curso3.add_Disciplina(Disciplina04);
        curso3.add_Disciplina(Disciplina07);
        curso3.add_Disciplina(Disciplina08);
        curso3.add_Disciplina(Disciplina09);

        //Adicionando disciplinas ao curso4
        curso4.add_Disciplina(Disciplina03);
        curso4.add_Disciplina(Disciplina04);

        


        //Adicionando objetos no map
        Cursos.put(curso.get_Nome(), curso);
        Cursos.put(curso2.get_Nome(), curso2);
        Cursos.put(curso3.get_Nome(), curso3);
        Cursos.put(curso4.get_Nome(), curso4);
        


        //Ciclo Principal
        while(Usuario == true){

            //Menu
            
            Seletor = Print_menu(Ler,"0 - Sair", 
                                     "1 - Estudantes", 
                                     "2 - Disciplina", 
                                     "3 - Curso");
            

            switch(Seletor){
                case -1:
                    System.out.println("Digitie um valor Valido");
                    continue;
                case 0:
                    Usuario = false;
                    
                
            }
        }
    }

    

    
}
