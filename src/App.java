import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Profissional profissional = new Profissional();
        profissional.nome = "Túlio A3";
        profissional.salarioMensal = 2000.00;

        System.out.println("Nome: " + profissional.nome);
        System.out.println("Salário Mensal Pretendido: " + profissional.salarioMensal);
        System.out.println("Horas Mês: " + profissional.horasUteisMes);
        double valorHora = profissional.CalculaValorHora();
        System.out.println("Valor/Hora: " + valorHora);

        Tela[] telas = new Tela[4];

        Tela telaDeLogin = new Tela();
        telaDeLogin.tipo = "Login";
        telaDeLogin.complexidade = 3;
        telas[0] = telaDeLogin;

        Tela telaNormal = new Tela();
        telaNormal.tipo = "Tela Normal";
        telaNormal.complexidade = 1;
        telas[1] = telaNormal;

        Tela telaDeSaida = new Tela();
        telaDeSaida.tipo = "Tela Saída";
        telaDeSaida.complexidade = 2;
        telas[2] = telaDeSaida;

        int decisao;
        int totalHoras = 0;
        double orçamento;
        double multa;

        do {

            System.out.println(
                    "\n Selecione um tipo de tela \n 1 - Tela de Login \n 2 - Tela Normal \n 3 - Tela de Saída");
            int tipoTela = sc.nextInt();
            while ((tipoTela < 1) || (tipoTela > 3)) {
                System.out.println("Seleção inválida, selecione novamente o tipo de tela");
                System.out.println(
                        "\n Selecione um tipo de tela \n 1 - Tela de Login \n 2 - Tela Normal \n 3 - Tela de Saída");
                tipoTela = sc.nextInt();

            }

            System.out.println("Qual a quantidade da tela?");
            int quantidade = sc.nextInt();

            Tela telaSelecionada = telas[tipoTela - 1];
            totalHoras += quantidade * telaSelecionada.CalcularQuantidadeHoras();

            System.out.println("\n Deseja selecionar mais telas? \n 1 - Sim \n 2 - Não");
            decisao = sc.nextInt();
            while (decisao != 1 && decisao != 2) {
                System.out.println("Seleção inválida, selecione novamente se deseja mais telas");
                System.out.println("\n Deseja selecionar mais telas? \n 1 - Sim \n 2 - Não");
                decisao = sc.nextInt();
            }

        } while (decisao == 1);

        sc.close();

        orçamento = totalHoras * valorHora;

        multa = (orçamento / 100) * 30;

        System.out.println("Valor Total do Orçamento: R$ " + orçamento);
        System.out.println("Em caso de Cancelamento o valor da multa será: R$ " + multa);

    }
}
