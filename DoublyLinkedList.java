package Doubly;

import java.util.Scanner;

public class DoublyLinkedList {
	 Dnode root;
	 	
	 public static void main(String[] args) {
	        DoublyLinkedList doublyList = new DoublyLinkedList();
	        Scanner scanner = new Scanner(System.in);

	        int choice;
	        do {
	            System.out.println("Doubly Linked List Operations:");
	            System.out.println("1. Insert Left");
	            System.out.println("2. Delete Left");
	            System.out.println("3. Insert Right");
	            System.out.println("4. Delete Right");
	            System.out.println("5. Print List");
	            System.out.println("6. Search List");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the element to insert left: ");
	                    int leftElement = scanner.nextInt();
	                    doublyList.insertLeft(leftElement);
	                    break;

	                case 2:
	                    doublyList.deleteLeft();
	                    break;

	                case 3:
	                    System.out.print("Enter the element to insert right: ");
	                    int rightElement = scanner.nextInt();
	                    doublyList.insertRight(rightElement);
	                    break;

	                case 4:
	                    doublyList.deleteRight();
	                    break;

	                case 5:
	                    doublyList.printList();
	                    break;

	                case 6:
	                    System.out.print("Enter the key to search: ");
	                    int key = scanner.nextInt();
	                    doublyList.searchList(key);
	                    break;

	                case 0:
	                    System.out.println("Exiting the program. Goodbye!");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        } while (choice != 0);

	        scanner.close();
	    }
	 
	    void createList() {
	        root = null;
	    }

	    void insertLeft(int e) {
	        Dnode n = new Dnode(e);
	        if (root == null) {
	            root = n;
	        } else {
	            n.right = root;
	            n.left = null;
	            root.left = n;
	            root = n;
	        }
	        System.out.println("Inserted in left");
	    }

	    void deleteLeft() {
	        if (root == null) {
	            System.out.println("Empty list");
	        } else {
	            Dnode t = root;
	            root = root.right;
	            if (root != null) {
	                root.left = null;
	            }
	            System.out.println(t.data + " Deleted from left");
	        }
	    }

	    void insertRight(int e) {
	        Dnode n = new Dnode(e);

	        if (root == null) {
	            root = n;
	        } else {
	            Dnode t = root;
	            while (t.right != null) {
	                t = t.right;
	            }
	            n.left = t;
	            t.right = n;
	        }
	        System.out.println("Inserted in right");
	    }

	    void deleteRight() {
	        if (root == null) {
	            System.out.println("Empty list");
	        } else {
	            Dnode t = root;
	            Dnode t2 = t;
	            while (t.right != null) {
	                t2 = t;
	                t = t.right;
	            }
	            t2.right = null;

	            System.out.println(t.data + " Deleted from right");
	        }
	    }
	    void printList() {
	        if (root == null) {
	            System.out.println("Empty List");
	        } else {
	            Dnode t = root;
	            while (t != null) {
	                System.out.print("| " + t.data + " |->");
	                t = t.right;
	            }
	        }
	    }

	    void searchList(int key) {
	        if (root == null) {
	            System.out.println("Empty List");
	        } else {
	            Dnode t = root;
	            while (t != null && key != t.data) {
	                t = t.right;
	            }
	            if (t == null) {
	                System.out.println("Key not found");
	            } else {
	                System.out.println("Key found");
	            }
	        }
	    }
}
