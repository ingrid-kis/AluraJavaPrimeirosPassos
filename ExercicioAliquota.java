public class ExercicioAliquota {

	public static void main(String[] args) {
		double salario = 3300.0;
		
			if(salario<1900) {
				System.out.println("N�o tem imposto de renda para descontar.");
			}
			
			else if (salario>1900.0 && salario<=2800.0) { //se
				System.out.println("O IR � 7,5%, a declara��o � no valor de R$142,00.");
			}
			
			else if (salario>=2800.01 && salario<=3751.0) { //se de segunda condicao
					System.out.println("O IR � de 15%, a declara��o � no valor de R$350,00.");
			}
				
			else { //senao NUNCA TEM PARENTESES, pq vai pra ele o q nao obedecer as condi��es anterioires.
						System.out.println("O IR �  22,5%, a declara��o � no valor de R$636,00.");
			}
			
			


	}
}