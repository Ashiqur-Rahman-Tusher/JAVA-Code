public class Workout {
    private String usernsme;
    private int durationminutes;
    private double caloriesburned;

    public String getUsernsme(){
        return usernsme;
    }

    public void setUsernsme(String usernsme) {
        this.usernsme = usernsme;
    }

    public int getDurationminutes() {
        return durationminutes;
    }

    public void setDurationminutes(int durationminutes) {
        this.durationminutes = durationminutes;
    }

    public double getCaloriesburned() {
        return caloriesburned;
    }

    public void setCaloriesburned(double caloriesburned) {
        this.caloriesburned = caloriesburned;
    }

    public  Workout(){
        this.usernsme = "unknown";
        this.durationminutes = 0;
        this.caloriesburned = 0.0;

    }
    public Workout(String name,int min ){
        this.usernsme = name;
        this.durationminutes = min;

    }
    public void calculateCalories(){
        System.out.println("Calories = "+durationminutes*5);
    }
    public String type(){
        return "general";
    }
}

class cardio extends Workout{
    public int heartrate;
    public cardio(String name,int min ,int heartrate){
     super(name, min);
     this.heartrate = heartrate;
    }
    public void calculateCalories(){
        System.out.println("Calories = "+getDurationminutes()*(heartrate/100)*8);
    }
    public String type(){
        return "cardio";
    }
}

class Strenthtranning extends Workout{
    public int sets;
    public Strenthtranning(String name,int min ,int sets){
        super(name, min);
        this.sets = sets;
    }


    public void calculateCalories(int sets) {
        System.out.println("Calories = " + getDurationminutes()*6+sets+10);

    }

    @Override
    public void calculateCalories() {
      calculateCalories(3);
    }

    @Override
    public String type() {
        return "strenthtranning";
    }
}

class yoga extends Workout{
    public boolean ispoweryoga;
    public yoga(String name,int min ,boolean ispoweryoga){
     super(name, min);
     this.ispoweryoga = ispoweryoga;
    }
    @Override
    public void calculateCalories() {
        if(ispoweryoga == true ){
            System.out.println("Calories = "+ getDurationminutes()*4.5);
        }
        else {
            System.out.println("Calories = "+ getDurationminutes()*3);
        }
    }

    @Override
    public String type() {
        return "Yoga";
    }
}
