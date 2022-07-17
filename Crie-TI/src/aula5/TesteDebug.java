package aula5;

public class TesteDebug {

	public static void main(String[] args) {

		int valor1;
//		String letr = "Shelby";
//		String nome = "SHELBY";
		
		try {

			valor1 = 123;

			if (Integer.parseInt("JONAS") == valor1)
			/*if(letr.equalsIgnoreCase(nome))*/{
				System.out.println("IGUAIS");
			} else {
				System.out.println("NOPS");
			}

//			String nome = "Jonas";

		} catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
	}

}
