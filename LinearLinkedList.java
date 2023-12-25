package com.LinkedList;

import java.util.Scanner;



public class LinearLinkedList {
	
		Node root ;
		void createList()
		{
			root = null; // root is never created but assigned as per need
			//the first node is called root
			
		}
		void insertLeft(int e)
		{
			Node n = new Node(e);
			if(root == null)
			{
				root = n;
			}
			else
			{
				n.next = root ;
				root = n; 
			}
			System.out.println("Inserted in left");
		}
		void deleteLeft()
		{
			
			if(root == null)
			{
				System.out.println("List is Empty");
			}
			else
			{
				Node t = root;
				root = root.next; 
				System.out.println(t.data +"Delete from left");
			}	
		}
		void insertRight(int e)
		{
			
			Node n = new Node(e);
			
			if(root == null)
			{
				root = n;
			}
			else 
			{
				Node t = root;
				while(t.next != null)
				{
					t= t.next;
				}
				t.next = n;
			}
			System.out.println("Inserted in right");
			
		}
		void deleteRight()
		{ 
			
			if(root == null)
			{
				System.out.println("Empty left");
			}
			else
			{
				Node t = root;
				Node t2 = t;
				while(t.next!=null)
				{
					t2 = t;
					t =t.next;
				}
				t2.next = null;
				
				System.out.println(t.data +"Delete from Right");
				if(root == t)
				{
					t = null;
				}
			}
			
			
		}
		void printList()
		{
			if(root == null)
			{
				System.out.println("Empty List");
			}
			else
			{
				Node t = root;
				while(t != null)
				{
					
					System.out.print("| "+t.data+" |->");
					t = t.next;
				}
				
				
			}
		}
		void searchList(int key)
		{
			if(root == null)
			{
				System.out.println("Empty List");
			}
			else
			{
				Node t = root;
				while(t != null && key!= t.data)
				{
					
					t= t.next;
				}
				if(t == null)
				{
					System.out.println("Keys not found");
				}
				else
				{
					System.out.println("Key found");
				}
			}
		}
		void DeleteInBetween(int key)
		{
			if(root == null) // checking if empty
			{
				System.out.println("List Empty");
			}
			else { // when not empty
				Node t = root;
				Node t2 = t;
				while(t.next!=null && key!=t.data )
				{
					t2 = t;
					t =t.next;
				}
				if( t == null)
				{
					System.out.println("key not Found");
				}
				else
				{
					System.out.println("key Found");
					t2.next = t.next;
					
					
				}
			}
		}
		 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        LinearLinkedList linearLinkedList = new LinearLinkedList();

		        int choice; 

		        do {
		            System.out.println("\nMenu:");
		            System.out.println("1. Insert at the Left");
		            System.out.println("2. Delete from the Left");
		            System.out.println("3. Insert at the Right");
		            System.out.println("4. Delete from the Right");
		            System.out.println("5. Print List");
		            System.out.println("6. Search List");
		            System.out.println("0. Exit");

		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter the element to insert at the left: ");
		                    int leftElement = scanner.nextInt();
		                    linearLinkedList.insertLeft(leftElement);
		                    break;
		                case 2:
		                    linearLinkedList.deleteLeft();
		                    break;
		                case 3:
		                    System.out.print("Enter the element to insert at the right: ");
		                    int rightElement = scanner.nextInt();
		                    linearLinkedList.insertRight(rightElement);
		                    break;
		                case 4:
		                    linearLinkedList.deleteRight();
		                    break;
		                case 5:
		                    linearLinkedList.printList();
		                    break;
		                case 6:
		                    System.out.print("Enter the key to search: ");
		                    int key = scanner.nextInt();
		                    linearLinkedList.searchList(key);
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
		
		
}
