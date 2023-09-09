import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class convert2cedi {
    public static void main(String[]args){

        System.out.println("Enter base currency \nUse \"nai\" for Naira, \"usd\" for US Dollar, \"gbp\" for British Pound and \"euro\" for Euro");
        Scanner scanner1 = new Scanner(System.in);
        String basecurr = scanner1.nextLine();
        System.out.println("\n");


        while((!basecurr.equals("nai")&&!basecurr.equals("usd"))&&(!basecurr.equals("gbp")&&!basecurr.equals("euro"))){
            System.out.println("Enter base currency \nUse \"nai\" for Naira, \"usd\" for US Dollar, \"gbp\" for British Pound and \"euro\" for Euro");
            scanner1 = new Scanner(System.in);
            basecurr = scanner1.nextLine();
            System.out.println("\n");

        }
        System.out.println("Enter Amount");
        Scanner scanner2 = new Scanner(System.in);
        double amount = scanner2.nextDouble();


        switch (basecurr){
            case "nai":
                double nai = amount*0.015;
                System.out.println(amount+" Naira makes "+nai+" Cedis.");
                break;

            case "usd":
                double usd = amount*11.47;
                System.out.println(amount+" USD makes "+usd+" Cedis.");
                break;

            case "gbp":
                double gbp= amount*14.3;
                System.out.println(amount+" Pound Sterlin makes "+gbp+" Cedis.");
                break;

            case "euro":
                double euro = amount*12.29;
                System.out.println(amount+" Euro makes "+euro+" Cedis.");
                break;

        }
    }
}
