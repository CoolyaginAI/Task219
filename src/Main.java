import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        String valueInt = "";
        if (a % 5 == 0) valueInt = "a=" + a + ", ";
        if (b % 5 == 0) valueInt += "b=" + b + ", ";
        if (c % 5 == 0) valueInt += "c=" + c;
        if (valueInt.isEmpty()) System.out.println("нет значений, кратных 5");
        else System.out.println(valueInt);


    }
}