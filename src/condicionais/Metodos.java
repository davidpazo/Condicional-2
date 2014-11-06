package condicionais;

import javax.swing.JOptionPane;

public class Metodos {
    private double num1;
    private double num2;
    
    public Metodos(double n1,double n2){
        num1=n1;
        this.num2=n2;
               
    }
    public Metodos(){
    }
    public double pedirDato(){
        String resposta= JOptionPane.showInputDialog("Introduce dato");
        double valor= Double.parseDouble(resposta);
        return valor;
    }
    public void condicionDoble(){
        if(num1>num2)
            System.out.println(num1+ "e maior");
        else if(num1<num2)
            System.out.println(num2+ "e maior");
    }
    public void condicionDoble(double n1,double n2){
        if(n1>n2)
            JOptionPane.showMessageDialog(null, "o maior e "+n1);
        else if(n1<n2)
            JOptionPane.showMessageDialog(null, "o maior e "+n2);
    }
}
