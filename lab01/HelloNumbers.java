public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while (x < 10) {
            System.out.print(sum + " ");
//            System.out.print(x + " ");
            x += 1;
            sum += x;
        }
        System.out.println("");
    }
}