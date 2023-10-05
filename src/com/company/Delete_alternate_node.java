package com.company;

public class Delete_alternate_node {
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

        public void deleteAlternateNodes() {
            if (head == null || head.next == null) {
                return;
            }

            Node currentNode = head;
            Node nextNode = head.next;

            while (currentNode != null && nextNode != null) {
                currentNode.next = nextNode.next;
                currentNode = currentNode.next;

                if (currentNode != null) {
                    nextNode = currentNode.next;
                }
            }
        }

        public void display() {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + "  ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
            LinkedList linkedList = new LinkedList();

            // Insert some sample values
            linkedList.insert(1);
            linkedList.insert(2);
            linkedList.insert(3);
            linkedList.insert(4);
            linkedList.insert(5);

            System.out.println("Original linked list:");
            linkedList.display();

            // Delete alternate nodes
            linkedList.deleteAlternateNodes();

            System.out.println("Linked list after deleting alternate nodes:");
            linkedList.display();
        }
    }


