import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arrayStringhe = new String[0];

        System.out.println("inserisci stringhe nell'array (inserisci la parola 'fine' per terminare): ");

        while (true) {
            String stringa = in.nextLine();

            if (stringa.equalsIgnoreCase("fine")) {
                break;
            }
        }
        System.out.println("Programma terminato.");
    }
}