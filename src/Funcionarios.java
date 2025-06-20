import java.time.LocalDate;

public class Funcionarios extends Pessoa{
    protected double salario;

    public Funcionarios(String nome, int anoNascimento, String cpf, double salario) throws FuncionarioInvalido {
        super(nome, anoNascimento, cpf);
        if (nome == null || nome.trim().isEmpty()){
            throw new FuncionarioInvalido("Este espaço não pode estar vazio, preencha.");
        }
       else if (salario <= 0){
            throw new FuncionarioInvalido("O Salario do funcionário deve ser maior que zero");
        }
        this.salario = salario;
    }

    public void calcular(int horasExtras, double valorPorHora) {
        double total = horasExtras * valorPorHora;
        System.out.println("Valor das horas extras: " + total);
    }

    public void calcular(double total, double horasNormais) {
        double valorFinal = total * horasNormais;
        System.out.println("Valor final que o funcionario irá receber é : " + valorFinal);
    }


    public int calculaIdade(){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - anoNascimento;
    }

    public void minhaFuncao(){
        System.out.println("A minha função é: Fazer os serviços que me foram pedidos!");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }
}



