package aviao.controller;

public class Motor implements Motorizavel{
    
    private String modelo;
    private float potencia;
    private boolean ativo;
    
    public Motor(String modelo, float potencia)
    {
        setModelo(modelo);
        setPotencia(potencia);
        setAtivo(false);
    }
    
    public boolean getAtivo()
    {
        return this.ativo;
    }
    public float getPotencia()
    {
        return this.potencia;
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
    
    public String getModelo()
    {
        return this.modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public void setPotencia(float potencia)
    {
        this.potencia = potencia;
    }
    
    protected void setAtivo(boolean ativo)
    {
        this.ativo = ativo;
    }
    

}