package Trabalho;

/**
 *
 * Crie uma classe denominada Cliente e crie 6 atributos para ela, sendo que
 * existam pelo menos 3 tipos diferentes de variáveis envolvendo-os (lembre-se
 * de criar os métodos get e set). Em uma outra classe, crie 4 objetos que
 * representem essa classe Cliente. Cada cliente precisa receber atributos
 * diferentes um dos outros. Após, imprima no console alguma informação
 * pertinente a cada cliente (aqui você poderá utilizar a sobreposição do método
 * toString dentro da classe Cliente).
 */

public class Cliente {

	private String nome;
	private String altura;
	private String peso;
	private String idade;
	private String rg;
	private String cpf;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String altura, String peso, String idade, String rg, String cpf) {

		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return Entrada.leiaString("-------\n" + "Nome: " + nome + "\n" + "Altura: " + altura + "\n" + "Peso: " + peso
				+ "\n" + "Idade: " + idade);

	}

}
