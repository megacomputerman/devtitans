package aviao.controller;

import java.util.*;
//import java.util.ArrayList;

public class Aviao { 
    private String modelo;
    private String identificador;
    private Motorizavel motorEsquerdo;
    private Motorizavel motorDireito;
    private float altura;
    private float velocidade;
    private boolean emVoo;
    private ArrayList<Passageiro> listaPassageiros;
    
    public Aviao(String modelo, String identificador, Motorizavel esquerdo, Motorizavel direito){
        setModelo(modelo);
        setIdentificador(identificador);
        setMotorEsquerdo(esquerdo);
        setMotorDireito(direito);
        setAltura(0.0f);
        
        //Inicializa a lista de passageiros
        createListaPassageiro();
        
    }
   
    private void createListaPassageiro()
    {
        this.listaPassageiros = new ArrayList<>();
    }
    public void setListaPassageiro(Passageiro passageiro){
        this.listaPassageiros.add(passageiro);
    }
    public ArrayList<Passageiro> getListPassageiro(){
        return this.listaPassageiros;
    }
    public void addPassageiro(Passageiro passageiro)
    {
        if((getEmVoo() == false) && (getVelocidade() == 0.0f) )
        {
            setListaPassageiro(passageiro);
        }
        else
        {
            System.out.println("A menos, que seja o super homem, Nossos Protocolos de segurança não permitem embarques com a aeronave em movimento");
        }
    }
    
    public Passageiro buscarPassageiroPorCPF(String cpf)
    {   
        Iterator<Passageiro> iterator = getListPassageiro().iterator();
        while (iterator.hasNext()) {
          Passageiro passageiroAtual = iterator.next();
          if ( cpf == passageiroAtual.getCpf() )
          {
              return passageiroAtual;
          }
          //System.out.println(passageiroAtual);
        }
        return null;
    }
    public void imprimirListaDePassageiros()
    {   
        Iterator<Passageiro> iterator = getListPassageiro().iterator();
        while (iterator.hasNext()) {
          Passageiro passageiroAtual = iterator.next();
          System.out.println(passageiroAtual.getPrimeiroNome() + " " + passageiroAtual.getUltimoNome() + " - " + passageiroAtual.getCpf() );
        }
    }
    public void desembarcarPassageiros()
    {
        if( (getEmVoo() == false) && (getVelocidade() == 0.0f) )
        {
            ArrayList<Passageiro> passageiros = getListPassageiro();
            Iterator<Passageiro> iterator = passageiros.iterator();
            while (iterator.hasNext()) {
              Passageiro passageiroAtual = iterator.next();
              iterator.remove();          
              System.out.println(passageiroAtual.getPrimeiroNome() + " " + passageiroAtual.getUltimoNome() + " desembarcou da aeronave!");
            }

        }
        else
        {
            System.out.println("A menos, que seja o super homem, ou paraquedista, Protocolos de segurança não permitem desembarques com a aeronave em movimento");
        }
        
    }
    public void setModelo( String modelo ){
        this.modelo = modelo; 
    }

    public void setIdentificador( String identificador ){
        this.identificador = identificador; 
    }
    
    private Motorizavel getMotorEsquerdo() {
        return this.motorEsquerdo;
    }
    
    private void setMotorEsquerdo( Motorizavel motorEsquerdo ){
        this.motorEsquerdo = motorEsquerdo; 
    }
    
    private Motorizavel getMotorDireito() {
        return this.motorDireito;
    }
    
    private void setMotorDireito( Motorizavel motorDireito ){
        this.motorDireito = motorDireito; 
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
        getMotorEsquerdo().desligar();
        getMotorDireito().desligar();
        /* outra forma:
        Motor esquerdo = getMotorEsquerdo();
        Motor direito = getMotorDireito();
        esquerdo.ligar();
        direito.ligar();
        */
    }
    
    public void desligarMotor()
    {
        getMotorEsquerdo().desligar();
        getMotorDireito().desligar();
    }
    
    public void imprimeEstadoMotor()
    {
        boolean[] bmotor = getEstadoMotor();

        // bmotor[0] -> motor esquerdo
        // bmotor[1] -> motor direito
        if ( bmotor[0] && bmotor[1] )
        {
            System.out.println("Os motores estao ligados");
        }
        else if ( (bmotor[0] == false) && (bmotor[1] == false) )
        {
            System.out.println("Os motores estao desligados");
        }
        else
        {
            if ( bmotor[0] ) {
                System.out.println("Somente o motor esquerdo esta ligado");
            }
            if ( bmotor[1] ) {
                System.out.println("Somente o motor direito esta ligado");
            }
            
        }
    }
    
    public boolean[] getEstadoMotor()
    {
        //boolean motores[]
        return new boolean[] {
            getMotorEsquerdo().getAtivo(), 
            getMotorDireito().getAtivo(),
        };
    }
    
    public void acelerar()
    {
        boolean[] bmotor = getEstadoMotor();
 
        if ( (bmotor[0] && bmotor[1]) || bmotor[0] || bmotor[1] )
        {
            float incremental = 0;
            
            if (bmotor[0] && bmotor[1])
            {
                incremental = getVelocidade() + getMotorEsquerdo().getPotencia() + getMotorDireito().getPotencia();
            }
            else if ( bmotor[0] )
            {
                incremental = getVelocidade() + getMotorEsquerdo().getPotencia();
            }
            // bmotor[1] ligado
            else
            {
                incremental = getVelocidade() + getMotorDireito().getPotencia();
            }    
            setVelocidade(incremental);
            System.out.println("Aviao a " + getVelocidade() + " km/h");
        }
        else
        {
            System.out.println("ERRO: Motores desligados");
        }
        atualizarStatusVoo();
    }
    
    public void desacelerar()
    {
        float decremental = 0.0f;
        boolean[] bmotor = getEstadoMotor();
        
        if ( (bmotor[0] && bmotor[1]) || bmotor[0] || bmotor[1] )
        {
            if ( getVelocidade() > 0.0f )
            {
                if (bmotor[0] && bmotor[1])
                {
                    decremental = getVelocidade() - (getMotorEsquerdo().getPotencia() + getMotorDireito().getPotencia());
                }
                else if ( bmotor[0] )
                {
                    decremental = getVelocidade() - getMotorEsquerdo().getPotencia();
                }
                // bmotor[1] ligado
                else
                {
                    decremental = getVelocidade() - getMotorDireito().getPotencia();
                }    
//                decremental = getVelocidade() - 50.0f;
                decremental = Math.abs(decremental);
                setVelocidade(decremental);
            }
            System.out.println("Aviao a " + getVelocidade() + " km/h");
        }
        else
        {
            System.out.println("ERRO: Motores desligados");
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
//        imprimeEstadoMotor();
    }
    
    public void imprimirOk() {
        System.out.println("Ok");
    }
}

