class Main2 {
    static class allergy{
        String name;
        String aeg = "";

        allergy() {
            this("비공개", "not");
        }
        allergy(String name){
            this(name, "not");
        }
        allergy(String name, String ...aeg) {
            this.name = name;
            System.out.print("이름 : " + name + ", 알레르기 : ");
            for(String allergy : aeg) {
                System.out.print(allergy + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        allergy a1 = new allergy();
        allergy a2 = new allergy("OOO");
        allergy a3 = new allergy("XXX", "계란", "우유");
        allergy a4 = new allergy("ㅁㅁㅁ", "파인애플");
    }
}
