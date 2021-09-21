import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String slovo = "";
        String rijec = s.next();
        for (int i = (rijec.length() - 1); i >= 0; i--) {
            slovo += rijec.charAt(i);
        }
        if (rijec.equals(slovo))
            System.out.println("Rijec " + rijec + " je palindrom");
        else
            System.out.println("Nije palindrom");
    }
}