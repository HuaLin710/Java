class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
        return kor+eng+math;
    }

    float getAverage() {
        return (Math.round(getTotal()/3.0f*10))/10f;
    }
}

class StudentScore {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Hong Gildong";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("name: " + s.name);
        System.out.println("Total: " + s.getTotal());
        System.out.println("Average: " + s.getAverage());
    }
}