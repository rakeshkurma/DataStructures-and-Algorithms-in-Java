import java.util.Arrays;

public class uni {
    public static int maxEvents(int[] arrival, int[] duration) {
        int n = arrival.length;
        int[][] events = new int[n][2];

        for (int i = 0; i < n; i++) {
            events[i][0] = arrival[i];
            events[i][1] = arrival[i] + duration[i];
        }

        Arrays.sort(events, (a, b) -> a[1] - b[1]);

        int count = 1;
        int endTime = events[0][1];

        for (int i = 1; i < n; i++) {
            if (events[i][0] >= endTime) {
                count++;
                endTime = events[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arrival = { 11, 3, 3, 5, 7 };
        int[] duration = { 12, 2, 2, 4, 1 };
        int maxPresentations = maxEvents(arrival, duration);
        System.out.println("Maximum number of presentations: " + maxPresentations);
    }
}