public class CursoPresencial extends Curso implements Certificado{
    protected int capacidadeMaxima;


    public CursoPresencial(String nome, double cargaHoraria, int codigo, int capacidadeMaxima) throws CursoInvalido {
        super(nome, cargaHoraria, codigo);
        this.capacidadeMaxima = capacidadeMaxima;
    }


    public void iniciarCurso(){
        System.out.println("Curso presencial iniciado");
    }

    public void finalizarCurso(){
        System.out.println("Curso presencial finalizado");
    }

    public void emitirCertificado(Aluno aluno){
        System.out.println("Certificado de " + aluno.getNome() + "no curso " + nome );
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    @Override
    public String toString() {
        return "CursoPresencial{" +
                "nome='" + nome + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", codigo=" + codigo +
                ", capacidadeMaxima=" + capacidadeMaxima +
                '}';
    }
}
