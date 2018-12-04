package student;

public class StudentTest {

    public static void main(String[] args) {
        /*int[] studentIds = new int[]{1001, 1002, 1003};
        Student s = new Student(studentIds[0], "joan");
        s.gender = "male";
    
       Student s1 = new Student(studentIds[1], "raj");
        s1.gender = "male";
        
        Student s2 = new Student(studentIds[2], "amanda");
        s2.gender = "female";
        
        System.out.println("Name of student 1: " + s.name);
        System.out.println("Name of student 2: " + s1.name);
        System.out.println("Name of student 3: " + s2.name);
        
        System.out.println(s.updateProfile("John"));*/
        int num = 0;
        xyz:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break xyz;
                }
                num++;
                System.out.println("i: " + i + ", j: " + j + ", num: " + num);
            }
        }

    }
}
