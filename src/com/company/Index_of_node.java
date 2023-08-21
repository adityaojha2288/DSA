package com.company;
import java.util.Scanner;
public class Index_of_node {
        static class Node {
            int data;
            Node next;
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        static class LinkedList {
            Node head;
            public void insert(int data) {
                Node newNode = new Node(data);

                if (head == null) {
                    head = newNode;
                } else {
                    Node currentNode = head;
                    while (currentNode.next != null) {
                        currentNode = currentNode.next;
                    }
                    currentNode.next = newNode;
                }
            }
            public int findIndex(int value) {
                Node currentNode = head;
                int index = 0;

                while (currentNode != null) {
                    if (currentNode.data == value) {
                        return index;
                    }
                    currentNode = currentNode.next;
                    index++;
                }
                return -1;
            }
        }
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                LinkedList linkedList = new LinkedList();
                linkedList.insert(10);
                linkedList.insert(20);
                linkedList.insert(30);
                linkedList.insert(40);
                linkedList.insert(50);

                System.out.print("Enter Index: ");
                int value = scanner.nextInt();
                int index = linkedList.findIndex(value);
                if (index == -1) {
                    System.out.println("Node not found in the linked list.");
                } else {
                    System.out.println("Node found at index: " + index);
                }
            }



    }

