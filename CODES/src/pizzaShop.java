public class pizzaShop {
    private int pizza_price=320;
    private int drink_price=40;
    private int fries_price=100;

    static {
        System.out.println("Welcome to the pizza Shop");
    }
    public pizzaShop(){

    }
    public pizzaShop(int p,int d,int f) {
        this.pizza_price = p;
        this.drink_price = d;
        this.fries_price = f;
    }

        public int getPizza_price () {
            return pizza_price;
        }
        public void setPizza_price ( int p){
            this.pizza_price = p;
        }
        public int getDrink_price () {
            return drink_price;
        }
        public void setDrink_price ( int d){
            this.drink_price = d;
        }
        public int getFries_price () {
            return fries_price;
        }
        public void setFries_price ( int f){
            this.fries_price = f;
        }


    public void order(int p,int d){
        System.out.println("You Ordered "+p+" Pizzas ,"+d+" Drinks");
        int total=(p*320)+(d*40);
        System.out.println("Total_Bill : "+total);
    }
    public void order(int p,int d,int f) {
        System.out.println("You Ordered " + p + " Pizzas," + d + " Drinks," + f + " Fries");
        int total = (p * 320) + (d * 40) + (f * 100);
        System.out.println("Total_Bill : " + total);
    }
    public void order(int p) {
        System.out.println("You Ordered " + p + " pizzas");
        int total = (p * 320);
        System.out.println("Total_Bill : " + total);
    }

    public static void main(String[]args){
        pizzaShop p =new pizzaShop();

        p.order(3,4);
        p.order(4,3,4);
        p.order(3);
    }

}

