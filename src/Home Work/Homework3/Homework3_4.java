import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework3_4 {
    public static void main(String[] args) {
        System.out.println("Fill your FIO:");
        Scanner fioScan = new Scanner(System.in);
        String fio = fioScan.nextLine();

        System.out.println("Fill your Mobile Phone(Example +380123456789):");
        Scanner phoneScan = new Scanner(System.in);
        String phone = phoneScan.nextLine();

        System.out.println("Fill your email:");
        Scanner emailScan = new Scanner(System.in);
        String email = emailScan.nextLine();

        checkFio(fio);
        checkPhone(phone);
        checkEmail(email);

    }

    private static void checkFio(String fio) {
        Pattern pattern = Pattern.compile("^[\\sa-zA-z-]+$");
        Matcher matcher = pattern.matcher(fio);
        if (matcher.matches() != true) {
            System.out.println("FIO: " + fio + " is not Valid");
        }
    }
    private static void checkPhone(String phone) {
        Pattern pattern = Pattern.compile("^((\\+380)([0-9]{2})([0-9]{7}))+$");
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches() != true) {
            System.out.println("Phone: " + phone + " is not Valid");
        }
    }

    private static void checkEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9-_].+@[a-z]+\\.(com|ua|ru|org|com.ua)+$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches() != true) {
            System.out.println("Email: " + email + " is not Valid");
        }
    }
}