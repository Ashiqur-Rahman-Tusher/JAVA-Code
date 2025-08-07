import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args)
    {
        calc c1 = new calc();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc .nextInt();
        System.out.println("Enter 1 for addition\n"+"Enter 2 for subtruction\n"
                +"Enter 3 for multipication\n"+"Enter 4 for quetion");
        int options = sc.nextInt();
        if (options==1){
            c1.add(x,y);
        }
        else if (options==2) {
            c1.sub(x,y);
        }
        else if (options==3) {
            c1.multi(x,y);
        }
        else if (options==4) {
            c1.quation(x,y);
        }
        else {
            System.out.println("Read instraction and input carefilly");
        }

    }
}

//in this code have calc class witch is other class!!!!

