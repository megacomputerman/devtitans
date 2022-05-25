//Etapa 4 - Testando novos motores!!
package aviao.controller;

public class MotorTurbinado extends Motor{
    public MotorTurbinado(String modelo, float potencia)
    {
        super(modelo, potencia);
    }
    
    public void ligar()
    {
        setAtivo(true);
        System.out.println("TRUMMMMMMM….");
    }
    public float getPotencia()
    {       
        float p1 = super.getPotencia() * 1.2f;
        float p2 = (float) Math.round(p1*100)/100;
        return p2;    
    }    
}