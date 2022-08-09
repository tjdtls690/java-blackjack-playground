package nextstep.fp;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStudy {

    public static long countWords() throws IOException {
        String contents = new String(Files.readAllBytes(Paths
                .get("src/main/resources/fp/war-and-peace.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));
    
        return words.stream().filter(s -> s.length() > 12).count();
    }

    public static void printLongestWordTop100() throws IOException {
        String contents = new String(Files.readAllBytes(Paths
                .get("src/main/resources/fp/war-and-peace.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        // TODO 이 부분에 구현한다.
        words.stream()
                .filter(s -> s.length() > 12)
                .distinct()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .limit(100)
                .forEach(s -> System.out.println(s.toLowerCase()));
        long count = words.stream()
                .filter(s -> s.length() > 12)
                .distinct()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .limit(100).count();
        System.out.println(count);
    }

    public static List<Integer> doubleNumbers(List<Integer> numbers) {
        return numbers.stream().map(num -> num * 2).collect(Collectors.toList());
    }

    public static long sumAll(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

    public static long sumOverThreeAndDouble(List<Integer> numbers) {
        return numbers.stream().filter(num -> num > 3).map(num -> num * 2).reduce(0, Integer::sum);
    }
}