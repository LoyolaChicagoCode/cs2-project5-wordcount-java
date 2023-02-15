# Loyola COMP 271 Project 5: wordcount using maps

## Group activity

In this activity, we will use the Map abstract data type (ADT) to count word frequencies.

# Objectives

An understanding of the following concepts and techniques:

- Abstract data type (ADT) concept
- Set and Map ADTs
- sorting arrays and ArrayLists
- solving problems using existing collections and algorithms
- parameterizing sorting by a comparison strategy
- Iterator, Strategy, and Adapter design patterns

# Instructions

In this lab, you will have the opportunity to complete a tool that counts the frequencies
of the words it reads from the standard input.
The tool then prints the (up to) 10 most frequent words and their frequencies in descending order.

Example (in a Replit Shell window):

      mvn compile
      mvn exec:java
      asdf oiu qwer
      asdf oiu
      oiu qwer
      qwer oiu
      asdf asdf
      xzc
      EOF (ctrl-D or ctrl-Z)
      asdf=4
      oiu=4
      qwer=3
      xzc=1

Specifically:

1. Complete the TODO items in the various sources until the program behaves as required.
1. Complete the test class `TestWordCount` to provide meaningful tests of the `getCount` method.
   To avoid the need for file input to populate the `WordCounter` instance,
   directly create the desired iterator like so:

        List.of("asdf", "oiu", "qwer").iterator()

   To run the tests in a Replit Shell window:

       mvn test

1. Use the program to determine the 10 most frequent words and their frequencies in the Les Miserable text by redirecting stdin from the downloaded file (in a Replit Shell window):

       mvn compile
       mvn exec:java < lesmisrables.txt
       word1=freq1 <- results start here
       word2=freq2
       ...

1. Report the results in the written part (Answers.md).
1. Answer the following questions, also in Answers.md:
   - Try using a `TreeMap` instead of a `HashMap`. Does this make any difference?
   - What happens if you invoke `countWords` multiple times for different String iterators?
   - What crucial role does the Iterator abstraction play in making `WordCounter` testable?
   
For your reference, the top 10 words in Les Miserables are

```
the=33278
of=18012
and=12845
a=12449
to=12449
in=9386
was=7788
that=6601
he=6202
his=5529
```

# Grading (total 5 points)

- 2.5 completion of items marked TODO in `src/main` and correct behavior
- 1.5 completion of meaningful tests in `TestWordCount`
- 1 written part
  - 0.8 responses to the questions above
  - 0.2 grammar, style, formatting
