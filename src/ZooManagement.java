import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donner le nombre de cages :");
        int nbrCages = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Donner le nom du zoo :");
        String zooName = scanner.nextLine();

        System.out.printf("%s comporte %d cages.%n", zooName, nbrCages);
    }
}