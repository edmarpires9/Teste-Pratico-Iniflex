import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Edmar", LocalDate.of(1998, 5, 12));
        p1.exibirInfo();
    }
}