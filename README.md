# Loyola COMP 271 Lab 4: sets and maps

## Group activity

Collaborate with your teammates but submit individually.
Clearly list the members of your team.

# Objectives

An understanding of the following concepts and techniques:

- Set and Map ADTs
- sorting arrays and ArrayLists
- solving problems using existing collections and algorithms
- parameterizing sorting by a comparison strategy
- Iterator, Strategy, and Adapter design patterns

# Instructions

In this lab, you will have the opportunity to complete a tool that counts the frequencies
of the words it reads from the standard input.
The tool then prints the (up to) 10 most frequent words and their frequencies in descending order.

Example:

      Run > Run main (or similar)
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

1. Download the e-book attached to the assignment and copy it into your project's root directory.
1. Use the program to determine the 10 most frequent words and their frequencies in this text by redirecting stdin from the downloaded file:
    - Run > Run... > Edit Configuration 
    - check "Redirect input from" and enter the exact file name including the .txt extension
      (do not browse to the file because that would create an absolute path)
    - press Run
    
   Alternatively, if you have a working installation of the [Maven build tool](https://maven.apache.org/), you can perform this task in the terminal:

       cd <your project's root directory>
       mvn compile
       mvn exec:java < lesmisrables01unkngoog_djvu.txt
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


# Submission

-    Make sure you have created a separate project for this activity.
-    Include a project-specific readme file including your reflection and any other thoughts or design decisions.
-    In IDEA, export your project as a zip file and submit as an attachment.


# Grading (total 5)

- 2.5 completion of items marked TODO in `src/main` and correct behavior
- 1.5 completion of meaningful tests in `TestWordCount`
- 1 written part
  - 0.8 responses to the questions above
  - 0.2 grammar, style, formatting
