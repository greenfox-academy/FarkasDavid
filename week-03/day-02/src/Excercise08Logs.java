import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Excercise08Logs {
  // Read all data from 'log.txt'.
  // Each line represents a log message from a web server
  // Write a function that returns an array with the unique IP adresses.
  // Write a function that returns the GET / POST request ratio.
  public static void main(String[] args) {
    Path logFile = Paths.get("log.txt");
    try {
      List<String> lines = Files.readAllLines(logFile);
      uniqueIp(lines);
      System.out.println(lines);
    } catch (IOException e) {

    }

  }

  private static Object[] uniqueIp(List<String> rows) {
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < rows.size(); i++) {
      int firstIndex = 27;
      int lastIndex = 38;
      list.add(rows.get(i).substring(firstIndex, lastIndex));
      //Collections.sort(lista);
    }
    Set<String> uniqueValues = new HashSet<>();
    uniqueValues.addAll(list);
    return uniqueValues.toArray();
  }
}

