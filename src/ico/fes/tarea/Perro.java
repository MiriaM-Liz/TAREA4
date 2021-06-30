package ico.fes.tarea;

/**
 *
 * @author DELL
 */
public class Perro extends Animal {
    private String Raza;
    private int Peso;
    private String Sexo;

    public Perro() {
    }

    public Perro(String Raza, int Peso, String Sexo) {
        this.Raza = Raza;
        this.Peso = Peso;
        this.Sexo = Sexo;
    }

    public Perro(String Raza, int Peso, String Sexo, int numeroDePatas, java.awt.Color Color, int Edad, String sonido) {
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
        return "Perro{" + "Raza=" + Raza + ", Peso=" + Peso + ", Sexo=" + Sexo + '}';
    }
    
    
}

