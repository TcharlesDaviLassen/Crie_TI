package aula4.ModelodeBancoDiferente;

import ferramentas.Entrada;
import modelos.ContaBanco;

public class TesteContas {
    
    public static void main(String[] args) {
        
        ContaBanco[] Contas = new ContaBanco[3];
        
        /*-- Conta 01 --------------------------------------------*/
        
        ContaBanco objConta1 = new ContaBanco();
        
        objConta1.setAgencia("01 Banrisul");
        objConta1.setConta("1");
        objConta1.setTitular("Pessoa 1");
        objConta1.setSaldo(1000.00);
        objConta1.setChequeEspecial(5000);
        
        Contas[0] = objConta1;
        
        /*-- Conta 02 --------------------------------------------*/
        
        ContaBanco objConta2 = new ContaBanco();
        
        objConta2.setAgencia("02 Inter");
        objConta2.setConta("2");
        objConta2.setTitular("Pessoa 2");
        objConta2.setSaldo(1000.00);
        objConta2.setChequeEspecial(3000);
        
        Contas[1] = objConta2;
        
        /*-- Conta 03 --------------------------------------------*/
        
        // ContaBanco objConta3 = new ContaBanco();
        
        // objConta3.setAgencia("03 Crefisa");
        // objConta3.setConta("3");
        // objConta3.setTitular("Pessoa 3");
        // objConta3.setSaldo(1000.00);
        // objConta3.setChequeEspecial(2000);
        
        // Contas[2] = objConta3;
        
        /*--------------------------------------------------------*/
        
        int resp = 0;
        int i = 0;
        int j = 0;
        
        do {
            
            do {
                
                resp = Entrada.leiaInt("--- [" + (i + 1) + "] ---" + Contas[i].toString()
                                + "\n\nO que você deseja fazer?\n"
                                + "[1] Trocar conta.\n"
                                + "[2] Sacar um valor.\n"
                                + "[3] Depositar um valor.\n"
                                + "[4] Transferir um valor.\n"
                                + "[5] Sair."
                                + "\n\n");
                
            } while (resp <= 0 || resp > 5);
            
            if (resp == 1) {
                
                do {
                    
                    i = Entrada.leiaInt("Qual conta você deseja usar?\n"
                            + "Contas disponíveis:\n--- [1] ---" + Contas[0].toString()
                                    + "\n--- [2] ---" + Contas[1].toString()
                                    + "\n--- [3] ---" + Contas[2].toString() + "\n\n") - 1;

                } while (i < 0 || i > (Contas.length - 1));
                    
            } else if (resp == 2) {
                
//                Contas[i].saque();
                
            } else if (resp == 3) {
                
//                Contas[i].deposito();
                
            } else if (resp == 4) {
                
                do {
                    
                    j = Entrada.leiaInt("Para qual conta você deseja transferir?\n"
                                    + "Contas disponíveis:\n--- [1] ---" + Contas[0].toString()
                                    + "\n--- [2] ---" + Contas[1].toString()
                                    + "\n--- [3] ---" + Contas[2].toString() + "\n\n") - 1;

                } while (j < 0 || j > Contas.length - 1 || j == i);
                
                double valor = Entrada.leiaDouble("--- [" + (i + 1) + "] ---" + Contas[i].toString()
                        + "\n--- [" + (j + 1) + "] ---" + Contas[j].toString()
                        + "\n\nValor a ser transferido:");
                
                Contas[i].transferir(Contas[j], valor);
                
            }
            
        } while (resp != 5);
        
        System.exit(0);
        
    }
    
}