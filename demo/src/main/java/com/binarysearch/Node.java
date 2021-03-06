package com.binarysearch;
// node for a binary search tree
class Node {
  int value;
  Node left;
  Node right;
  // constructor
  Node(int value) {
    this.value = value;
    right = null;
    left = null;
  }
  // getter for the value of the node
  public int value() {
    return value;
  }
  // add a node
  public void add(int newValue) {
    // add to left
    if (newValue < value) {
      if (left == null) {
        left = new Node(newValue);
      } else {
        left.add(newValue);
      }
    }
    // add to right
    if (newValue > value) {
      if (right == null) {
        right = new Node(newValue);
      } else {
        right.add(newValue);
      }
    }
    // if curr.value == newValue, we have already added it, do nothing
  }
  // print, in-order left-node-right (sorted) tree traversal
  private void printInOrder(Node curr) {
    if (curr != null) {
      printInOrder(curr.left);
      System.out.printf("node value = %d\n", curr.value);
      printInOrder(curr.right);
    }
  }
  // print
  public void printInOrder() {
    printInOrder(this);
  }
  // find a value in the tree
  // student needs to write code to
  // do a binary search of the BST tree
  public Node search(int x) {
    if (value == x) {
      return this;
    }
    // search left
    if ((x < value) && (left != null)) {
      return left.search(x);
    }
    // search right
    if ((x > value) && (right != null)) {
      return right.search(x);
    }
    return null;
  }
  // print, revesre in-order
  // student needs to write code to
  // do a revesre in-order traversal of the tree
  public void printReverseInOrder(Node curr) {
    if (curr != null) {
      printReverseInOrder(curr.right);
      System.out.printf("node value = %d\n", curr.value);
      printReverseInOrder(curr.left);
    }
  }
  // print, revesre in-order
  public void printReverseInOrder() {
    printReverseInOrder(this);
  }
}
