# WordCount

This Java program reads a text file, counts the occurrences of each word, and displays the word count for each unique word in alphabetical order. The program handles punctuation marks, whitespace, and case sensitivity appropriately.

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

### Prerequisites

Ensure you have Java installed on your machine. You can download it from [here](https://www.oracle.com/java/technologies/javase-downloads.html).

### Setup

1. **Clone the Repository:**
   ```sh
   git clone https://github.com/yourusername/WordCount.git
   cd WordCount

2. **Input File:**
   There is a text file named input.txt in the root directory of the project and add some text content to it. For example:
      ```sh
      Hello, world! This is a sample text file.
      Hello, Java. Hello, programming.

3. **Compile the Java Program**
   Open a terminal and navigate to the project directory. Compile the Java program using the following command:
      ```sh
      javac WordCount.java
4. **Run the Java Program**
   Run the compiled Java program using the following command:
      ```sh
      java WordCount
5. **Program Output**
   The program will read the content of input.txt, count the occurrences of each word, and print the word counts in alphabetical order.      For the example input above, the output will be:
   ```makefile
   a: 1
   file: 1
   hello: 3
   is: 1
   java: 1
   programming: 1
   sample: 1
   text: 1
   this: 1
   world: 1

