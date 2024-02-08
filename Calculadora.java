
public class Calculadora {
	
	public Calculadora() {
		super();
	}

	public static double calcular(double vl1, double vl2, char a) {
		double retorno = 0;
		switch(a) {
		case '+':
			retorno = somar(vl1, vl2);
			break;
		case '-':
			retorno = subtrair(vl1, vl2);
			break;
		case '*':
			retorno = multiplicar(vl1, vl2);
			break;
		case '/':
			retorno = dividir(vl1, vl2);
			break;
		case 'p':
			retorno = potencializar(vl1, vl2);
			break;
		}
		return retorno;
	}
	private static double somar(double vl1, double vl2) {
		double resultado = vl1 + vl2;
		return resultado;
	}
	private static double subtrair(double vl1, double vl2) {
		double resultado = vl1 - vl2;
		return resultado;
	}
	private static double multiplicar(double vl1, double vl2) {
		double resultado = vl1 * vl2;
		return resultado;
	}
	private static double dividir(double vl1, double vl2) {
		double resultado = vl1 / vl2;
		return resultado;
	}
	private static double potencializar(double vl1, double vl2) {
		double resultado = (int) Math.pow(vl1, vl2);
		return resultado;
	}
}
