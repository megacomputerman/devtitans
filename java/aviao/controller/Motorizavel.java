//Etapa 4 - Testando novos motores!!
package aviao.controller;

public abstract class Motorizavel {
    
    private String modelo;
    private float potencia;
    private boolean ativo;
    
    public Motorizavel(String modelo, float potencia )
    {
        setModelo(modelo);
        setPotencia(potencia);
        setAtivo(false);
    }
        public String getModelo()
    {
        return this.modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public float getPotencia()
    {
        return this.potencia;
    }
    public void setPotencia(float potencia)
    {
        this.potencia = potencia;
    }
    
    public boolean getAtivo()
    {
        return this.ativo;
    }
    public void setAtivo(boolean ativo)
    {
        this.ativo = ativo;
    }
    
    public void ligar()
    {
        setAtivo(true);
        System.out.println("......VRUMMMM!!");
    }
    
    public void desligar()
    {
        setAtivo(false);
        System.out.println("mmmmm……..");
    }
}
