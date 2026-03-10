import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Conta {

        private String numeroconta = "";
        private String titular;
        private double saldo;
        private String nome, cpf, email, senha;

        Random variavel = new Random();
        Scanner leitor = new Scanner(System.in);
        private List<String> extrato = new ArrayList<>();


    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }

    public String getNumeroconta() {
        return numeroconta;
    }
    public void gerarNumeroConta() {
        String numeroGerado = "";

        int quantidadeDeDigitos = variavel.nextInt(4) + 6;

        for (int i = 0; i < quantidadeDeDigitos; i++) {
            int numeroSorteado = variavel.nextInt(10);
            numeroGerado += numeroSorteado;
        }
        this.numeroconta = numeroGerado;
    }

        public void sacar (double valor){
            if (valor <= 0) {
                System.out.println("Digite um valor válido");
            }
            else if (valor > this.saldo) {
                System.out.println("Saque negado: Saldo insuficiente. Seu saldo atual é de R$ " + this.saldo);
            }
            else {
                this.saldo-=valor;
                this.extrato.add("Levantamento: - R$ " + valor);
                System.out.println("Sucesso! Saque de R$ " + valor + " realizado. Novo saldo: R$ " + this.saldo);
            }
        }
        public void depositar (double valor){
            if (valor <= 0) {
                System.out.println("Erro: O valor do depósito precisa ser maior que zero.");
            }
            else {
                this.saldo+=valor;
                this.extrato.add("Depósito: + R$ " + valor);
                System.out.println("Sucesso! Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + this.saldo);
            }
    }
        public void titular(){
        System.out.println("-------Dados da conta-------");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Senha: " + getSenha());
        System.out.println("Número da conta: " + getNumeroconta());
    }
        public void exibirExtrato() {
        System.out.println("--- Extrato da Conta ---");

        if (this.extrato.isEmpty()) {
            System.out.println("Nenhum movimento realizado ainda.");
        } else {
            for (String operacao : this.extrato) {
                System.out.println(operacao);
            }
        }
        System.out.println("Saldo atual: R$ " + this.saldo);
    }
}

