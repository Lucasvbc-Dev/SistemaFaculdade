public abstract class Matricula {
    protected String data;
    protected String status;
    protected String curso;


    public Matricula(String data, String status) {
        this.data = data;
        this.status = status;

    }

    public abstract void matricular();


    public void validarMatricula() throws MatriculaInvalida {
        if (data == null) {
            throw new MatriculaInvalida("Este espaço deve ser preenchido.");
        }
       else if ( status == null){
            throw new MatriculaInvalida("Este espaço deve ser preenchido.");
        }
       else if (curso == null){
            throw new MatriculaInvalida("Este espaço deve ser preenchido");
        }
    }

    public void emitirComprovante() {
        System.out.println ("Comprovante de Matrícula: " + "Curso: " + curso + ", Data: " + data + ", Status: " + status);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "data='" + data + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
