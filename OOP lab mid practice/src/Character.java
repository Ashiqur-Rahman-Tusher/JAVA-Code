public class Character {
    public String name;
    public int level;
    public Character(String name,int level){
        this.name = name;
        this.level= level;
    }
    public static void main(String[]args){
        knight k = new knight("Marco",85);
        k.attack();
        dragon d = new dragon("Dracaryes",90);
        d.breathfire();
    }
}
class knight extends Character{
    public knight(String name,int level){
        super(name,level);
    }
    public void attack(){
        System.out.println("Knight "+name+" attack with sowrd !!!");
    }
}
class dragon extends Character{
    public dragon(String name,int level){
        super(name, level);
    }
    public void breathfire(){
        System.out.println("Dragon "+name+" breath fire!!!");
    }
}
