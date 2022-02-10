package condicionais;

public class TestaLacosEncadeados {

	public static void main(String[] args) {
		
		//EX PRA FZR A TABUADA INTEIRA
		
		for (int multiplicador=1;  multiplicador<=10;  multiplicador ++) {
			
			//agora fazer um contador pelo numero q vc quer multiplicar
			for( int contador=0; contador <=10; contador++) {
				System.out.print(multiplicador*contador);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
