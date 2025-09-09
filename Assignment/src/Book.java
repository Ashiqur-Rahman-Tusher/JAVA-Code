public class Book {

    private String title;
    private String author;
    private boolean isBorrowed;
    private static final int max_books = 100;

    public Book(String title,String author){
        this.isBorrowed = false;
        this.author = author;
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public boolean getisBorrowed(){
        return isBorrowed;
    }
    public static final int getMax_books(){
        return max_books;
    }

    public void displayinfo(){
        System.out.println("Title : "+title+"\n Author : "+author);
    }

    public void displayinfo(boolean showStatus){
        displayinfo();
        if(showStatus){
            if(isBorrowed){
                System.out.println("Borrowed Status : yes ");
            }
            else{
                System.out.println("Borrowed Status : no ");
            }
        }
    }

    public void borrow(){
        if(!isBorrowed){
            System.out.println("you can borrow the book");
            isBorrowed = true;
        }
        else {
            System.out.println("You can not borrow the book");
        }
    }

    public void returnbook(){
        if(isBorrowed){
            System.out.println("Returned the book");
            isBorrowed = false;
        }
        else {
            System.out.println("Book is not borrowed");
        }
    }

}

class FictoinBook extends Book{
    private String genre;

    public FictoinBook(String title,String author,String genre){
        super(title, author);
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void displayinfo(){
        super.displayinfo();
        System.out.println("Genre : "+genre);
    }
}

class Nonfictionbook extends Book{
    private String subject;

    public Nonfictionbook(String title,String author,String subject){
        super(title, author);
        this.subject = subject;
    }

    public void displayinfo(boolean showstatus){
        //super.displayinfo();
        System.out.println("Subject : "+subject);
        super.displayinfo(showstatus);


    }
}