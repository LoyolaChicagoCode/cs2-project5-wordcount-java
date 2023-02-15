package edu.luc.cs271.wordcount;

import java.util.Comparator;
import java.util.Map;

/** The comparison strategy for sorting the array by the word count. */
public class DescendingByCount implements Comparator<Map.Entry<String, Integer>> {
  public int compare(final Map.Entry<String, Integer> l, final Map.Entry<String, Integer> r) {

    // TODO turn this into descending order using the getValue() method on l and r
    return -1;

  }
}
