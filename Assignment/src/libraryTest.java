public class libraryTest {
    public static void main(String[]args){

        Book[] mybooks = new Book[3];

        mybooks[0] = new FictoinBook("OOP","Tusher","Programming");
        mybooks[1] = new FictoinBook("DLD","Taohid","Logic Gate");
        mybooks[2] = new Nonfictionbook("Linier","Rahi","Math");

        System.out.println("----DisplayInfo----");

        for(int i=0;i< mybooks.length;i++){
            mybooks[i].displayinfo();
        }

        System.out.println("---Displayinfo Stastus----");

        for (int i=0;i< mybooks.length;i++){
            mybooks[i].displayinfo(true);
        }

        System.out.println("----borrow prossecing-----");

        Book chosen = mybooks[2];
        chosen.borrow();
        chosen.displayinfo(true);

        System.out.println("---return prossecing-----");

        chosen.returnbook();
        chosen.displayinfo(true);
    }
}
