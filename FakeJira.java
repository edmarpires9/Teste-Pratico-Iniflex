public class FakeJira {
    private int PDB;

    public FakeJira(int PDB) {
        this.PDB = PDB;
    }

    public void exibirDescricao() {
        System.out.println("===============================================================================");
        switch (PDB) {
            case 1:
                System.out.println("PDB: \"1.0\" : Classe Pessoa com os atributos: nome (String) e data nascimento (LocalDate).");
                break;
            case 2:
                System.out.println("PDB: \"2.0\" : Classe Funcionário que estenda a classe Pessoa, com os atributos: salário (BigDecimal) e função (String).");
                break;
            case 3:
                System.out.println("PDB: \"3.0\" : Criar classe Principal para executar ações gerais com funcionários.");
                break;
            case 31:
                System.out.println("PDB: 3.1 : Inserir todos os funcionários, na mesma ordem e informações da tabela acima.");
                break;
            case 32:
                System.out.println("PDB: 3.2 : Remover o funcionário João da lista.");
                break;
            case 33:
                System.out.println("PDB: 3.3 : Imprimir todos os funcionários com todas suas informações:\n" +
                                   "      data no formato dd/mm/aaaa;\n" +
                                   "      valores numéricos com separador de milhar como ponto e decimal como vírgula.");
                break;
            case 34:
                System.out.println("PDB: 3.4 : Atualizar a lista de funcionários com 10% de aumento de salário.");
                break;
            case 35:
                System.out.println("PDB: 3.5 : Agrupar os funcionários por função em um MAP e imprimir os grupos.");
                break;
            case 36:
                System.out.println("PDB: 3.8 : Imprimir os funcionários que fazem aniversário nos meses 10 e 12.");
                break;
            case 37:
                System.out.println("PDB: 3.9 : Imprimir o funcionário com a maior idade, exibindo nome e idade.");
                break;
            case 38:
                System.out.println("PDB: 3.10 : Imprimir a lista de funcionários por ordem alfabética.");
                break;
            case 39:
                System.out.println("PDB: 3.11 : Imprimir o total dos salários dos funcionários.");
                break;
            case 40:
                System.out.println("PDB: 3.12 : Imprimir quantos salários mínimos ganha cada funcionário (salário mínimo R$1212,00).");
                break;
            default:
                System.out.println("Valor inválido para PDB!");
        }
    }
}
