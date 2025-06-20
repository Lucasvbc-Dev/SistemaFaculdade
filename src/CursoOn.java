public class CursoOn extends Curso implements Certificado{
    protected int capacidadeMaxima;

    public CursoOn(String nome, double cargaHoraria, int codigo, int capacidadeMaxima) throws CursoInvalido {
        super(nome, cargaHoraria, codigo);
        this.capacidadeMaxima = capacidadeMaxima;
    }


    public void iniciarCurso(){
        System.out.println("Curso online iniciado");
    }

    public void finalizarCurso(){
        System.out.println("Curso online finalizado");
    }

    public void emitirCertificado(Aluno aluno){
        System.out.println("Certificado de " + aluno.getNome() + "no curso " + nome );
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capaxidadeMaxima) {
        this.capacidadeMaxima = capaxidadeMaxima;
    }

    @Override
    public String toString() {
        return "CursoOn{" +
                "nome='" + nome + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", codigo=" + codigo +
                ", capacidadeMaxima=" + capacidadeMaxima +
                '}';
    }
}
