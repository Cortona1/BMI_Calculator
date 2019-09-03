import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        UserInterface project = new UserInterface(reader);
        project.start();
    }
}
