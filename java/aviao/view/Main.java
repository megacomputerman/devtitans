package aviao.view;

import aviao.controller.Aviao;

public class Main { 
    public static void main(String[] args) {
      // System.out.println("Hello World !!");
     
      // Etapa 1	   
      Aviao aviao = new Aviao(); 
      aviao.imprimirOk();

      // Etapa 2
      //System.out.println("Modelo: " + aviao.getModelo() + " Identificador: " + aviao.getIdentificador());
      addAviao(aviao, "wall", "goku", true, 1000);
      printAviao(aviao);

    }

   public static void printAviao( Aviao aviao ){
       System.out.println("Modelo: " + aviao.getModelo());
       System.out.println("Identificador: " + aviao.getIdentificador());
       System.out.println("Motor: " + aviao.getMotor());
       System.out.println("Altura: " + aviao.getAltura());
   }

   public static void addAviao( Aviao aviao, String modelo, String id, boolean motor, float altura ){
   	aviao.setModelo(modelo);
        aviao.setIdentificador(id);
        aviao.setMotor(motor);
        aviao.setAltura(altura);
   }

}

