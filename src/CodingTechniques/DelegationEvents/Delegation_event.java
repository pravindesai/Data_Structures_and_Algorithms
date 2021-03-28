package CodingTechniques.DelegationEvents;

import java.util.ArrayList;
import java.util.Scanner;

public class Delegation_event {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("FOUR");
        list.add("FIVE");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number");
        int i = scanner.nextInt();

        Event event = new Event();
        event.setEventListnerInterface(new LocalListner());

        event.Listen(i,list);

    }

}

