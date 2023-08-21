package com.company;

public class LinkedList_identical {
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

        public boolean isIdentical(LinkedList otherList) {
            Node currentNodeA = this.head;
            Node currentNodeB = otherList.head;

            while (currentNodeA != null && currentNodeB != null) {
                if (currentNodeA.data != currentNodeB.data) {
                    return false;
                }
                currentNodeA = currentNodeA.next;
                currentNodeB = currentNodeB.next;
            }

            // If both lists have reached the end, they are identical
            return (currentNodeA == null && currentNodeB == null);
        }
    }

        public static void main(String[] args) {
            LinkedList listA = new LinkedList();
            LinkedList listB = new LinkedList();

            // Insert elements into the first linked list
            listA.insert(1);
            listA.insert(9);
            listA.insert(7);
            listA.insert(3);

            // Insert elements into the second linked list
            listB.insert(1);
            listB.insert(9);
            listB.insert(7);
            listB.insert(3);

            boolean isIdentical = listA.isIdentical(listB);

            if (isIdentical) {
                System.out.println("The linked lists are identical.");
            } else {
                System.out.println("The linked lists are not identical.");
            }
        }
    }


