package ultra_emoji_combat;

public class Lutador {
	//atributos
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, empates, derrotas;
	private double altura, peso;

	//métodos públicos
	public void apresentar(){
		System.out.println("================================================================");
		System.out.println("CHEGOU A HORA!!! APRESENTAMOS O LUTADOR " + this.getNome());
		System.out.println("diretamente de(a) " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
		System.out.println("pesando " + this.getPeso() + " Kg");
		System.out.println(this.getVitorias() + " vitorias");
		System.out.println(this.getEmpates() + " empates e ");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println("=================================================================");
		
	}
	
	public void status(){
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Tem " + this.getVitorias() + " Vitorias" );
		System.out.println(this.getEmpates() + " empates e ");
		System.out.println(this.getDerrotas() + " derrotas");
		
	}
	
	public void ganharLuta(){
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta(){
		this.setDerrotas(this.getVitorias() + 1);
	}
	
	public void empatarLuta(){
		this.setEmpates(this.getEmpates() + 1);
	}

	//métodos especiais
	
	public Lutador(String nom, String nac, int ida, int vit, int emp, int der, double alt,
			double peso) {
		
		this.nome = nom;
		this.nacionalidade = nac;
		this.idade = ida;
		this.vitorias =  vit;
		this.empates = emp;
		this.derrotas = der;
		this.altura = alt;
		this.setPeso(peso);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso<52.2){
			this.categoria="Invalido";
		}else if (this.peso<= 70.3){
			this.categoria="Leve";
		}else if (this.peso<=83.9){
			this.categoria="Médio";
		}else if (this.peso<=120.2){
			this.categoria="Pesado";
		}else{
			this.categoria="Invalido";
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
}	
	
	
	
	