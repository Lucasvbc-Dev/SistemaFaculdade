public class MatriculaOn extends Matricula{
    protected String curso;
    protected String plataforma;

    public MatriculaOn(String data, String status, String curso, String plataforma) {
        super(data, status);
        this.curso = curso;
        this.plataforma = plataforma;
    }

    public void matricular(){
       System.out.println("Aluno Matriculado no curso online (EAD)");
   }

    public void chamadaOn(){
        System.out.println("Chamada online realizada.");
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "MatriculaOn{" +
                "data='" + data + '\'' +
                ", status='" + status + '\'' +
                ", curso='" + curso + '\'' +
                ", curso='" + curso + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
