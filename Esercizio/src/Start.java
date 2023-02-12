public class Start {
    public static void main(String[] args) {
        //{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144}
        int[] fibonacci = new int[10];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 0; i < fibonacci.length-2; i++) {
            int a = fibonacci[i] + fibonacci[i + 1];
            fibonacci[i + 2] = a;
        }
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}




