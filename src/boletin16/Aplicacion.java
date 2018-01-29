
package boletin16;

import datos.Persoal;


public class Aplicacion {


    public static void main(String[] args) {
        
        Persoal per1 = new Persoal("665431275","sara@gmail.com");
        Notas not = new Notas();
        not.calcularNota();
        Academica aca1 = new Academica("Sara",not,per1);
        
        System.out.println(aca1.toString());
  
    }
    
}
