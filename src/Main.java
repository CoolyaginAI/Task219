import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int a, b, c;

        // ввод
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();


        // первое
        String valueInt = "";
        if (a % 5 == 0) {
            valueInt = "a=" + a;
            if (b % 5 == 0) {
                valueInt += ", b=" + b;
                if (c % 5 == 0) valueInt += ", c=" + c;
            }
            else if (c % 5 == 0) valueInt += ", c=" + c;
        }
         else {
            if (b % 5 == 0) {
                valueInt += "b=" + b;
                if (c % 5 == 0) valueInt += ", c=" + c;
            }
            else if (c % 5 == 0) valueInt += "c=" + c;
        }

        if (valueInt.isEmpty()) System.out.println("нет значений, кратных 5");
        else System.out.println(valueInt);


        // второе
        System.out.println("Результат целочисленного деления a на b: " + (a/b));


        // третье
        double d = (double) a / b;
        System.out.println("Результат деления a на b: " + d);

        // четвертое
        double e = Math.ceil(d);
        System.out.println("Результат деления a на b с округлением в большую сторону: " + e);


        // пятое
        double f = Math.floor(d);
        System.out.println("Результат деления a на b с округлением в меньшую сторону: " + f);


        // шестое
        double g = Math.round(d);
        System.out.println("Результат деления a на b с математическим округлением: " + g);


        // седьмое
        System.out.println("Остаток от деления b на c: " + (b%c));


        // восьмое
        int j = a<b ? a : b;
        System.out.println("Наименьшее значение из a и b: " + j);

        // девятое
        int i = b>c ? b : c;
        System.out.println("Наибольшее значение из b и c: " + i);

    }
}