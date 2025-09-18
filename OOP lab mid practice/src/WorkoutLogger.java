public class WorkoutLogger {
    public static void main(String[]args){
       Workout[] w =new Workout[5];
       w[0] = new cardio("tusher",20,126);
       w[1] = new Strenthtranning("bob",15,4);
       w[2] = new yoga("luna",30,true);
       w[3] = new Strenthtranning("rahi",18,3);
       w[4] = new cardio("lavlu",10,120);


       for (int i = 0; i < w.length; i++) {
            w[i].calculateCalories();
        }

       for(int i=0;i< w.length;i++){
           System.out.printf("%s\n,%s\n,%d\n,%.2f\n",
           w[i].getUsernsme(),
           w[i].type(),
           w[i].getDurationminutes(),
           w[i].getCaloriesburned()
           );
       }

    }
}
