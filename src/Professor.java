import java.time.LocalDate;

public class Professor extends Pessoa implements Avaliacao {

    protected double cargaHoraria;
    protected String disciplina;


    public Professor(String nome, int anoNascimento, String cpf, double cargaHoraria, String disciplina) throws ProfessorInvalido {
        super(nome, anoNascimento, cpf);
        if (nome == null || nome.trim().isEmpty()) {
            throw new ProfessorInvalido("Este espaço não pode estar vazio, preencha.");
        }
       else if (cargaHoraria <= 0) {
            throw new ProfessorInvalido("A carga Horaria deve ser maior que zero Horas.");
        }
        else if (disciplina == null || disciplina.trim().isEmpty()) {
            throw new ProfessorInvalido("Este espaço não pode estar vazio, preencha.");
        }
        this.cargaHoraria = cargaHoraria;
        this.disciplina = disciplina;

    }

    public void avaliar(double nota) {
        System.out.println(" O aluno " + nome + "atribuiu a nota " + nota);
    }


    public void calcular(double salarioBase, double bonus) {
        double salarioTotal = (salarioBase + bonus);
        System.out.println("Salário do professor com bônus: " + salarioTotal);
    }

    public void calcular(double salarioTotal, int mesesTrabalho) {
        double decimoTerceiro = (salarioTotal * mesesTrabalho /12);
        System.out.println("O décimo terceiro do Professor é: " + decimoTerceiro);
    }

    public int calculaIdade() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - anoNascimento;
    }

    public void minhaFuncao() {
        System.out.println("A minha função é: Ensinar os alunos e avalia-los com notas!");
    }



    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }



    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", cpf='" + cpf + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}