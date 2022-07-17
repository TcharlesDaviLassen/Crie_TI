package aula1;

import modelos.Aluno;


public class ExerciciosAluno {
    
    //public => Modificador de acesso
    //permite que o método fique visivel para outras classes
	
    //private => Permite que apenas a propria classe utilize o m�todo.
	
    //protected => ?
	
    //static => permite que o m�todo seja invocado sem necessidade de criar uma
    //nova instancia.
	
    //void => o metodo em quest�o n�o tem retorno.
    public static void main(String[] args){
        
//        int ano = 2022; //variavel primitiva
        
        Aluno objAluno1 = new Aluno();
        objAluno1.setNome("Jonas");
        objAluno1.setIdade(32);
        objAluno1.setAltura(1.90);
        objAluno1.setSexo('M');
        
        Aluno objAluno2 = new Aluno();
        objAluno2.setNome("Jonas");
        objAluno2.setIdade(32);
        objAluno2.setAltura(1.90);
        objAluno2.setSexo('M');
        
        if(objAluno1 == objAluno2){
            System.out.println("Os alunos são iguais!!!");
        }else{
            System.out.println("Os alunos não são iguais!!!");
        }
        
        //o método imprimir deve mostrar o nome e a idade do aluno juntos
        /*objAluno1.imprimir();
        objAluno2.imprimir();
        
        objAluno2.fazAniversario();
        objAluno2.imprimir();
        */
        
        
    }
    
    
}