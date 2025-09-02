public class Ride {
    static final int speedlimit = 80;
    public int initial_speed ;
    public int acceleration;

    public Ride(int initial_speed,int acceleration){
        this.initial_speed = initial_speed;
        this.acceleration = acceleration;
    }

    public double gethighestacclerationtime(){
        return (double) speedlimit-initial_speed/acceleration;
    }

    public double calculatefine(int hour){
        return 0;
    }

}

class bike extends Ride{
    public bike () {
        super(20,2);
    }
    public double calculatefine(int hour){
        return 50+50*hour;
    }
}

class car extends Ride{
    public car (){
        super(40,10);
    }
    public double calculatefine(int hour){
        return 100+150*hour;
    }
}

class microbus extends Ride{
    public microbus (){
        super(15,5);
    }
    public double calculatefine(int hour){
        return 3000;
    }
}
