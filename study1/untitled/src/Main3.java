class  Exercise6_5 {
    public static void main(String args[]) {
        Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}

class Student2 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int sum;
    float sum2;
    Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    String info() {
        sum = kor + eng + math;
        sum2 = sum/3;
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + sum + "," + sum2;
    }
}