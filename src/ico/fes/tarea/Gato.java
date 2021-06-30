/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.tarea;

/**
 *
 * @author DELL
 */
public class Gato extends Animal {
    private String Raza;
    private int Peso;
    private String Sexo;

    public Gato() {
    }

    public Gato(String Raza, int Peso, String Sexo) {
        this.Raza = Raza;
        this.Peso = Peso;
        this.Sexo = Sexo;
    }

    public Gato(String Raza, int Peso, String Sexo, int numeroDePatas, java.awt.Color Color, int Edad, String sonido) {
        super(numeroDePatas, Color, Edad, sonido);
        this.Raza = Raza;
        this.Peso = Peso;
        this.Sexo = Sexo;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return "Gato{" + "Raza=" + Raza + ", Peso=" + Peso + ", Sexo=" + Sexo + '}';
    }
    
    
}
