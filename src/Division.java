import javax.swing.*;

public class Division {
    double resultado;
    String num1 = JOptionPane.showInputDialog("Ingrese el número del numerador");
    String num2 = JOptionPane.showInputDialog("Ingrese el número del denominador");
    double numero1 = Integer.parseInt(num1);
    double numero2 = Integer.parseInt(num2);
    public double dividir(double _numero1, double _numero2){
        _numero1 = this.numero1;
        _numero2 = this.numero2;
        if(numero2 == 0){
            JOptionPane.showMessageDialog(null,"El denominador no puede ser 0");
        }else {
            resultado = numero1/numero2;
            JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
        }
        return resultado;
    }
}
