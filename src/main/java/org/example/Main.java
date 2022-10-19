package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<User> users = new ArrayList<>();
    users.add(new User("Alex", 20));
    users.add(new User("Mike", 35));
    users.add(new User("Olha", 19));
    users.add(new User("Bob", 38));
    users.add(new User("John", 34));
    users.add(new User("Ann", 31));

    long count = users.stream().filter(user -> user.getAge() > 30).count();
    System.out.println(count);

    boolean res1 = users.stream().allMatch(user -> user.getName().contains("i"));
    System.out.println(res1);

    boolean res2 = users.stream().anyMatch(user -> user.getName().contains("i"));
    System.out.println(res2);

    boolean res3 = users.stream().noneMatch(user -> user.getName().contains("i"));
    System.out.println(res3);

    users.stream()
        .sorted((user1, user2) -> Integer.compare(user2.getAge(), user1.getAge())).limit(3)
        .forEach(System.out::println);

    users.stream().sorted(Comparator.comparing(User::getName))
        .filter(user -> user.getAge() > 30).limit(3).map(User::getName).forEach(
            System.out::println);
  }
}