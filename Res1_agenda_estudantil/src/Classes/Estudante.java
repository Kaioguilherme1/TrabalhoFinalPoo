package Classes;

public class Estudante {
        
        //atributos
        String Nome;
        Curso Curso;
        int Periodo;
        Horario Horario;
        int Matricula;

        //construtor
        public Estudante(String Nome) {
            this.Nome = Nome;
            
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

        public void set_Periodo(int Periodo) {
            this.Periodo = Periodo;
        }

        public void set_Matricula(int Matricula) {
            this.Matricula = Matricula;
        }
}
