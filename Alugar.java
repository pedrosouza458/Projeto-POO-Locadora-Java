import java.util.ArrayList;
import java.util.Date;

public class Alugar {

	public static String descricao;
	public Filmes Filmes;
	public Date entrada;
	public double vencimento;
	public Double valor;
	public String nome;	
	public ArrayList<Alugar> filmesalugados;
	
	public static Alugar ler() {
		Alugar alugar = new Alugar();
		System.out.println("Por favor, pesquise um filme.");
		alugar.nome = Locadora.leitor.nextLine();
		System.out.println("Digite a descri��o do filme:");
		Alugar.descricao = Locadora.leitor.nextLine();
		System.out.println("Digite o valor do filme que quer alugar:");
		alugar.valor = Locadora.leitor.nextDouble();
		System.out.println("Digite o tempo limite para devolu��o:");
		alugar.vencimento = Locadora.leitor.nextDouble();
		Locadora.leitor.nextLine();
		return alugar;
	}
	  public void imprimir(){
			System.out.println("Filme alugado com sucesso!");
			System.out.println("O nome do filme �: "+nome);
			System.out.println("a descri��o do filme �: "+descricao);
			System.out.println("O valor do filme � R$ "+valor);
			System.out.println("O seu prazo de entrega � de: "+vencimento+ " dias");

		}
	
	
	public static void main(String[] args) {
		Alugar p = Alugar.ler();p.imprimir();
	}

}
