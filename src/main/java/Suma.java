import javax.swing.*;

public class Suma {
    int resultado;
    String num1 = JOptionPane.showInputDialog("Ingrese el primer número a sumar");
    String num2 = JOptionPane.showInputDialog("Ingrese el segundo número a sumar");
    int numero1 = Integer.parseInt(num1);
    int numero2 = Integer.parseInt(num2);
    public int sumar(int _numero1, int _numero2) {
        _numero1 = this.numero1;
        _numero2 = this.numero2;
        resultado = _numero1 + _numero2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        return resultado;
    }
}
