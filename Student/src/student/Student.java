package student;
public class Student {
    int id;
    String name;
    String gender;
    
    Student(int id, String name){
        this(name);
        this.id = id;
    }
    
    Student(String name){
        this.name = name;
    }
    
    String updateProfile(String newName){
        String oldVal = this.name;
        this.name = newName;
        return "Updated successfully from " + oldVal + " to " + this.name;
    }
}
