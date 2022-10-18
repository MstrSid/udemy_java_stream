package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

  public static void main(String[] args) {
//    Director director = new Director();
//    String res = director.setWork(new Worker() {
//      @Override
//      public String work(int count) {
//        String s = "";
//        s += "Anonymous worker working...".repeat(count);
//        return s;
//      }
//    }, 10);
//
//    System.out.println(res);
//
//    String res2 = director.setWork((int count) -> "Lambda worker working...".repeat(count), 10);
//
//    System.out.println(res2);

    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      numbers.add((int) (Math.random() * 1000));
    }

    List<Integer> filtered = filter(numbers, (Integer n) -> n % 2 == 0);
    for (Integer n : filtered) {
      System.out.println(n);
    }
  }

  private static List<Integer> filter(List<Integer> list, Predicate<Integer> test) {
    List<Integer> res = new ArrayList<>();
    for (Integer n : list) {
      if (test.test(2)) {
        res.add(n);
      }
    }
    return res;
  }
}