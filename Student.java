package fun;

public class Student{

    String firstName;
    String lastName;
    String id;
    double gpa;
    //Constructor
    public Student(String fn, String ln, String id, double gpa){
        this.firstName = fn;
        this.lastName = ln;
        this.id = id;
        this.gpa = 0.0;
    }
    
    public void addPluss(){
           if(gpa < 4.0){
            gpa += 1;   
           }else{
            gpa += 0.10;
        }
        }
        
        public void removePluss(){
            if(gpa > 4.0){
                gpa -= 0.1;
            }else{
                gpa -= 1.0;
            }
        }
    public static void main(String[] args) {

    }
    
}
