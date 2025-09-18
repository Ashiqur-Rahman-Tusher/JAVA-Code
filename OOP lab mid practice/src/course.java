import java.security.PublicKey;

public class course {
    public String coursename;
    public int duration;
    public course(String coursename,int duration){
        this.coursename = coursename;
        this.duration = duration;
    }
    public void courseinfo(){
        System.out.println(coursename);
        System.out.println(duration);
    }

    public static void main(String[]args){
        programmingCourse p = new programmingCourse("OOP",80,"JAVA");
        p.courseinfo();
        mathCourse m = new mathCourse("LINIER ALGEBRA",80,"Intermediate");
        m.courseinfo();
    }
}
class programmingCourse extends course{
    public String language;
    public programmingCourse(String coursename,int duration ,String language){
        super(coursename,duration);
        this.language = language;
    }
    public void courseinfo(){
        super.courseinfo();
        System.out.println(language);
    }
}

class mathCourse extends course{
    public String level;
    public mathCourse(String coursename,int duration,String level){
        super(coursename,duration);
        this.level = level;
    }
    public void courseinfo(){
        super.courseinfo();
        System.out.println(level);
    }
}