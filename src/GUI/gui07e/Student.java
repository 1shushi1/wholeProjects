package GUI.gui07e;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {

    public static void main(String[] args) {
        try (Stream<String> str = Files.lines(Paths.get("data.txt"))) {
            str.map(line -> {
                String[] a = line.split("\\s+");
                return new Student(a[0], a[1], Integer.parseInt(a[2]));
            }).collect(Collectors.groupingBy(Student::getGroup)).forEach((name, group) -> System.out.println(name + " " + group));

        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    public String name;
    public String group;
    int score;

    public Student(String name, String group, int score) {
        this.name = name;
        this.group = group;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return name + " " + group;
    }
}