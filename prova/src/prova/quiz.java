package prova;
import java.util.Scanner;

public class quiz {
	public static void main (String [] args) {
		System.out.println("Bem-vindo ao meu mini jogo! Separei 5 perguntas relacionadas a One Piece!");
		System.out.println("Boa sorte!");
		  Scanner Onepiece = new Scanner(System.in);
	        
	        int qtdpontos = 0;
	        
	        System.out.println(" ");
	        System.out.println("Quem é o protagonista de One Piece?");
	        System.out.println("(a) Monkey D. Luffy");
	        System.out.println("(b) Roronoa Zoro");
	        System.out.println("(c) Monkey D Garp");
	        System.out.println("(d) Portgas D Ace");
	        
	        char pergunta1 = Onepiece.nextLine().toLowerCase().charAt(0);
	        
	        
	        switch (pergunta1) {
	            case 'a':
	                System.out.println("Párabens você acertou!");
	                qtdpontos++;
	                break;
	            default:
	                System.out.println("Você errou! triste...");
	                break;
	        }
	        
	       
	        System.out.println("Quem é o primeiro a entrar ao bando dos Chapéus de Palha?");
	        System.out.println("(a) Vinsmoke Sanji");
	        System.out.println("(b) Roronoa Zoro");
	        System.out.println("(c) GOD Usopp");
	        System.out.println("(d) Shanks");
	        
	        char pergunta2 = Onepiece.nextLine().toLowerCase().charAt(0);
	        
	        switch (pergunta2) {
	            case 'b':
	                System.out.println("Párabens você acertou!");
	                qtdpontos++;
	                break;
	            default:
	                System.out.println("Você errou! triste...");
	                break;
	        }
	        
	      
	        System.out.println("Em que episodio o anime de One Piece está?");
	        System.out.println("(a) 1096");
	        System.out.println("(b) 1097");
	        System.out.println("(c) 1098");
	        System.out.println("(d) 1099");
	        
	        char pergunta3 = Onepiece.nextLine().toLowerCase().charAt(0);
	        
	        switch (pergunta3) {
	            case 'd':
	                System.out.println("Párabens você acertou!");
	                qtdpontos++;
	                break;
	            default:
	                System.out.println("Você errou! triste...");
	                break;
	        }
	        
	       
	        System.out.println("Quais são os atuais Yonkous/Imperadores de One Piece?");
	        System.out.println("(a) Monkey D. Luffy, Shanks, Marshall D. Teach(Barba Negra) e Buggy");
	        System.out.println("(b) Edward Newgate(Barba Branca), Shanks, Kaido e Big Mom");
	        System.out.println("(c) Marshall D. Teach(Barba Negra), Shnaks, Kaido e Big Mom");
	        System.out.println("(d) Marshall D. Teach(Barba Negra), Edward Newgate(Barba Branca), Monkey D. Luffy, Kaido");
	        
	        char pergunta4 = Onepiece.nextLine().toLowerCase().charAt(0);
	        
	        switch (pergunta4) {
	            case 'a':
	                System.out.println("Párabens você acertou!");
	                qtdpontos++;
	                break;
	            default:
	                System.out.println("Você errou! triste...");
	                break;
	        }
	        
	       
	        System.out.println("No arco de Jaya, existe uma frase marcante: O Sonho das pessoas, NÃO TÊM FIM! e ela é dita por qual personagem? ");
	        System.out.println("(a) Monkey D Luffy");
	        System.out.println("(b) Doflamingo");
	        System.out.println("(c) Marshall D. Teach(Barba Negra)");
	        System.out.println("(d) Bellamy");
	        
	        char pergunta5 = Onepiece.nextLine().toLowerCase().charAt(0);
	        
	        switch (pergunta5) {
	            case 'c' :
	                System.out.println("Párabens você acertou!");
	                qtdpontos++;
	                break;
	            default:
	                System.out.println("Você errou! triste...");
	                break;
	        }
	        
	        System.out.println("É isso meu Nakama, obrigado por ter jogado! " + qtdpontos + "/5");
	        if(qtdpontos >= 5) {
	        	System.out.println("Parábens você conhece muito de One Piece e acertou todas!! ");
	        } 

	}
}
