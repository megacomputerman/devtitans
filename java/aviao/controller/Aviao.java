package aviao.controller;

public class Aviao { 
    private String modelo;
    private String identificador;
    private boolean motor;
    private float altura;
    
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

    public void getAltura(){
        return altura; 
    }
    

   public void imprimirOk() {
       System.out.println("Ok");
   }
}

