import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Para simplificar e evitar ter de criar um Database com tabelas e fazer
        // conexão com DB. Foi utilizado apenas esta Lista com dados Mockados.
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

        /*
         * 3.2 Remover o funcionário “João” da lista.
         * IA do Itau demitiu o João por click rate baixo :( removido da lista.
         * 3.3 – Imprimir todos os funcionários com todas suas informações, sendo que:
         * • informação de data deve ser exibido no formato dd/mm/aaaa;
         * • informação de valor numérico deve ser exibida no formatado com separador de
         * milhar como ponto e decimal como vírgula.
         */

        FakeJira f32 = new FakeJira(32);
        f32.exibirDescricao();
        FakeJira f33 = new FakeJira(33);
        f33.exibirDescricao();

        funcionarios.removeIf(f -> f.getNome().equals("João"));

        /*
         * Observação eu sei que aqui eu fiz código duplicado a mesma iteração o for
         * aparece aqui embaixo e lá encima na linha 52 porém eu fiz isso
         * apenas para ser possivel ver o programa passando por todas etapas solicitadas
         * pelo site da Gupy porque achei melhor o aplicativo
         * exibir todas etapas que o avaliador ter de baixar o commit 1.0 para testar o
         * requisito 1.0 depois ele teria de ir no commit 2.0 baixar para testar
         * o requisito 2.0 e assim em diante, preferi que a versão final do programa
         * exibisse todos os testes no console de uma vez facilitando o Code Review.
         */
        for (Funcionario f : funcionarios) {
            f.exibirInfo();
        }

        // 3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista
        // de funcionários com novo valor.
        FakeJira f34 = new FakeJira(34);
        f34.exibirDescricao();

        for (Funcionario f : funcionarios) {
            // Aumenta 10% no salário
            f.setSalario(f.getSalario().multiply(new BigDecimal("1.1")));
            // Exibe as informações já com o salário atualizado
            f.exibirInfo();
        }

        // 3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
        FakeJira f35 = new FakeJira(35);
        f35.exibirDescricao();
        
        // Agrupa por função
        Map<String, List<Funcionario>> agrupados = Funcionario.agruparPorFuncao(funcionarios);

        // Exibe o resultado
        for (String funcao : agrupados.keySet()) {
            for (Funcionario f : agrupados.get(funcao)) {
                f.exibirInfo();
            }
        }
    }
}