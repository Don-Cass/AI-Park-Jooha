import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("박주하씨 [] 잘 봤어?");
        String inputString = scanner.nextLine();

        Park jh = new Park();
        jh.TalkAboutTestResults(inputString);
    }
}
