public class Start {
    public static void main(String[] args) {
        int[] fibonacci = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        for (int i = 0; i < fibonacci.length; i++) {
            int theValue = fibonacci[i];
            System.out.println("index " + i + ", value " + theValue);
            if (theValue == 34){
                break;
            }
            }
        }
    }

