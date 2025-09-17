import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        funcionarios
                .add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        funcionarios
                .add(new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

        // 1.0 Classe Pessoa com os atributos: nome (String) e data nascimento
        // (LocalDate).
        FakeJira fj1 = new FakeJira(1);
        fj1.exibirDescricao();

        Pessoa p1 = new Pessoa("Edmar", LocalDate.of(1998, 5, 12));
        p1.exibirInfo();

        /*
         * 2.0 Classe Funcionário que estenda a classe Pessoa, com os atributos: salário
         * (BigDecimal) e função (String). Sugestão: invés de "função" nomear a variável
         * como "cargo" pois o programador pode achar que função é uma função dentro do
         * código quando na verdade função é um cargo.
         */
        FakeJira f2 = new FakeJira(2);
        f2.exibirDescricao();

        Funcionario f1 = new Funcionario(
                "Linus Torvalds",
                LocalDate.of(1969, 12, 28),
                new BigDecimal("3500.75"),
                "Engenheiro de Software");

        f1.exibirInfo();

        // 3.1 Inserir todos os funcionários, na mesma ordem e informações da tabela
        // acima.
        FakeJira f31 = new FakeJira(31);
        f31.exibirDescricao();

        for (Funcionario f : funcionarios) {
            f.exibirInfo();
        }
    }
}