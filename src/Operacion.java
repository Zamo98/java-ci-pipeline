import javax.swing.*;

public class Operacion {
    //String opcion1="";
    int resultado;

    public void escogerOpcion(){
        String opciones = JOptionPane.showInputDialog("Ingrese la opción que desea realizar " +
                "\n 1:Suma \n 2:Resta \n 3:Multiplicación \n 4:División");

        switch (opciones){
            case "1":
                Suma s = new Suma();
                s.sumar(0,0);
                break;
            case "2":
                Resta r = new Resta();
                r.restar(0,0);
                break;
            case "3":
                Multiplicacion m = new Multiplicacion();
                m.multiplicar(0,0);
                break;
            case "4":
                Division d = new Division();
                d.dividir(0,0);
                break;
        }
    }
}

