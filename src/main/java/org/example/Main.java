package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      numbers.add((int) (Math.random() * 1000));
    }

    List<String> res = numbers.stream().filter((Integer n) -> n % 2 == 0).map(integer -> "Number: " + integer)
        .filter(string -> string.endsWith("0")).map(string -> string + "!").collect(Collectors.toList());

    for(String s: res){
      System.out.println(s);
    }
  }

  private static List<String> map(List<Integer> numbers) {
    List<String> strings = new ArrayList<>();
    for (int n : numbers) {
      strings.add("Number: " + n);
    }
    return strings;
  }

  private static List<Integer> filter(List<Integer> list, Predicate<Integer> test) {
    List<Integer> res = new ArrayList<>();
    for (int n : list) {
      if (test.test(2)) {
        res.add(n);
      }
    }
    return res;
  }
}