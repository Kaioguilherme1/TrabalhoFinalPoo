package Classes;

public class Atividade {
    //atributos
    private String titulo;
    private String descricao;
    private String data_postagem;
    private String data_entrega;
    private boolean status = false;
    private int nota;

    //construtor
    public Atividade(String titulo, String descricao, String data_postagem, String data_entrega, boolean b, int nota) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_postagem = data_postagem;
        this.data_entrega = data_entrega;
        this.status = b;
        this.nota = nota;
    }

    //----Gets----
    public String get_titulo() {
        return titulo;
    }

    public String get_descricao() {
        return descricao;
    }

    public String get_data_postagem() {
        return data_postagem;
    }

    public String get_data_entrega() {
        return data_entrega;
    }

    public String get_status() {
        if (status) {
            return "Concluido";
        } else {
            return "Em andamento";
        }
    }

    public boolean get_status_boolean() {
        return status;
    }

    public int get_nota() {
        return nota;
    }

    //----sets----

    public void set_status(Boolean status) {
        this.status = status;
    }


}
