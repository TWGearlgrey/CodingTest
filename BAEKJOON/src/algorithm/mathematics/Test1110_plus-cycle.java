package algorithm.math;

import java.util.Scanner;

public class Test1110 {
    public static int cycleLength = 0;
    public static String result = "";
    public static Scanner sc = new Scanner(System.in);
    public static String inputNumber = "";
    public static String addDigits = "";
    public static String fstPlace  = "";
    public static String scdPlace  = "";

    public String transferNumber(String n) {
        return n.length() < 2 ? "0"+ n : n;
    }

    public String getAddDigits(String a) {
        return (Integer.parseInt(a.substring(0, 1))
                + Integer.parseInt(a.substring(1))) + "";
    }

    public static void main(String[] args) {
        Test1110 app = new Test1110();
        String n = app.transferNumber(sc.next());



        while(!result.equals(n)){
            if(cycleLength == 0) result = n;
            inputNumber = app.transferNumber(result);
            addDigits = app.getAddDigits(inputNumber);

            fstPlace  = inputNumber.substring(1);
            scdPlace  = app.transferNumber(addDigits).substring(1);

            result = fstPlace + scdPlace;
            cycleLength++;
        }
        System.out.println(cycleLength);
    }
}