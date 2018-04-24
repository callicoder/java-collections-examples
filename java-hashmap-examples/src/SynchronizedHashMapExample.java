import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class SynchronizedHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> cricketTeamScore = Collections.synchronizedMap(new HashMap<>());
        cricketTeamScore.put("Australia", 349);
        cricketTeamScore.put("India", 250);

        // Create an ExecutorService with a Thread Pool of size 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Create a Runnable object that increments the value associated with a given key in the HashMap by one.
        Runnable task = () -> {
            incrementTeamScore(cricketTeamScore, "India");
        };

        // Submit the Runnable object to the executorService 100 times to test concurrent modifications
        for(int i = 0; i < 100; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final Score of Team India : " + cricketTeamScore.get("India"));
    }

    // Increment the score of a team by one
    private static void incrementTeamScore(Map<String, Integer> cricketTeamScore, String team) {
        synchronized (cricketTeamScore) {
            Integer score = cricketTeamScore.get(team);
            cricketTeamScore.put(team, score + 1);
        }
    }
}
