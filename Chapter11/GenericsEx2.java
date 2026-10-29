import java.util.*;

class GenericsEx2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Hong",1,1));
        list.add(new Student("Kim",1,2));
        list.add(new Student("Lee",2,1));
        list.add(new Student("Park",2,2));

        Iterator<Student> it = list.iterator();

        while(it.hasNext()) {
            Student s = it.next();
            System.out.println(s.name + ": class " + s.ban + " no. " + s.no) ;
        }
    }
}

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}