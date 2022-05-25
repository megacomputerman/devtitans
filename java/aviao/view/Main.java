package aviao.view;

import aviao.controller.*;

public class Main { 
    public static void main(String[] args) {
      // System.out.println("Hello World !!");
     
      //Lab2
      // Etapa 1	   
      //Motor motor1 = new Motor("eistein", 50.0f);
      //Motor motor2 = new Motor("tesla", 50.0f);
      Motor motor1 = new MotorTurbinado("eistein", 50.0f);
      Motor motor2 = new MotorTurbinado("tesla", 50.0f);
      //MotorTurbinado motor3 = new MotorTurbinado("teslak", 50.0f);
      
      //motor3.ligar();
      //motor3.getModelo();
      //motor2.getModelo();
      //motor2.ligar();
     
      //Lab2
      // Etapa 4
      Passageiro lula = new Passageiro("Lula", "ladronis", "13");
      Passageiro mito = new Passageiro("Bolso", "mitonis", "22");      
      Passageiro elon = new Passageiro("Elon", "miton", "50");      
      Passageiro wall = new Passageiro("wall", "cst", "51");      
      Passageiro tesla = new Passageiro("tesla", "miton", "52");      

      System.out.println("========================================================================" );
      System.out.println("Criando e instalando as aguias");
      System.out.println("========================================================================" );
      AguiaGigante phoenix = new AguiaGigante(1000.0f, "Phoenix", 200.0f ); 
      AguiaGigante galinha = new AguiaGigante(1000.0f, "GalinhaqVooa", 200.0f ); 

      //Lab1
      // Etapa 1	   
      Aviao aviao = new Aviao("Tesla", "infinit", motor1, motor2 ); 
      aviao.imprimirOk();
      
      aviao.setMotorEsquerdo(galinha);
      aviao.setMotorDireito(phoenix);
      

      //AddPassageiro(lula, aviao);
      //AddPassageiro(mito, aviao);
      aviao.addPassageiro(lula);
      aviao.addPassageiro(mito);
      aviao.addPassageiro(elon);
      aviao.addPassageiro(wall);
      aviao.addPassageiro(tesla);
      System.out.println("========================================================================" );
      System.out.println("Aviao parado e passagerios embarcados");
      System.out.println("========================================================================" );

      // Etapa 2
      //System.out.println("Modelo: " + aviao.getModelo() + " Identificador: " + aviao.getIdentificador());
      //addAviao(aviao, "wall", "goku", true, 1000);
      printAviao(aviao);
      
      System.out.println("========================================================================" );
      System.out.println("Testando motores");
      System.out.println("========================================================================" );
      //Etapa4 -> check motor
      aviao.ligarMotor();
      aviao.imprimeEstadoMotor();
      aviao.desligarMotor();
      aviao.imprimeEstadoMotor();
      aviao.ligarMotor();
      aviao.imprimeEstadoMotor();
      System.out.println("========================================================================" );
      System.out.println("Desligando motor esquerdo");
      System.out.println("========================================================================" );
      motor1.desligar();
      aviao.imprimeEstadoMotor();
      
      //Etapa5
      System.out.println("========================================================================" );
      System.out.println("Ligando os motores");
      aviao.ligarMotor();
      aviao.imprimeEstadoMotor();
      aviao.acelerar();
      aviao.acelerar();
      aviao.desligarMotor();
      aviao.acelerar();
      //System.out.println("potencia: " + motor2.getPotencia() );     
      aviao.ligarMotor();
      aviao.desacelerar();
      aviao.desacelerar();
      aviao.desacelerar();
      aviao.desligarMotor();
      aviao.desacelerar();
      
      //Etepa6
      aviao.ligarMotor();
      aviao.acelerar();
      aviao.acelerar();
      aviao.acelerar();
      aviao.acelerar();
      //lab 2 etapa 3
      System.out.println("========================================================================" );
      System.out.println("Imprimindo lista de passageiros");
      System.out.println("========================================================================" );
      aviao.imprimirListaDePassageiros();
      System.out.println("========================================================================" );
      aviao.acelerar();
      
      aviao.desacelerar();
      //lab 2 etapa 3
      System.out.println("========================================================================" );
      System.out.println("Tentar desembarcarPassageiros com aviao em movimento");
      System.out.println("========================================================================" );
      
      aviao.desembarcarPassageiros();
      aviao.desacelerar();
      aviao.desacelerar();
      aviao.desacelerar();
      aviao.desacelerar();
      aviao.desacelerar();
      
      //aviao.desembarcarPassageiros();
      //aviao.imprimirListaDePassageiros();
    }

   public static void printAviao( Aviao aviao ){
       System.out.println("Modelo: " + aviao.getModelo());
       System.out.println("Identificador: " + aviao.getIdentificador());
 //      System.out.println("Motor: " + aviao.getMotor());
       System.out.println("Altura: " + aviao.getAltura());
   }

   public static void addAviao( Aviao aviao, String modelo, String id, boolean motor, float altura ){
       aviao.setModelo(modelo);
       aviao.setIdentificador(id);
  //     aviao.setMotor(motor);
       aviao.setAltura(altura);
   }
   
   public static void AddPassageiro( Passageiro passageiro, Aviao aviao ){
       
       aviao.addPassageiro(passageiro);   
   }

}

