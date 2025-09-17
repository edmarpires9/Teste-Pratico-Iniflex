import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

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
}
