import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1.0 Classe Pessoa com os atributos: nome (String) e data nascimento
        // (LocalDate).
        Pessoa p1 = new Pessoa("Edmar", LocalDate.of(1998, 5, 12));
        p1.exibirInfo();

        // 2.0 Classe Funcionário que estenda a classe Pessoa, com os atributos: salário
        // (BigDecimal) e função (String). Sugestão: invés de função nomear a variável
        // como cargo pois o programador pode achar que função é uma função dentro do
        // código.
        Funcionario f1 = new Funcionario(
                "Linus Torvalds",
                LocalDate.of(1969, 12, 28),
                new BigDecimal("3500.75"),
                "Engenheiro de Software");

        f1.exibirInfo();
    }
}