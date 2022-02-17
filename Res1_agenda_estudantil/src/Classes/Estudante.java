package Classes;

public class Estudante {
        
        //atributos
        String Nome;
        Curso Curso;
        float Periodo;
        Horario Horario;
        int Matricula;

        //construtor
        public Estudante(String Nome, Curso Curso, float Periodo, int Matricula) {
            this.Nome = Nome;
            this.Curso = Curso;
            this.Periodo = Periodo;
            this.Matricula = Matricula;
        }

        //----Gets----
        public String get_Nome() {
            return Nome;
        }

        public Curso get_Curso() {
            return Curso;
        }

        public float get_Periodo() {
            return Periodo;
        }

        public int get_Matricula() {
            return Matricula;
        }

        //----sets----

        public void set_Nome(String Nome) {
            this.Nome = Nome;
        }

        public void set_Curso(Curso Curso) {
            this.Curso = Curso;
        }

        public void set_Periodo(float Periodo) {
            this.Periodo = Periodo;
        }
}
