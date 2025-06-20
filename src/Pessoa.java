import java.time.LocalDate;

public abstract class Pessoa {
    protected String nome;
    protected int anoNascimento;
    protected String cpf;


    public int calculaIdade(){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - anoNascimento;
    }

    public void minhaFuncao(){
        System.out.println("A funçao Pessoa");
    }

    public Pessoa(String nome, int anoNascimento, String cpf) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
