
import java.util.Scanner;

public class CT_practice {
    /*no3
    public static void main(String[] args) {
        System.out.println("a   a^2   a^3");
        for (int a = 1; a <= 3; a++) {
            System.out.printf("%d   %d   %d%n", a, a * a, a * a * a);
        }
    }*/
    /*no4
    public static void main(String[]args){
        double x=9.5;
        double y=4.5;
        double z=2.5;
        int a=3;
        double b=45.5;
        double c=3.5;
        double result=(x*y-z*a)/(b-c);
        System.out.println(result);
    }*/
    //no 5
//    public static void main(String[] args){
//        double radius = 5.5;
//        double pi = 3.1416;
//        double perimeter = 2*pi*radius;
//        double area = pi*radius*radius;
//        System.out.println("perimeter = "+perimeter);
//        System.out.println("Area = "+area);
//    }
    //no 6;
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter radius");
//        double radius = sc.nextDouble();
//        System.out.println("Enter radius");
//        double pi = sc.nextDouble();
//        double perimeter = 2*pi*radius;
//        double area = pi*radius*radius;
//        System.out.println("perimeter = "+perimeter);
//        System.out.println("Area = "+area);
//    }
//    //no 7;
//    public static void main(String[] args) {
//        int km = 14;
//        //1 mile = 1.6km
//        double mile = km / 1.6;
//        double min = 45.5;
//        // 1 hour = 60 min
//        double hour = min / 60;
//        double a = mile / hour;
//        System.out.println("Avarage Speed in Mile Per Hour");
//        System.out.printf("%.2f", a);
//    }
    //no 8;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter distance in km ");
//        int km = sc.nextInt();
//        //1 mile = 1.6km
//        double mile = km / 1.6;
//        System.out.println("Enter time in min ");
//        int  min =sc.nextInt();
//        System.out.println("Enter time in sec ");
//        int sec = sc.nextInt();
//        // 1 hour = 60 min
//        double hour = (min*60+sec)/3600.0;
//        double a = mile / hour;
//        System.out.println("Avarage Speed in Mile Per Hour");
//        System.out.printf("%.2f", a);
//    }
    //no 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        boolean divisible = (num % 2 == 0) ^ (num % 3 == 0); // XOR
        System.out.println(divisible);
    }
//    //no 11;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any min ");
//        int a = sc.nextInt();
//        System.out.println("A : " +a);
//        int hour = a / 60;
//        int day = hour / 24;
//        int year = day / 365;
//        System.out.println("year : " + year);
//        System.out.println("day : " + day % 365);
//    }
}

