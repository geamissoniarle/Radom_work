package ultra_emoji_combat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
private String dataF;

public class Luta {
	//atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int round;
	private boolean aprovada;
	
	//metodos publicos
	
	public void  marcarLuta(Lutador l1, Lutador l2){
		if (l1.getCategoria().equals(l2.getCategoria())
				&& l1!=l2){
			this.aprovada=true;
			this.desafiado=l1;
			this.desafiante=l2;
		}else{
			this.aprovada=false;
			this.desafiado=null;
			this.desafiante=null;
		}
		Date data = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat ("HH:mm:ss " + " dd/MM/yyyy");
		dataF = formatar.format(data);
	}
	public void lutar(){
		if(this.aprovada){
			System.out.println("!!!!Luta aprovada!!!!");
			System.out.println(dataF);
			System.out.println("###  DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("###  DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor){
			case 0://empate
				System.out.println("empatou");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1://desafiado vence
				System.out.println(this.desafiado.getNome() + " venceu");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2://desafiante vence
				System.out.println(this.desafiante.getNome() + "venceu");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
		}else{
			System.out.println("a luta nao foi aprovada");
		}
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	//metodos especiais
	
	

}
