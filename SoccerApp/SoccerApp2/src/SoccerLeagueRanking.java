import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SoccerLeagueRanking {
    public static void main(String[] args) {
        // Read input from a file
        List<String> inputLines = readInputFromFile("ScoreBoard.txt");

        // Create a HashMap to store team names and points
        Map<String, Integer> teamPoints = new HashMap<>();

        // Process each match and update points for each team
        for (String line : inputLines) {
            // Split the match details into team names and scores
            String[] match = line.split(",");
            String team1 = match[0].trim().split("\\d")[0].trim();
            String team2 = match[1].trim().split("\\d")[0].trim();
            int score1 = Integer.parseInt(match[0].replaceAll("[^0-9]", ""));
            int score2 = Integer.parseInt(match[1].replaceAll("[^0-9]", ""));

            // Update points for both teams
            updatePoints(teamPoints, team1, score1, score2);
            updatePoints(teamPoints, team2, score2, score1);
        }

        // Create a TreeMap to sort teams by points and alphabetical order
        TreeMap<String, Integer> sortedTeams = new TreeMap<>(
                (t1, t2) -> {
                    int pointsCompare = Integer.compare(teamPoints.get(t2), teamPoints.get(t1));
                    return (pointsCompare == 0) ? t1.compareTo(t2) : pointsCompare;
                }
        );

        // Add all teams and their points to the sorted map
        sortedTeams.putAll(teamPoints);

        // Print the ranking table
        int rank = 1;
        for (Map.Entry<String, Integer> entry : sortedTeams.entrySet()) {
            System.out.println(rank + ". " + entry.getKey());
            System.out.println(entry.getValue());
            rank++;
        }
    }

    private static List<String> readInputFromFile(String filePath) {
        List<String> inputLines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                inputLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputLines;
    }

    private static void updatePoints(Map<String, Integer> teamPoints, String team, int goalsFor, int goalsAgainst) {
        int points = teamPoints.getOrDefault(team, 0);
        if (goalsFor > goalsAgainst) {
            points += 3; // Win
        } else if (goalsFor == goalsAgainst) {
            points += 1; // Draw
        }
        teamPoints.put(team, points);
    }
}
