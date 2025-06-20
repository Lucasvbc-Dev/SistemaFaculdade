import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n  Menu Principal  ");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Cadastrar Funcionário");
            System.out.println("4. Realizar Matrícula");
            System.out.println("5. Cadastrar Curso");
            System.out.println("6. Emitir Certificado");
            System.out.println("7. Calcular Média do Aluno");
            System.out.println("8. Calcular Salário do Professor");
            System.out.println("9. Calcular Salário do Funcionário");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            try {
                switch (opcao) {
                    case 1:
                        cadastrarAluno(scanner);
                        break;
                    case 2:
                        cadastrarProfessor(scanner);
                        break;
                    case 3:
                        cadastrarFuncionario(scanner);
                        break;
                    case 4:
                        realizarMatricula(scanner);
                        break;
                    case 5:
                        cadastrarCurso(scanner);
                        break;
                    case 6:
                        emitirCertificado(scanner);
                        break;
                    case 7:
                        calcularMedia(scanner);
                        break;
                    case 8:
                        calcularSalarioProfessor(scanner);
                        break;
                    case 9:
                        calcularSalarioFuncionario(scanner);
                        break;
                    case 10:
                        System.out.println("Saindo do sistema.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro geral: " + e.getMessage());
            }
        }
    }

    private static void cadastrarAluno(Scanner scanner) throws AlunoInvalido {
        System.out.println("\nDigite os dados do Aluno:");
        System.out.print("Nome: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("Ano de Nascimento: ");
        int anoNascimentoAluno = Integer.parseInt(scanner.nextLine());
        System.out.print("CPF: ");
        String cpfAluno = scanner.nextLine();
        System.out.print("Matrícula: ");
        double matriculaAluno = Double.parseDouble(scanner.nextLine());
        System.out.print("Turma: ");
        int turmaAluno = Integer.parseInt(scanner.nextLine());
        System.out.print("Saldo Devedor: ");
        double saldoDevedorAluno = Double.parseDouble(scanner.nextLine());
        System.out.print("Identificação: ");
        int identificacaoAluno = Integer.parseInt(scanner.nextLine());

        Aluno aluno = new Aluno(nomeAluno, anoNascimentoAluno, cpfAluno, matriculaAluno, turmaAluno, saldoDevedorAluno, identificacaoAluno);
        System.out.println("Aluno cadastrado com sucesso: " + aluno);
        aluno.minhaFuncao();
    }

    private static void cadastrarProfessor(Scanner scanner) throws ProfessorInvalido {
        System.out.println("\nDigite os dados do Professor:");
        System.out.print("Nome: ");
        String nomeProfessor = scanner.nextLine();
        System.out.print("Ano de Nascimento: ");
        int anoNascimentoProfessor = Integer.parseInt(scanner.nextLine());
        System.out.print("CPF: ");
        String cpfProfessor = scanner.nextLine();
        System.out.print("Carga Horária: ");
        double cargaHorariaProfessor = Double.parseDouble(scanner.nextLine());
        System.out.print("Disciplina: ");
        String disciplinaProfessor = scanner.nextLine();

        Professor professor = new Professor(nomeProfessor, anoNascimentoProfessor, cpfProfessor, cargaHorariaProfessor, disciplinaProfessor);
        System.out.println("Professor cadastrado com sucesso: " + professor);
        professor.minhaFuncao();

    }

    private static void cadastrarFuncionario(Scanner scanner) throws FuncionarioInvalido {
        System.out.println("\nDigite os dados do Funcionário:");
        System.out.print("Nome: ");
        String nomeFuncionario = scanner.nextLine();
        System.out.print("Ano de Nascimento: ");
        int anoNascimentoFuncionario = Integer.parseInt(scanner.nextLine());
        System.out.print("CPF: ");
        String cpfFuncionario = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioFuncionario = Double.parseDouble(scanner.nextLine());

        Funcionarios funcionario = new Funcionarios(nomeFuncionario, anoNascimentoFuncionario, cpfFuncionario, salarioFuncionario);
        System.out.println("Funcionário cadastrado com sucesso: " + funcionario);
        funcionario.minhaFuncao();
        funcionario.calculaIdade();
    }

    private static void realizarMatricula(Scanner scanner) {
        System.out.println("\nDigite os dados da Matrícula:");
        System.out.print("Data da Matrícula: ");
        String data = scanner.nextLine();
        System.out.print("Status da Matrícula: ");
        String status = scanner.nextLine();
        System.out.println("Escolha o tipo de Matrícula:");
        System.out.println("1. Matrícula Online");
        System.out.println("2. Matrícula Presencial");
        int tipo = Integer.parseInt(scanner.nextLine());

        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        if (tipo == 1) {
            MatriculaOn matriculaOn = new MatriculaOn(data, status, curso, "AVA");
            matriculaOn.matricular();
            System.out.println("Matrícula Online registrada: " + matriculaOn);
        } else if (tipo == 2) {
            MatriculaPresencial matriculaPresencial = new MatriculaPresencial(data, status, curso, "Bloco D");
            matriculaPresencial.matricular();
            System.out.println("Matrícula Presencial registrada: " + matriculaPresencial);
        } else {
            System.out.println("Opção inválida para o tipo de matrícula.");
        }
    }

    private static void cadastrarCurso(Scanner scanner) throws CursoInvalido {
        System.out.println("\nDigite os dados do Curso:");
        System.out.print("Nome do Curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.print("Carga Horária: ");
        double cargaHorariaCurso = Double.parseDouble(scanner.nextLine());
        System.out.print("Código do Curso: ");
        int codigoCurso = Integer.parseInt(scanner.nextLine());

        System.out.println("Escolha o tipo de curso:");
        System.out.println("1. Curso Online");
        System.out.println("2. Curso Presencial");
        int tipoCurso = Integer.parseInt(scanner.nextLine());

        if (tipoCurso == 1) {
            System.out.print("Capacidade Máxima: ");
            int capacidadeMaxima = Integer.parseInt(scanner.nextLine());
            CursoOn cursoOn = new CursoOn(nomeCurso, cargaHorariaCurso, codigoCurso, capacidadeMaxima);
            System.out.println("Curso Online cadastrado com sucesso: " + cursoOn);
            cursoOn.iniciarCurso();
        } else if (tipoCurso == 2) {
            System.out.print("Capacidade Máxima: ");
            int capacidadeMaxima = Integer.parseInt(scanner.nextLine());
            CursoPresencial cursoPresencial = new CursoPresencial(nomeCurso, cargaHorariaCurso, codigoCurso, capacidadeMaxima);
            System.out.println("Curso Presencial cadastrado com sucesso: " + cursoPresencial);
            cursoPresencial.iniciarCurso();
        } else {
            System.out.println("Opção de tipo de curso inválida.");

        }

    }

    private static void emitirCertificado(Scanner scanner) {
        System.out.println("\nEmitir Certificado para o Aluno:");
        System.out.print("Nome do Aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.println("Certificado emitido para o aluno: " + nomeAluno);
    }

    private static void calcularMedia(Scanner scanner) {
        try {
            System.out.println("\nDigite as notas do Aluno:");
            System.out.print("Nota 1: ");
            double nota1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Nota 2: ");
            double nota2 = Double.parseDouble(scanner.nextLine());

            Aluno aluno = new Aluno(".", 0000, "123456789", 33333.0, 1, 0.0, 123);
            aluno.calcular(nota1, nota2);

            System.out.print("Nota do Trabalho: ");
            int notaTrabalho = Integer.parseInt(scanner.nextLine());
            double media = (nota1 + nota2) / 2;
            aluno.calcular(media, notaTrabalho);
        } catch (AlunoInvalido e) {
            System.out.println("Erro ao calcular a média: " + e.getMessage());
        }
    }

    private static void calcularSalarioProfessor(Scanner scanner) {
        try {
            System.out.println("\nDigite os dados do Professor:");
            System.out.print("Salário Base: ");
            double salarioBase = Double.parseDouble(scanner.nextLine());
            System.out.print("Bônus: ");
            double bonus = Double.parseDouble(scanner.nextLine());

            Professor professor = new Professor(".", 0000, "123456789", 100.0, ".");
            professor.calcular(salarioBase, bonus);
        } catch (ProfessorInvalido e) {
            System.out.println("Erro ao calcular salário do professor: " + e.getMessage());
        }
    }

    private static void calcularSalarioFuncionario(Scanner scanner) {
        try {
            System.out.println("\nDigite os dados do Funcionário:");
            System.out.print("Horas Extras: ");
            int horasExtras = Integer.parseInt(scanner.nextLine());
            System.out.print("Valor por Hora: ");
            double valorPorHora = Double.parseDouble(scanner.nextLine());

            Funcionarios funcionario = new Funcionarios(".", 0000, "123456789", 0000.1);
            funcionario.calcular(horasExtras, valorPorHora);
        } catch (FuncionarioInvalido e) {
            System.out.println("Erro ao calcular salário do funcionário: " + e.getMessage());
        }
    }
}


