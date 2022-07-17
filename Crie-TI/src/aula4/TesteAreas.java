package aula4;


public class TesteAreas {
    
    public static void main(String[] args) {
    
        //calcular a Ã¡rea de um retÃ¢ngulo
        AreaRetangulo objRet = new AreaRetangulo();
        objRet.setBase(5.2);
        objRet.setAltura(10.0);
        System.out.println("Ã�rea ret = " + objRet.calcularArea());
        
        //calcular a Ã¡rea de um retÃ¢ngulo
        AreaTriangulo objTriangulo = new AreaTriangulo();
        objTriangulo.setBase(5.9);
        objTriangulo.setAltura(12);
        System.out.println("Ã�rea tri = " + objTriangulo.calcularArea());
        
    }
    
    
}
