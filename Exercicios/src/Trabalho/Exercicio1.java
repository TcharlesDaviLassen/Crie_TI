package Trabalho;

public class Exercicio1 {

	public static void main(String[] args) {
//		**
//		 *
//		 * FUP que considere um parque de estacionamento que pratica os preços
//		 * seguintes:
//		 *
//		 * • primeira hora: R$ 2,00 • segunda hora: R$ 1,50 • a partir da segunda hora:
//		 * R$ 1,00 por hora.
//		 *
//		 * O tempo de permanência no parque é contabilizado em horas e minutos. Por
//		 * exemplo, se um veículo permanecer 2 horas e 30 minutos no parque, pagará R$ 2
//		 * (primeira hora) + R$ 1,50 (segunda hora) + R$ 0,50 (30 minutos a R$ 1/hora) =
//		 * R$ 4.
//		 *
//		 * Elabore um algoritmo que, lido o tempo que determinado veículo permaneceu
//		 * estacionada no parque (horas e minutos), diga a quantia que deve ser paga.
//		 */

		double primeira = 2;
		double segunda = 1.50;
		double terceira = 1;

//		double cont = 0;
//		double conta = 0;
//		double contb = 0;
		double varia = 0;

		double a = Entrada.leiaDouble("Digite a quantidade de horas ");
		

		if (a <= 0 && a < 1) {
//			cont++;
			System.out.println("O valor é de " + primeira);
			
		} else if (a >= 1 && a <= 2) {
//			contb++;
			System.out.println("O valor é de " + (segunda + primeira));
			
		} else if (a == 2.30) {
//			contb++;
			varia = (primeira + segunda);
			System.out.println("O valor é de " + (varia * terceira + 0.50));

		} else if (a >= 3) {
//			contb++;
			varia = (primeira + segunda);
			System.out.println("O valor é de " + ((varia - 0.50) + terceira + a));
		}

	}

}
