import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine().replace(" ", "");
        String secondLine = scanner.nextLine().replace(" ", "");
        System.out.println(firstLine.equals(secondLine));
    }
}