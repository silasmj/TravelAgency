import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Trip> travelList = new ArrayList();
        mainMenu(scan, travelList);
    }
    public static void mainMenu(Scanner scan, ArrayList<Trip> list) {
        System.out.println("----Main Menu----");
        System.out.println("Press A: Create Ski Trip");
        System.out.println("Press B: Create Beach Trip");
        System.out.println("Press C: List of trips");
        String ans = scan.next();

        if (ans.equalsIgnoreCase("A"))    {
            createSkiTrip(scan, list);
        }else if(ans.equalsIgnoreCase("B"))  {
            createBeachTrip(scan, list);
        }else if (ans.equalsIgnoreCase("C"))    {
            printList(scan, list);
        }


    }
    public static void createTrip(Scanner scan, ArrayList<Trip> list)  {
        System.out.println("Are you going for a beach- or ski trip? Ski/Beach");
        String trip = scan.next();
        if(trip.equalsIgnoreCase("Ski"))    {
            createSkiTrip(scan, list);
        }else if (trip.equalsIgnoreCase("Beach"))   {
            createBeachTrip(scan, list);
        }

    }
    public static void createSkiTrip(Scanner scan, ArrayList<Trip> list) {
        System.out.println("Enter the country you want to visit: ");
        String country = scan.next();
        System.out.println("Enter the duration in days: ");
        int duration = scan.nextInt();
        System.out.println("Enter the amount of persons:");
        int persons = scan.nextInt();
        int price = duration * 700 * persons;
        System.out.println("Enter the amount of liftcards you want:");
        int liftcards = scan.nextInt();
        System.out.println("Enter the amount of skies you want (in pair):");
        int pairOfSkies = scan.nextInt();

        SkiTrip ski1 = new SkiTrip(country, duration, price, persons, liftcards, pairOfSkies);
        list.add(ski1);
        mainMenu(scan, list);
    }
    public static void createBeachTrip(Scanner scan, ArrayList<Trip> list){
        System.out.println("Enter the country you want to visit: ");
        String country = scan.next();
        System.out.println("Enter the duration in days: ");
        int duration = scan.nextInt();
        System.out.println("Enter the amount of persons:");
        int persons = scan.nextInt();
        int price = (duration * 500) * persons;
        System.out.println("Do you want to have poolview?");
        String poolView = scan.next();
            if(poolView.equalsIgnoreCase("yes"))    {
                price += 300;
            }
        System.out.println("What area you want to be in? Kids/Standard/Luxury");
        String area = scan.next();
            if(area.equalsIgnoreCase("Luxury"))    {
                price += 1000;
            }
        BeachTrip beach1 = new BeachTrip(country, duration, persons, price, poolView, area);
        list.add(beach1);
        mainMenu(scan, list);
    }
    public static void printList(Scanner scan, ArrayList<Trip> list) {
        System.out.println(list);
        mainMenu(scan, list);

    }
}
