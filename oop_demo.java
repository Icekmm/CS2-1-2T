
class Student{
    int stud_id;
    String name;

    void insertStudent(int s_id, String s_name){
        stud_id = s_id;
        name = s_name;
    }

    void printStudent(){
        System.out.print("\nStudent Record : [" + stud_id + "] [" + name +"]");
    }
}


class oop_demo{

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        //add student record to Student class
        s1.insertStudent(1001, "Paolo");
        s2.insertStudent(1002, "John Brent");

        //print student record
        s1.printStudent();
        s2.printStudent();

    }
}