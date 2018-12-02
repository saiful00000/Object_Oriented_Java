package ProductDeliverySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<Customar> customarsList = new ArrayList<Customar>();
        Address address;
        Customar customar;

        for (int i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("#  Enter your name        : ");
            String customarName = in.nextLine();
            System.out.print("\n#  Enter contact number : ");
            String phoneNumber = in.next();
            System.out.print("\n#  Enter your email     : ");
            String email = in.next();
            System.out.print("\n#  Card/Cash            : ");
            String paymentMethod = in.next();
            System.out.print("\n#  Your area            : ");
            String area = in.next();
            System.out.print("\n#  Area sector          : ");
            String sector = in.next();
            System.out.print("\n#  Road number          : ");
            String roadNumber = in.next();
            System.out.print("\n#  House number         : ");
            String houseNumber = in.next();


            address = new Address(area,sector,roadNumber,houseNumber);

            customar = new Customar(customarName,phoneNumber,email,paymentMethod,address);

            customarsList.add(customar);
        }

        System.out.println(customarsList);

    }

}
