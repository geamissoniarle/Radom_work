package ultra_emoji_combat;

public class Ultra_Emoji_Combat {

	public static void main(String[] args) {
		
		Lutador l[]= new Lutador[6]; 
		
		
		l[0]= new Lutador("pretty boy", "Portugal", 23, 11, 4, 5, 1.78, 69);
		
		l[1]= new Lutador("lord vader", "Singapura", 22, 10, 1, 4, 1.72, 89);
		
		l[2]= new Lutador("putscrips", "EUA", 19, 8, 3, 2, 1.69, 70);
		
		l[3]= new Lutador("kall", "Canada", 24, 16, 6, 2, 1.73, 102);
		
		l[4]= new Lutador("Snake", "china", 21, 18, 2, 0, 1.68, 82);
		
		l[5]= new Lutador("Jake", "Australia", 26, 13, 4, 6, 1.76, 99);
		
		
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[1], l[5]);
		UEC01.lutar();

	}

}
