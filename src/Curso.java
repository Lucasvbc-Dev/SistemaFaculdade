public abstract class Curso {
    protected String nome;
    protected double cargaHoraria;
    protected int codigo;

    public Curso(String nome, double cargaHoraria, int codigo) throws CursoInvalido {
        if (nome == null || nome.isEmpty()){
            throw new CursoInvalido("O nome do curso deve ser preenchido e não ficar vazio.");
        }
        if (cargaHoraria <= 0){
            throw new CursoInvalido("A carga horária do curso deve ser maior que zero.");
        }
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.codigo = codigo;
    }

    public abstract void iniciarCurso();
    public abstract void finalizarCurso();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
