import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("To end input of numbers input 'END'");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int quant;
        float sum;
        sum = 0f;
        quant = 0;
        while(!s.equals("END")){
            sum = sum + Integer.parseInt(s);
            quant++;
            s = in.nextLine();
        }
        System.out.println(sum/quant);
    }

}