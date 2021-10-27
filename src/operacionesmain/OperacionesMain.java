
package operacionesmain;
import javax.swing.JOptionPane;
import Logica.NewClass;
import AreaT.Triangulo;
public class OperacionesMain {

    public static void main(String[] args) {
        NewClass op = new NewClass();
        Triangulo of= new Triangulo();
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero2: "));
        
        JOptionPane.showMessageDialog(null, "La suma es: " + op.sumar(num1, num2)
                + "\nLa resta es: " + op.restar(num1, num2)
                + "\nLa multiplicacion es: " + op.multiplicar(num1, num2)
                + "\nLa division es: " + op.dividir(num1, num2)
                + "\n EL Área de un triangulo es: " + of.areat(num1, num2));
    }
}
