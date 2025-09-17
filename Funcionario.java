import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.time.Period;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void exibirInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = getDataNascimento().format(formatter);

        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        String salarioFormatado = nf.format(salario);

        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + dataFormatada);
        System.out.println("Salário R$: " + salarioFormatado);
        System.out.println("Função: " + funcao + "\n");
    }

    // Método estático para agrupar funcionários por função
    public static Map<String, List<Funcionario>> agruparPorFuncao(List<Funcionario> lista) {
        return lista.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));
    }

    public static void aniversariantesOutubroDezembro(List<Funcionario> lista) {
        System.out.println("Funcionários que fazem aniversário nos meses 10 e 12:\n");
        for (Funcionario f : lista) {
            int mes = f.getDataNascimento().getMonthValue();
            if (mes == 10 || mes == 12) {
                f.exibirInfo();
            }
        }
    }

    // Método para imprimir o funcionário com a maior idade
    public static void funcionarioMaisVelho(List<Funcionario> lista) {
        if (lista.isEmpty()) {
            System.out.println("Lista de funcionários vazia.");
            return;
        }

        Funcionario maisVelho = lista.get(0);
        for (Funcionario f : lista) {
            if (f.getDataNascimento().isBefore(maisVelho.getDataNascimento())) {
                maisVelho = f;
            }
        }

        // Calcula a idade
        int idade = Period.between(maisVelho.getDataNascimento(), LocalDate.now()).getYears();

        System.out.println("Funcionário mais velho:");
        System.out.println("Nome: " + maisVelho.getNome());
        System.out.println("Idade: " + idade + " anos\n");
    }

    // Método para imprimir funcionários em ordem alfabética pelo nome
    public static void imprimirPorOrdemAlfabetica(List<Funcionario> lista) {
        // Cria uma cópia da lista para não alterar a original
        List<Funcionario> listaOrdenada = lista.stream()
                .sorted(Comparator.comparing(Funcionario::getNome))
                .toList();

        System.out.println("Lista de funcionários em ordem alfabética:\n");
        for (Funcionario f : listaOrdenada) {
            f.exibirInfo();
        }
    }

    // Método para imprimir o total dos salários
    public static void imprimirTotalSalarios(List<Funcionario> lista) {
        BigDecimal total = BigDecimal.ZERO;

        for (Funcionario f : lista) {
            total = total.add(f.getSalario());
        }

        // Formata o valor total
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        String totalFormatado = nf.format(total);

        System.out.println("Total dos salários dos funcionários: R$ " + totalFormatado + "\n");
    }

        // Método para imprimir quantos salários mínimos ganha cada funcionário
    public static void imprimirSalariosMinimos(List<Funcionario> lista) {
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        System.out.println("Quantos salários mínimos ganha cada funcionário:\n");
        for (Funcionario f : lista) {
            BigDecimal quantidade = f.getSalario().divide(salarioMinimo, 2, BigDecimal.ROUND_HALF_UP);
            System.out.println(f.getNome() + ": " + nf.format(quantidade) + " salários mínimos");
        }
        System.out.println();
    }
}
