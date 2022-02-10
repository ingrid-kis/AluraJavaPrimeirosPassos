
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2; //expressão booliana, frase que resulta em V ou F
		//boolean acompanhado = true OU false <-- vc só pode definir se é V ou F.
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		// if (idade >=18 || quantidadePessoas >=2) {
		// lê-se: SE a idade for maior ou igual a 18 OU quantidade de pessoas for igual ou maior a 2.
		
		if (idade >=18 && acompanhado) {
			System.out.println("Seja bem-vinde!");
		}
		
		else {
		System.out.println("Infelizmente, você não pode entrar.");
	   }
		
}
	
}