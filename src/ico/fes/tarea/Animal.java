package ico.fes.tarea;

import java.awt.Color;

/**
 *
 * @author DELL
 */
public class Animal {
    private int numeroDePatas;
    private Color Color;
    private int Edad;
    private String sonido;

    public Animal() {
    }

    public Animal(int numeroDePatas, Color Color, int Edad, String sonido) {
        this.numeroDePatas = numeroDePatas;
        this.Color = Color;
        this.Edad = Edad;
        this.sonido = sonido;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroDePatas=" + numeroDePatas + ", Color=" + Color + ", Edad=" + Edad + ", sonido=" + sonido + '}';
    }
    
    
}

