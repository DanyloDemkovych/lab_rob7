import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("спробуйте відгадати послідовність чисел:");
        int count = 0;
        int a = (int) Math.round(Math.random() * 3);
        int b = (int) Math.round(Math.random() * 3);
        int c = (int) Math.round(Math.random() * 3);
        while (count != 2) {
            if (scanner.nextInt() == a && scanner.nextInt() == b && scanner.nextInt() == c) {
                System.out.println("correct)");
                break;
            } else {
                System.out.println("wrong(");
                count++;
            }
        }
        System.out.println("answer: "+a+b+c);
    }
}


