import java.time.LocalDate;
public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;
    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int anio, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public void setDia(int dia) { this.dia = dia; }
    public void setMes(int mes) { this.mes = mes; }
    public void setAnio(int anio) { this.anio = anio; }
    public void setAltura(double altura) { this.altura = altura; }
    public void setPeso(double peso) { this.peso = peso; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getSexo() { return sexo; }
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }
    public double getAltura() { return altura; }
    public double getPeso() { return peso; }
    public int calcularEdad() {
        int anioActual = LocalDate.now().getYear();
        return anioActual - anio;
    }
    public int frecuenciaMaxima() {
        return 220 - calcularEdad();
    }
    public String frecuenciaEsperada() {
        double minimo = frecuenciaMaxima() * 0.50;
        double maximo = frecuenciaMaxima() * 0.85;
        return minimo + " - " + maximo;
    }
    public double calcularBMI() {
        double alturaMetros = altura / 100;
        return peso / (alturaMetros * alturaMetros);
    }
}
