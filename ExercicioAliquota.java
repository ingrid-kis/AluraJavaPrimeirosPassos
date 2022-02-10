public class ExercicioAliquota {

	public static void main(String[] args) {
		double salario = 3300.0;
		
			if(salario<1900) {
				System.out.println("Não tem imposto de renda para descontar.");
			}
			
			else if (salario>1900.0 && salario<=2800.0) { //se
				System.out.println("O IR é 7,5%, a declaração é no valor de R$142,00.");
			}
			
			else if (salario>=2800.01 && salario<=3751.0) { //se de segunda condicao
					System.out.println("O IR é de 15%, a declaração é no valor de R$350,00.");
			}
				
			else { //senao NUNCA TEM PARENTESES, pq vai pra ele o q nao obedecer as condições anterioires.
						System.out.println("O IR é  22,5%, a declaração é no valor de R$636,00.");
			}
			
			


	}
}