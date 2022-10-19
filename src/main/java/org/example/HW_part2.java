package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HW_part2 {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      numbers.add((int) ((Math.random() * 100) + 100));
    }
    List<String> res = numbers.stream().filter(integer -> integer % 2 == 0 && integer % 5 == 0)
        .map(integer -> Math.sqrt(integer))
        .map(sqrt -> "Sqrt: " + sqrt).collect(Collectors.toList());

    for (String s : res) {
      System.out.println(s);
    }
  }

}
