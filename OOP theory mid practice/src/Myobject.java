public class Myobject {
    private double r;
    public double findvolume(){
        return 1.0;
    }
    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r = r ;
    }
    public static void main(String[]args){
        Myobject sphere1 = new sphere();
        sphere1.setR(2.5);
        System.out.println("Sphere volume: " + sphere1.findvolume());
    }
}
class sphere extends Myobject{
    @Override
    public double findvolume() {

        double v = 4/3*3.1416*getR()*getR()*getR();
        return v;
    }
}
class cylinder extends Myobject{
    private double h;

    public double getH(){
        return  h;
    }
    public void setH(double h){
        this.h = h;
    }

    @Override
    public double findvolume() {
        double v = 3.1416*Math.pow(getR(),2)*getH();
        return  v;

    }
}
class cone extends cylinder{
    @Override
    public double findvolume() {

        double v = 1/3*3.1416*Math.pow(getR(),2)*getH();
        return v;
    }
}

