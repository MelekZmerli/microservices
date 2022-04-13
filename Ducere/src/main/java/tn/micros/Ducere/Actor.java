package tn.micros.Ducere;

public class Actor {
    public Integer actorId;
    public String actorName;
    public String actorNationality;

    Actor(){}

    Actor(Integer id,String name,String nat){
        this.actorId = id;
        this.actorName = name;
        this.actorNationality = nat;

    }
}
