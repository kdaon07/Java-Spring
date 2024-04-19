class box {
    static int count = 0;
    String name;
    double Kg;
    box(String name, double Kg) {
        this.name = name;
        this.Kg = Kg;
        count++;
    }
}

class test {
    public static void main(String args[]) {
        box[] boxs = new box[3];

        boxs[0] = new box("컴퓨터", 14.5);
        boxs[1] = new box("사과", 5.6);
        boxs[2] = new box("냉동식품", 2.3);

        System.out.println(boxs[0].name + ": " + boxs[0].Kg + "kg, 총 " + box.count + "개 남았습니다");
        System.out.println(boxs[1].name + ": " + boxs[1].Kg + "kg, 총 " + box.count + "개 남았습니다");
        System.out.println(boxs[2].name + ": " + boxs[2].Kg + "kg, 총 " + box.count + "개 남았습니다");

        box.count--;
        System.out.println(boxs[0].name + "배달 완료 남은 물건:" + box.count);
        boxs[0] = fin(boxs[0]);
        System.out.println(boxs[0].name + ": " + boxs[0].Kg + "kg, 총 " + box.count + "개 남았습니다");
        System.out.println(boxs[1].name + ": " + boxs[1].Kg + "kg, 총 " + box.count + "개 남았습니다");
        System.out.println(boxs[2].name + ": " + boxs[2].Kg + "kg, 총 " + box.count + "개 남았습니다");
    }
    static box fin(box d) {
        box tmp = new box(d.name+"(완료됨)", d.Kg);
        box.count--;
        return tmp;
    }
}