
package herencia;

import ico.fes.tarea.Gato;
import ico.fes.tarea.Perro;
import java.awt.Color;


public class HERENCIA {

  
     
    public static void main(String[] args) {
        
        Perro Perro1= new Perro("Alaska", 6,"Macho",4, Color.gray,3,"guau");
        System.out.println(
                "Datos"+"\n"+
                "Raza\t"+Perro1.getRaza()+"\n"+
                "Peso\t"+Perro1.getPeso()+"\n"+
                "Sexo\t"+Perro1.getSexo()+"\n"+
                "numeroDeParas\t"+Perro1.getNumeroDePatas()+"\n"+
                "Color\t"+Perro1.getColor()+"\n"+
                "Edad\t"+Perro1.getEdad()+"\n"+
                "Sonido\t"+Perro1.getSonido());
        
        
        Gato Gato1=new Gato("Manchitas",4,"Hembra",4, Color.yellow,2,"Miau");
        System.out.println(
                "Datos"+"\n"+
                        "Raza\t"+Gato1.getRaza()+"\n"+
                        "Peso\t"+Gato1.getPeso()+"\n"+
                        "Sexo\t"+Gato1.getSexo()+"\n"+
                        "numeroDePatas\t"+Gato1.getNumeroDePatas()+"\n"+
                        "Color\t"+Gato1.getColor()+"\n"+
                        "Edad\t"+Gato1.getEdad()+"\n"+
                        "Sonido\t"+Gato1.getSonido());
      
    }
    
}
