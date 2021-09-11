import junit.framework.TestCase;

public class Test extends TestCase {
    private Multiplicacion m;
    private Suma s;
    private Resta r;
    private Division d;

    public void prueba1() { s = new Suma(); }
    public void prueba2(){
        r = new Resta();
    }
    public void prueba3(){
        m = new Multiplicacion();
    }
    public void prueba4(){
        d = new Division();
    }

    public void testSuma(){
        prueba1();
        assertTrue(s.sumar(s.numero1,s.numero2)==(s.resultado));
    }
    public void testResta(){

        prueba2();
        assertTrue(r.restar(r.numero1,r.numero2)==(r.resultado));
    }
    public void testMultiplicacion(){
        prueba3();
        assertTrue(m.multiplicar(m.numero1, m.numero2)==(m.resultado));
    }
    public void testDivision(){
        prueba4();
        assertTrue(d.dividir(d.numero1,d.numero2)==(d.resultado));
    }
}
