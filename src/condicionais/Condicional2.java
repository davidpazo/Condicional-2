package condicionais;

public class Condicional2 {

    public static void main(String[] args) {
    
        double num1, num2;
        Metodos obxecto=new Metodos();
        num1 = obxecto.pedirDato();
        num2 = obxecto.pedirDato();
        obxecto.condicionDoble(num1, num2);
    }
    
}