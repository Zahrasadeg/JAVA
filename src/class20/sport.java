package class20;

public class sport {
    String name,country;
    sport(String name,String country){
        this.name=name;
        this.country=country;
    }
    public void display(){
        System.out.println(name+" is play in "+country);
    }
}
class cricket extends sport{
    String helment;
    cricket(String name,String country,String helment){
        super(name, country);//makes a call to the immmediate super class constructor
        //it should be at first line
        this.helment=helment;
    }
}
class soccer extends sport{
    String team;
    int numplayer;
    soccer(String name,String country,String team,int numplayer){
        super(name,country);
        this.team=team;
        this.numplayer=numplayer;
    }
    void displayteam(){
        System.out.println(team+" consist of "+numplayer+" players");
    }
}