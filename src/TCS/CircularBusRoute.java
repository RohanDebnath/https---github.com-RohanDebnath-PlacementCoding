//Not working
import java.util.Scanner;

public class CircularBusRoute {
    static double result(String[] busStops, int[] path, String source, String destination) {
        int sourceIndex = 0, destinationIndex = 0, distance = 0;
        for (int i = 0; i < busStops.length; i++) {
            System.out.println(i); // debug purpose
            if (source .equals( busStops[i])) {
                sourceIndex = i; // Kaj korche na
                System.out.println(sourceIndex); // proof j kaj korche na
                break;
            }
        }
        for (int i = 0; i < busStops.length; i++) {
            if (destination .equals(busStops[i])) {
                destinationIndex = i;
                break;
            }
        }
        if (destinationIndex > sourceIndex) {
            for (int i = sourceIndex; i < path.length; i++) {
                distance += path[i];
            }
        } else {

            for (int i = sourceIndex; i < path.length; i++) {
                distance += path[i];
                System.out.println("Distence in turn " + distance); // debug purpose
            }
            for (int i = 0; i <= destinationIndex; i++) {
                distance += path[i];
                System.out.println("Distence in turn " + distance); // debug purpose
            }
        }
        System.out.println((float)distance/1000);// why
        float res=(float)(distance/1000);// why
        System.out.println(res);
        return res*5;
    }

    public static void main(String[] args) {
        String[] busStops = { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };
        int[] path = { 800, 600, 750, 900, 1400, 1200, 1100, 1500 };
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        String destination = sc.nextLine();
        System.out.println(result(busStops, path, source, destination));

    }

}
