class Main {
    static String login(String id, int pw) {
        if(pw == 1234 && id.equals("bsm2024")) {
            return "관리자 로그인에 성공하였습니다";
        }
        else {
            return id + "님 로그인에 성공하셨습니다";
        }
    }

    static String login(String id) {
        return "비밀번호를 입력해주세요";
    }

    static String login(int pw) {
        return "아이디를 입력해주세요";
    }

    public static void main(String[] args) {
        System.out.println(login("bsm2024", 1234));
        System.out.println(login("bsm2023", 12345));
        System.out.println(login("bsm2024"));
        System.out.println(login(1234));
    }
}