package aviao.controller;
import java.util.Observer;
import java.util.Observable;

public class TorreDeControle implements Observer{
    
    private String id;
    
    public TorreDeControle(String id)
    {
        setId(id);
    }
    
    public String getId()
    {
        return this.id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    
    public void update(Observable obj, Object atualizaoStatus){
        String notification = (String) atualizaoStatus;
        System.out.println("Torre: " + getId() + " " + notification );
    }

}