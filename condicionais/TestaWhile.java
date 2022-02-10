package condicionais;

public class TestaWhile {

	public static void main(String[] args) {
		int contador=0; //precisa dar um valor inicial
		
		//while devolve TRUE ou FALSES
		
		while(contador<=10) {
		/*
			//contador = contador +1 é a msm coisa que falar: contador += 1
			//contador += 1; herança como C
			//contador++; significa ele + ele mesmo. APARECE MAIS DESSE JEITO
			 contador++ ou ++contador;
		*/
			System.out.println(contador); //imprimir contador
			contador ++;
        }
        System.out.println(contador);
	}
}
