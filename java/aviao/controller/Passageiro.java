package aviao.controller;

public class Passageiro{

    private String primeiroNome;
    private String ultimoNome;
    private String cpf;
    
    public Passageiro(String primeiroNome, String ultimoNome, String cpf){
        setPrimeiroNome(primeiroNome);
        setUltimoNome(ultimoNome);
        setCpf(cpf);
    }
    public Passageiro(String cpf){
        setCpf(cpf);
    }
    
    public void setPrimeiroNome( String primeiroNome )
    {
        this.primeiroNome = primeiroNome;
    }
    public String getPrimeiroNome()
    {
        return this.primeiroNome;
    }
    
    public void setUltimoNome( String ultimoNome )
    {
        this.ultimoNome = ultimoNome;
    }
    public String getUltimoNome()
    {
        return this.ultimoNome;
    }
    
    public void setCpf( String cpf )
    {
        this.cpf = cpf;
    }
    public String getCpf()
    {
        return this.cpf;
    }
}