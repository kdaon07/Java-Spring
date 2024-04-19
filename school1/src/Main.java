class car {
    int speed;
    String color;
    int seat;
}

class test {
    public static void main(String ages[]) {
        car c1 = new car();
        car c2 = new car();
        c1.speed = 50;
        c2.speed = 65;
        c1.color = "blue";
        c2.color = "red";
        c1.seat = 5;
        c2.seat = 2;
        System.out.println("c1의 속도:" + c1.speed + " 색상:" + c1.color + " " + c1.seat + "인승");
        System.out.println("c2의 속도:" + c2.speed + " 색상:" + c2.color + " " + c2.seat + "인승");
    }
}