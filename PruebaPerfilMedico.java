import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
public class PruebaPerfilMedico {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese apellido:");
        String apellido = br.readLine();
        System.out.println("Ingrese sexo:");
        String sexo = sc.nextLine();
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia de nacimiento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes de nacimiento:"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de nacimiento:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura en centimetros:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso en kilogramos:"));
        PerfilMedico persona = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);
        String resultado = "PERFIL MEDICO\n"
                + "Nombre: " + persona.getNombre() + "\n"
                + "Apellido: " + persona.getApellido() + "\n"
                + "Sexo: " + persona.getSexo() + "\n"
                + "Fecha de nacimiento: " + persona.getDia() + "/" + persona.getMes() + "/" + persona.getAnio() + "\n"
                + "Altura: " + persona.getAltura() + " cm\n"
                + "Peso: " + persona.getPeso() + " kg\n\n"
                + "Edad: " + persona.calcularEdad() + " años\n"
                + "BMI: " + persona.calcularBMI() + "\n"
                + "Frecuencia cardiaca maxima: " + persona.frecuenciaMaxima() + "\n"
                + "Frecuencia cardiaca esperada: " + persona.frecuenciaEsperada() + "\n\n"
                + "VALORES DE BMI\n"
                + "Bajo peso: menos de 18.5\n"
                + "Normal: entre 18.5 y 24.9\n"
                + "Sobrepeso: entre 25 y 29.9\n"
                + "Obeso: 30 o mas";
        JOptionPane.showMessageDialog(null, resultado);
        sc.close();
    }
}
