/************************************************************
 | TITULO: Classe doguinhos                                  |
 | AUTORES: Kaio Guilherme, Lucas Anderson, Wandressa Reis   |
 | DATA DE INICIO: 07/02/2022                                |
 | DATA DE TERMINO: 00/00/0000                               |
 | PROPOSITO:                                                |   
 | INSTITUIÇÃO: Uiversidade federal De Roraima               |
 ************************************************************/




import Classes.Disciplina;

public class App {
    public static void main(String[] args) throws Exception {
        
        //objeto disciplinas
        Disciplina Matematica = new Disciplina("Matematica", "MAT", "João marcedo", 1);

        //adicionando atividades
        Matematica.add_atividades("AT-01", "Pesquisar sobre numeros reais", "15/02/2022", "20/02/2022", true, 2);
        Matematica.add_atividades("AT-02", "Pesquisar sobre numeros complexos", "15/02/2022", "20/02/2022", true, 2);
        Matematica.add_atividades("AT-03", "Pesquisar sobre numeros ", "15/02/2022", "20/02/2022", true, 2);

        Matematica.print_atividades();
    }
}
