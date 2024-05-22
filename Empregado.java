import java.util.ArrayList;
import java.util.Scanner;

public class Empregado {
//Implemente uma classe Empregado com os seguintes atributos: nome, idade e salario
    private String nome;
    private int idade;
    private double salario;

//    Construtores/inicializando atributos
    public Empregado(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

//    Métodos get/set para atributo nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
//    Métodos get/set para atributo idade
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
//    Métodos get/set para atributo salario
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

//    Criando métodos promover(),aumentarSalario() e demitir()
    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }
    public void promover(){
//    Utilizando estrutura condicional if para verificar idade
        if (this.idade > 18) {
            aumentarSalario(25);
        } else {
            System.out.println("Menor de idade. Sem promoção");
        }
    }
    public void demitir(int motivo){
//      Utilizando estrutura switch-case para verificar motivo/multa/justa causa
        switch(motivo){
            case 1:
                System.out.println("justa causa");
                break;
            case 2:
                double multa = this.salario * 0.40; //calculo de multa
                break;
            case 3:
                if (salario >=1000 && salario <2000){
                    salario = 1500;
                } else if (salario > 2000 && salario <=3000) {
                    salario = 2500;
                } else if (salario > 3000 && salario <=4000) {
                    salario=3500;
                } else {
                    salario=4000;
                }
                System.out.println("Aposentado. Salario de aposentado: "+salario);
                break;
            default:
                System.out.println("Motivo invalido");
        }
    }
//    método para aumentar 1 ano a idade.
    public void fazerAniversario(){
        this.idade+=1;
    }
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
    public static void criarNovoEmpregado(Scanner scanner, ArrayList<Empregado> empregados) {
        System.out.print("Digite o nome do empregado: ");
        String nome = scanner.next();
        System.out.print("Digite a idade do empregado: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o salário do empregado: ");
        double salario = scanner.nextDouble();

        Empregado empregado = new Empregado(nome, idade, salario);
        empregados.add(empregado);
        System.out.println("Empregado criado com sucesso!");
    }
    public static void promoverEmpregado(Scanner scanner, ArrayList<Empregado> empregados) {
        System.out.print("Digite o índice do empregado a ser promovido: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < empregados.size()) {
            empregados.get(indice).promover();
            System.out.println("Empregado promovido com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
    public static void aumentarSalarioEmpregado(Scanner scanner, ArrayList<Empregado> empregados) {
        System.out.print("Digite o índice do empregado: ");
        int indice = scanner.nextInt();
        System.out.print("Digite o percentual de aumento: ");
        double percentual = scanner.nextDouble();

        if (indice >= 0 && indice < empregados.size()) {
            empregados.get(indice).aumentarSalario(percentual);
            System.out.println("Salário aumentado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
    public static void demitirEmpregado(Scanner scanner, ArrayList<Empregado> empregados) {
        System.out.print("Digite o índice do empregado a ser demitido: ");
        int indice = scanner.nextInt();
        System.out.print("Digite o motivo da demissão (1-justa causa, 2-multa, 3-aposentadoria): ");
        int motivo = scanner.nextInt();

        if (indice >= 0 && indice < empregados.size()) {
            empregados.get(indice).demitir(motivo);
            System.out.println("Empregado demitido!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
    public static void fazerAniversarioEmpregado(Scanner scanner, ArrayList<Empregado> empregados) {
        System.out.print("Digite o índice do empregado que fez aniversário: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < empregados.size()) {
            empregados.get(indice).fazerAniversario();
            System.out.println("Aniversário celebrado!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
    public static void mostrarDetalhesEmpregados(ArrayList<Empregado> empregados) {
        if (empregados.isEmpty()) {
            System.out.println("Nenhum empregado cadastrado.");
        } else {
            for (int i = 0; i < empregados.size(); i++) {
                System.out.println("Empregado " + i + ": " + empregados.get(i));
            }
        }
    }
}

