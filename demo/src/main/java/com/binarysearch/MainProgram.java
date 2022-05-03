package com.binarysearch;

import java.util.*;

public class MainProgram {
  public static void main(String[] args) {
    // create tree
    Node bst = new Node(30);
    // add 10 random value nodes
    final Integer max = 100;
    final Integer n = 10;
    for (Integer i = 0; i < n; i++) {
      Integer val = (int) Math.floor(Math.random() * max);
      bst.add(val);
    }
    // print tree
    System.out.println("Printing the tree using in-order");
    bst.printInOrder();
    // main loop for app
    Scanner scan = new Scanner(System.in);
    String command = "_";
    // loop until user quits
    while (!command.equals("q")) {
      System.out.println();
      System.out.print("Enter a number or q to quit: ");
      command = menuGetCommand(scan);
      if (!command.equals("q")) {
        Integer val = Integer.parseInt(command);
        // do binary search in the bst
        System.out.printf("Searching for the value %d\n", val);
        // student needs to write code to
        // search tbe binary tree by calling Node.java's "search" method.
        // the variable "val" has the integer value to be searched for.
        Node search = bst.search(val);
        // student needs to write code to
        // then print results of the search
        if (search == null) {
          System.out.printf("The value %d is not in the tree\n", val);
        } else {
          System.out.printf("The value %d is in the tree\n", val);
        }
      }
    }
  }
  // get first character from input
  private static String menuGetCommand(Scanner scan) {
    String command = "_";
    String rawInput = scan.nextLine();
    command = rawInput.toLowerCase();
    return command;
  }
}
