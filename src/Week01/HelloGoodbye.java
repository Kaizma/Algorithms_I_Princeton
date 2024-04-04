package Week01;
import edu.princeton.cs.algs4.*;

import java.util.Scanner;

public class HelloGoodbye {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n1 = sc.next();
        String n2 = sc.next();


        System.out.println("Hello "+n1+" "+n2);
        System.out.println("Goodbye "+n2+" "+n1);

    }

}
