public class logarithim {
    int b;
    double x;
    public logarithim(int b,double x){
        this.b = b;
        this. x = x;
    }
    public logarithim (logarithim log1){
        this.b = log1.b;
        this.x  = log1.x;
    }
    public logarithim(){
        this.b = 0;
        this.x = 0.0;
    }
    public double myfunc(){
        return Math.log(x)/Math.log(b);
    }

    public static void main(String[]args){
        logarithim log1 = new logarithim(2, 9);
        logarithim log2 = new logarithim(log1);
        logarithim log3 = new logarithim();
        System.out.println(log1.b +" "+log1.x+" "+log1.myfunc());
        System.out.println(log2.b +" "+log2.x+" "+log2. myfunc());

    }
}
