import java.util.Scanner;

public class PolydivisibleNumber {

    public static void main(String[] args){
        System.out.println("Welcome to Polydivisible checker");
        check();
    }

    public static void check(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int input = scanner.nextInt();
        String string = String.valueOf(input);
        int count = 0;
        if(true){
            for (int i=2; i<=string.length(); i++) {

                System.out.println(string.substring(0,i));
                if (Integer.parseInt(string.substring(0, i)) % (i) == 0) {

                    System.out.println(string.substring(0,i) + " is divisible by " + (i));
                    count = count + 1 ;
                }
            }
        }
        System.out.println(count);
        if (count==(string.length()-1)){
            System.out.println("Number is PolyDivisible");
        }
    }

}


