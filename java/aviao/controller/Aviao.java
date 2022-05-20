package aviao.controller;

public class Aviao { 
    private String modelo;
    private String identificador;
    private boolean motor;
    private float altura;
    private float velocidade;
    private boolean emVoo;
    
    public Aviao(String modelo, String identificador){
        setModelo(modelo);
        setIdentificador(identificador);
        setMotor(false);
        setAltura(0.0f);
    }
   
    public void setModelo( String modelo ){
        this.modelo = modelo; 
    }

    public void setIdentificador( String identificador ){
        this.identificador = identificador; 
    }
    
    public void setMotor( boolean motor ){
        this.motor = motor; 
    }
    
    public void setAltura( float altura ){
        this.altura = altura; 
    }
    
   public String getModelo() {
        return modelo;
   }
   
   public String getIdentificador() {
        return identificador;
   }

   public boolean getMotor() {
        return motor;
   }

    public float getAltura(){
        return altura; 
    }
    
    public float getVelocidade(){
        return velocidade;
    }
    
    private void setVelocidade(float velocidade){
        this.velocidade = velocidade;
    }
    
    public boolean getEmVoo(){
        return emVoo;
    }
    
    private void setEmVoo(boolean emVoo){
        this.emVoo = emVoo;
    }
    
    public void ligarMotor()
    {
        setMotor(true);
        System.out.println("Vrrummmm");
    }
    
    public void desligarMotor()
    {
        setMotor(false);
    }
    
    public void imprimeEstadoMotor()
    {
        if ( getMotor() )
        {
            System.out.println("O motor está ligado");
        }
        else
        {
            System.out.println("O motor está desligado");
        }
    }
    
    public boolean getEstadoMotor()
    {
        return getMotor();
    }
    
    public void acelerar()
    {
        if ( getEstadoMotor() )
        {
            float incremental = getVelocidade() + 50.0f;
            setVelocidade(incremental);
            System.out.println("Aviao a " + getVelocidade() + " km/h");
        }
        else
        {
            System.out.println("ERRO: Motor desligado");
        }
        atualizarStatusVoo();
    }
    
    public void desacelerar()
    {
        float decremental = 0.0f;
        if ( getEstadoMotor() )
        {
            if ( getVelocidade() > 0.0f )
            {
                decremental = getVelocidade() - 50.0f;
                setVelocidade(decremental);
            }
            System.out.println("Aviao a " + getVelocidade() + " km/h");
        }
        else
        {
            System.out.println("ERRO: Motor desligado");
        }
        atualizarStatusVoo();
    }
    
    public void atualizarStatusVoo(){
        if( getEmVoo() && (getVelocidade() >= 200.0f) )
        {
            System.out.println("Estou voando...");
        }
        else if( getEmVoo() && (getVelocidade() < 200.0f) ){
            setEmVoo(false);
            System.out.println("Estou aterrisando...");
        }
        else if( (getEmVoo() == false) && (getVelocidade() < 200.0f))
        {
            System.out.println("Estou em solo...");
        }
        else if( (getEmVoo() == false) && (getVelocidade() >= 200.0f) ){
            setEmVoo(true);
            System.out.println("Estou decolando...");
        }
    }
    
    public void imprimirOk() {
        System.out.println("Ok");
    }
}

