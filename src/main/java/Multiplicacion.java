import javax.swing.*;

public class Multiplicacion {
    double resultado;
    String num1 = JOptionPane.showInputDialog("Ingrese el primer número a multiplicar");
    String num2 = JOptionPane.showInputDialog("Ingrese el segundo número a multiplicar");
    double numero1 = Integer.parseInt(num1);
    double numero2 = Integer.parseInt(num2);
    public double multiplicar(double _numero1, double _numero2){
        _numero1 = this.numero1;
        _numero2 = this.numero2;
        resultado = _numero1*_numero2;
        JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
        return resultado;
    }
}
