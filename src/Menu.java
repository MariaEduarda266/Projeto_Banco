import java.util.Scanner;
import java.util.ArrayList;
public class Menu {

    Scanner leitor = new Scanner(System.in);
    ArrayList <Conta> bancoDedados = new ArrayList<>();
    Conta dadosConta = new Conta();

    public void executarMenuInicial() {

            System.out.println("Seja Bem-Vindo ao banco Login");
            System.out.println("1.Cadastro / 2.Entrar / 3.Sair");
            int escolha = leitor.nextInt();
            leitor.nextLine();
            switch (escolha) {
                case 1 -> this.menuInicialcadastro();
                case 2 -> this.menuInicialEntrar();
                case 3 -> {
                    System.out.println("Saindo do sistema... Até logo");
                    return;
                }
                default -> System.out.println("Número digitado inválido. Por favor digite um número válido");
            }
        }
    public void menuInicialcadastro(){

                System.out.println("-------Cadastro-------");
                Conta novaConta = new Conta();

                System.out.println("Nome: ");
                String nomeDigitado = leitor.nextLine();
                novaConta.setNome(nomeDigitado);
                System.out.println("CPF: ");
                String cpfDigitado = leitor.nextLine();
                novaConta.setCpf(cpfDigitado);
                System.out.println("E-mail: ");
                String emailDigitado = leitor.nextLine();
                novaConta.setEmail(emailDigitado);
                System.out.println("Senha: ");
                String senhaDigitada = leitor.nextLine();
                novaConta.setSenha(senhaDigitada);

                bancoDedados.add(novaConta);

        System.out.println("Criando sua conta... ");
        this.menuInicialEntrar();
            }
    public void menuInicialEntrar () {

        System.out.println("CPF: ");
        String cpfDigitado = leitor.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = leitor.nextLine();

        boolean contaEncontrada = false;

        for (Conta contaAtual : bancoDedados) {
            if (senhaDigitada.equals(contaAtual.getSenha()) && cpfDigitado.equals(contaAtual.getCpf())) {
                System.out.println("Bem vindo a sua conta " + contaAtual.getNome() + "!");
                contaEncontrada = true;
                this.executarMenuOpcoes(contaAtual);
                break;
            }
            }
        if (contaEncontrada == false) {
            System.out.println("Desculpe, mas sua conta ainda não existe. Tente cadastrar uma conta nova");
        }
    }

    public void executarMenuOpcoes (Conta contalogada){
        this.menuOpcoes();
    }
    public void menuOpcoes (){
        boolean continuar = true;

        while (continuar) {
        System.out.println("-------Menu Opções-------");
        System.out.println("1.Sacar");
        System.out.println("2.Depositar");
        System.out.println("3.Ver saldo");
        System.out.println("4.Extrato");
        System.out.println("5.Titular");
        System.out.println("6.Sair");
        int escolha = leitor.nextInt();
        leitor.nextLine();

            switch (escolha) {
                case 1 -> {
                    System.out.println("Seu saldo é de: " + dadosConta.getSaldo());
                    System.out.println("Digite o valor: ");
                    double valorDigitado = leitor.nextDouble();
                    dadosConta.sacar(valorDigitado);
                }
                case 2 -> {
                    System.out.println("Digite o valor do depósito: ");
                    double valorDeposito = leitor.nextDouble();
                    dadosConta.depositar(valorDeposito);
                }
                case 3 -> {
                    System.out.println("Seu saldo atual é: " + dadosConta.getSaldo());
                }
                case 4 -> {
                    dadosConta.exibirExtrato();
                }
                case 5 -> {
                    dadosConta.titular();
                }
                case 6 -> {
                    System.out.println("Saindo...");
                continuar = false;}
                default -> System.out.println("Opção inválida, por favor digite uma opção certa.");
            }
        }

}
}
