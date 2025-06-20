public class MatriculaPresencial extends Matricula {
    protected String curso;
    protected String localSala;

    public MatriculaPresencial(String data, String status, String curso, String localSala) {
        super(data, status);
        this.curso = curso;
        this.localSala = localSala;
    }

    public void matricular(){
        System.out.println("Aluno matriculado no Curso presencial.");
    }

    public void chamadaPresencial() {
        System.out.println("Chamada presencial realizada.");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getLocalSala() {
        return localSala;
    }

    public void setLocalSala(String localSala) {
        this.localSala = localSala;
    }

    @Override
    public String toString() {
        return "MatriculaPresencial{" +
                "data='" + data + '\'' +
                ", status='" + status + '\'' +
                ", curso='" + curso + '\'' +
                ", curso='" + curso + '\'' +
                ", localSala='" + localSala + '\'' +
                '}';
    }
}
