package tabgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q241231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        List<Project> projects = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int priority = Integer.parseInt(input[1]);
            int time = Integer.parseInt(input[2]);
            projects.add(new Project(name, priority, time));
        }

        projects.sort((p1, p2) -> {
            if (p1.priority != p2.priority) {
                return Integer.compare(p1.priority, p2.priority);
            } else if (p1.priority == p2.priority) {
                return Integer.compare(p1.time, p2.time);
            } else {
                return p1.name.compareTo(p2.name);
            }
        });

        for (Project p : projects) {
            System.out.println(p.name + " " + p.priority + " " + p.time);
        }
    }

}
class Project {
    String name;
    int priority;
    int time;

    public Project(String name, int priority, int time) {
        this.name = name;
        this.priority = priority;
        this.time = time;
    }
}
