import java.time.LocalDate;

public class Aluno extends Pessoa implements Pagamento{

    protected double matricula;
    protected int turma;
    protected double saldoDevedor;
    protected int identificacao;


    public Aluno(String nome, int anoNascimento, String cpf, double matricula, int turma, double saldoDevedor, int identificacao) throws AlunoInvalido{
        super(nome, anoNascimento, cpf);
        if(nome == null || nome.trim().isEmpty()){
            throw new AlunoInvalido("Este espaço não pode estar vazio, preencha.");
        }
        else if(turma <= 0){
            throw new AlunoInvalido("Este espaço deve ser preenchido por um numero positivo.");
        }
        else if(matricula <= 0){
            throw new AlunoInvalido("Este espaço deve ser preenchido por um numero positivo.");
        }
        this.matricula = matricula;
        this.turma = turma;
        this.saldoDevedor = saldoDevedor;
        this.identificacao = identificacao;
    }


    public void calcular(double nota1, double nota2){
        double media = (nota1 + nota2) / 2;
        System.out.println("Media do aluno: " + media);
    }

    public void calcular(double media, int notaTrabalho){
        double mediaAv3 = (media + notaTrabalho/ 2);
        System.out.println("A media final do aluno no semestre é: " + mediaAv3);
    }


    public int calculaIdade(){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - anoNascimento;
    }

    public void minhaFuncao(){
        System.out.println("A minha função é: Estudar e tirar notas acima da Média!");
    }

    public void pagar(double valor){
        if(valor >= saldoDevedor){
            saldoDevedor = 0;
            System.out.println("Pagamento realizado!");
        }else{
            saldoDevedor -= valor;
            System.out.println("Pagamento parcial realizado. Ainda deve: " + saldoDevedor);
        }
   }

    public boolean verificaPagamento(){
        return saldoDevedor == 0;
    }

    public double getMatricula() {

        return matricula;
    }

    public void setMatricula(double matricula) {

        this.matricula = matricula;
    }

    public int getTurma() {

        return turma;
    }


    public void setTurma(int turma) {

        this.turma = turma;
    }

    public double getSaldoDevedor() {

        return saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {

        this.saldoDevedor = saldoDevedor;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", cpf='" + cpf + '\'' +
                ", matricula=" + matricula +
                ", turma=" + turma +
                ", saldoDevedor=" + saldoDevedor +
                ", identificacao=" + identificacao +
                '}';
    }
}
