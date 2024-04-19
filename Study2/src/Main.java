class Exercise6_20 {
    static int[] shuffle(int[] arr) {
        int temp;
        int n;
        for(int i=0;i<10;i++) {
            n = (int)(Math.random() * 8) + 1;
            temp = arr[n];
            arr[n] = arr[0];
            arr[0] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}