class StudentScoreInfo {
    public static void main(String[] args) {
        Student s = new Student("Hong Gildong", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    float avg;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor+eng+math;
        this.avg = (Math.round(this.total/3.0f*10))/10f;
    }

    String info() {
        return this.name+", "+this.ban+", "+this.no+", "+this.kor+", "+this.eng+", "+this.math+", "+this.total+", "+this.avg;
    }
}