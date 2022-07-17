package Trabalho;

public class ObjClientes {
	public static void main(String[] args) {

		Cliente[] vet = new Cliente[4];

		Cliente objcliente1 = new Cliente("Juca", "1.60", "80", "20", "22222", "37773");
		vet[0] = objcliente1;

		Cliente objcliente2 = new Cliente("ABA", "1.90", "50", "90", "13333", "35555");
		vet[1] = objcliente2;

		Cliente objcliente3 = new Cliente("Bala", "1.80", "70", "60", "444411", "33333");
		vet[2] = objcliente3;

		Cliente objcliente4 = new Cliente("Baba", "1.90", "90", "40", "666611", "4444");
		vet[3] = objcliente4;

		int repo = -1;

		do {

			repo = Entrada.leiaInt("Selecione um cliente  \n" + "Digite 0 pra sair");

			if (repo == 1) {
				System.out.println(objcliente1);
			} else if (repo == 2) {
				System.out.println(objcliente2);
			} else if (repo == 3) {
				System.out.println(objcliente3);
			} else if (repo == 4) {
				System.out.println(objcliente4);
			}

		} while (repo != 0);

	}
}
