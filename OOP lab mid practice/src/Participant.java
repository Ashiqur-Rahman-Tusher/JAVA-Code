/*Design a system for managing the Bangladesh cricket team, focusing on three types of participants:
Players, Coaches, and Selectors. Each type has shared information but distinct responsibilities and
roles.
        System Description
1. Common Information for All Participants
 name (string)
 role (string)
2. Specific Roles and Responsibilities
 Players:
o Score runs (scoreRun(runs))
o Take wickets (takeWicket(wickets))
         Coaches:
o Conduct practice sessions (conductPractice(sessionType))
o Provide feedback to players (giveFeedback(playerName, feedback))
         Selectors:
o Add players to the team (addPlayer(playerName))
o Drop players from the team (dropPlayer(playerName))

        3. Key Behaviors
Each participant type should have a method named showPerformance() that behaves differently
for each type:
         Players: Display runs scored and wickets taken.
         Coaches: Display conducted sessions and given feedback.
         Selectors: Display the list of added and dropped players.

Questions
1. Design the Classes
 Create a base class Participant with shared attributes (name and role).
         Create three subclasses: Player, Coach, and Selector.
         Include methods for the specific responsibilities of each type.

        2. Use Polymorphism
 Implement a method with a different name in each subclass to showcase their specific performances
        (e.g., showPerformance()).
         Write a program that creates a list of Participant objects containing instances of Player,
Coach, and Selector.
        3. Apply Encapsulation
 Make sensitive data (e.g., feedback for players, player performance stats) private and use methods
to securely update or retrieve the data.
4. Test the System
 Create instances of Player, Coach, and Selector.
 Demonstrate how each participant performs their tasks and shows their performance.*/



public class Participant {
    public String name;
    public String role;
   public Participant(){
        this.name=name;
        this.role=role;
    }
    void showperformance(){

    }
    public static void main(String[]args){
        player p = new player("Shakib", "All- rounder");
        p.scoreruns(84);
        p.takewickets(3);
        p.showperformance();
        coach c = new coach("Haturisingah","head coach");
        c.conductpractice("not seasion");
        c.givefeedback("sakib","very good");
        c.showperformance();
        selector s = new selector("Minhajul","Cheif selector");
        s.addplayer("tamim");
        s.dropplayer("liton das");
        s.showperformance();
    }
}
class player extends Participant{
    public int runs;
    public int wickets;
    player(String name , String role){
        super.name = name;
        super.role = role;
    }
    public int scoreruns(int runs){
      return this.runs=runs;
    }
    public int takewickets(int wickets){
        return this.wickets=wickets;
    }
    public void showperformance(){

        System.out.println(name+" scored "+runs+" runs and took "+wickets+" wickets");
    }
}
class coach extends Participant{
    private String sesiontype;
    private String feedback;
    private String feedbackfor;
    public String getFeedbackfor(){
        return feedbackfor;
    }

    public void setFeedbackfor(String playername) {
        this.feedbackfor = playername;
    }

    public String getSesiontype(){
        return sesiontype;
    }
    public void setSesiontype(String sesiontype){
        this.sesiontype = sesiontype;
    }
    public String getFeedback(){
        return feedback;
    }
    public void setFeedback(String feedback){
        this.feedback = feedback;
    }
    coach(String name , String role){
        super.name = name;
        super.role = role;
    }
    public void conductpractice(String sesiontype){
        setSesiontype(sesiontype);
    }
    public void givefeedback(String playername ,String feedback){
        setFeedbackfor(playername);
        setFeedback(feedback);
    }
    public void showperformance(){
        System.out.println("coach "+name+" conducted practice : "+getSesiontype()+" ");
        System.out.println("coach "+name+" give feedback to "+getFeedbackfor()+" : "+getFeedback()+".");
    }
}
class selector extends Participant{
    private String addedplayer;
    private String dropedplayer;

    //public String playername;
    selector(String name , String role){
        super.name = name;
        super.role = role;
    }
    public void addplayer(String t){
         this.addedplayer = t;
    }
    public void dropplayer(String s){
       this.dropedplayer = s;
    }
    public void showperformance(){
        System.out.println("selector "+name+" added "+addedplayer+" ");
        System.out.println("selector "+name+" droped "+dropedplayer+" ");
    }

}

