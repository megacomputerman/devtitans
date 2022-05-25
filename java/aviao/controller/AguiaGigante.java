package aviao.controller;

public class AguiaGigante implements Motorizavel {

    private float peso;
    private String nome;
    private float forca;
    private boolean acordada;
    
    public AguiaGigante(float peso, String nome, float forca)
    {
        setPeso(peso);
        setNome(nome);
        setForca(forca);
        setAcordada(true);
    }
    
    public float getPeso()
    {
        return this.peso;
    }
    private void setPeso(float peso)
    {
        this.peso = peso;
    }
    private void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public float getForca()
    {
        return this.forca;
    }
    private void setForca(float forca)
    {
        this.forca = forca;
    }
    public boolean getAcordada()
    {
        return this.acordada;
    }
    private void setAcordada(boolean acordada)
    {
        this.acordada = acordada;
    }

    public boolean getAtivo()
    {
        return getAcordada();
    }
    public float getPotencia()
    {
        float result = 0.0f;
        if(getAcordada())
        {
            result = getForca();
        }
        return 50.0f;
    }
    public void ligar()
    {
        setAcordada(true);
        System.out.println("...ainnn painnn par...");
    }
    public void desligar()
    {
        setAcordada(false);
        System.out.println("mimindo...");
    }
}