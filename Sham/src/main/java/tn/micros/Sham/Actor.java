package tn.micros.Sham;

public class Actor {
    public Integer actorId;
    public String actorName;
    public String actorNationality;

    Actor(){}
    Actor(int id,String name,String nat){
        this.actorId = id;
        this.actorName = name;
        this.actorNationality = nat;
    }
}
