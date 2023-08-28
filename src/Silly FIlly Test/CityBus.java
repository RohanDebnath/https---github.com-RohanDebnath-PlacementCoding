import java.util.HashMap;

public class CityBus {
    static HashMap<String, Integer> stopToIndex = new HashMap<>();
    static String[] busStops = {"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};
    static int[] path = {800, 600, 750, 900, 1400, 1200, 1100, 1500};

    static {
        for (int i = 0; i < busStops.length; i++) {
            stopToIndex.put(busStops[i], i);
        }
    }

    static double calculateFare(int startIndex, int endIndex) {
        int totalDistance = 0;
        
        if (startIndex <= endIndex) {
            for (int i = startIndex; i < endIndex; i++) {
                totalDistance += path[i];
            }
        } else {
            for (int i = startIndex; i < path.length; i++) {
                totalDistance += path[i];
            }
            for (int i = 0; i < endIndex; i++) {
                totalDistance += path[i];
            }
        }
        
        double fare = Math.ceil((double) totalDistance / 1000) * 5;
        return fare;
    }
    
    static double getFare(String source, String destination) {
        if (!stopToIndex.containsKey(source) || !stopToIndex.containsKey(destination)) {
            return -1.0; // Invalid stop names
        }
        
        int sourceIndex = stopToIndex.get(source);
        int destIndex = stopToIndex.get(destination);

        if (sourceIndex == destIndex) {
            return 0.0; // Same source and destination
        }

        double fare = calculateFare(sourceIndex, destIndex);
        return fare;
    }

    public static void main(String[] args) {
        String source = "NI";
        String destination = "HA";
        double fare = getFare(source, destination);
        if (fare == -1.0) {
            System.out.println("INVALID OUTPUT");
        } else {
            System.out.println(fare + " INR");
        }
    }
}
