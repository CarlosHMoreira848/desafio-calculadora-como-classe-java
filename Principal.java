import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		boolean condicao = true;
		Scanner entrada = new Scanner(System.in);
		while (condicao) {
			char inicio = 'a';
			System.out.println("Bem vindo à Calculadora, por favor escolha uma das opções: \n"
					+ "------------------------------- \n"
					+ "| MENU - CALCULADORA           |\n"
					+ "| + - Somar                    |\n"
					+ "| - - Subtrair                 |\n"
					+ "| * - Multiplicar              |\n"
					+ "| / - Dividir                  |\n"
					+ "| p - Potencializar            |\n"
					+ "------------------------------- \n"
					+ "| 0 - Sair                     |\n"
					+ "------------------------------- ");
			inicio = entrada.next().charAt(0);
			if(inicio != '+' && inicio != '-' && inicio != '*' && inicio != '/' && inicio != 'p' && inicio != '0') {
				System.out.println("Parece que você não digitou uma opção válida... Tente novamente!");
			} else if(inicio == '0') {
				condicao = false;
				break;
			} else {
				System.out.println("Muito bem! Agora digite o primeiro número para calcular! ");
				double vl1 = entrada.nextDouble();
				System.out.println("Muito bem! Agora digite o segundo número para calcular! ");
				double vl2 = entrada.nextDouble();
				Calculadora calculadora = new Calculadora();
				System.out.println("O resultado do seu cálculo é: " + calculadora.calcular(vl1, vl2, inicio));
			}
		}
		System.out.println("Obrigado por usar nosso programa! Volte sempre!... :D");
	}	
}
	