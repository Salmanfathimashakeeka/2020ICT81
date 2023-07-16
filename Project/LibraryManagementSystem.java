import java.util.ArrayList; 
 import java.util.List; 
  
 abstract class LibraryItem { 
     private String title; 
     private String itemID; 
     private boolean checkedOut; 
  
     public LibraryItem(String title, String itemID) { 
         this.title = title; 
         this.itemID = itemID; 
         this.checkedOut = false; 
     } 
  
     public void checkOut() { 
         if (!checkedOut) { 
             checkedOut = true; 
             System.out.println(title + " has been checked out."); 
         } else { 
             System.out.println(title + " is already checked out."); 
         } 
     } 
  
     public void checkIn() { 
         if (checkedOut) { 
             checkedOut = false; 
             System.out.println(title + " has been checked in."); 
         } else { 
             System.out.println(title + " is already checked in."); 
         } 
     } 
  
     public void displayItemDetails() { 
         System.out.println("Title: " + title); 
         System.out.println("Item ID: " + itemID); 
         System.out.println("Checked Out: " + (checkedOut ? "Yes" : "No")); 
     } 
 } 
  
 class Book extends LibraryItem { 
     private String author; 
     private int numPages; 
  
     public Book(String title, String itemID, String author, int numPages) { 
         super(title, itemID); 
         this.author = author; 
         this.numPages = numPages; 
     } 
  
     public void displayItemDetails() { 
         super.displayItemDetails(); 
         System.out.println("Author: " + author); 
         System.out.println("Number of Pages: " + numPages); 
     } 
 } 
  
 class Magazine extends LibraryItem { 
     private String issueDate; 
     private String publisher; 
  
     public Magazine(String title, String itemID, String issueDate, String publisher) { 
         super(title, itemID); 
         this.issueDate = issueDate; 
         this.publisher = publisher; 
     } 
  
     public void displayItemDetails() { 
         super.displayItemDetails(); 
         System.out.println("Issue Date: " + issueDate); 
         System.out.println("Publisher: " + publisher); 
     } 
 } 
  
 class LibraryMember { 
     private String memberID; 
     private String name; 
  
     public LibraryMember(String memberID, String name) { 
         this.memberID = memberID; 
         this.name = name; 
     } 
  
     public void displayMemberDetails() { 
         System.out.println("Member ID: " + memberID); 
         System.out.println("Name: " + name); 
     } 
 } 
  
 public class LibraryManagementSystem { 
     public static void main(String[] args) { 
         // Create 5 objects of the Book class 
         Book book1 = new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240); 
         Book book2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281); 
         Book book3 = new Book("1984", "B003", "George Orwell", 328); 
         Book book4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432); 
         Book book5 = new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320); 
  
         // Create 5 objects of the Magazine class 
         Magazine magazine1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society"); 
         Magazine magazine2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC"); 
         Magazine magazine3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media"); 
         Magazine magazine4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast"); 
         Magazine magazine5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition"); 
  
         // Create 5 objects of the LibraryMember class 
         LibraryMember member1 = new LibraryMember("L001", "John Doe"); 
         LibraryMember member2 = new LibraryMember("L002", "Jane Smith"); 
         LibraryMember member3 = new LibraryMember("L003", "David Johnson"); 
         LibraryMember member4 = new LibraryMember("L004", "Sarah Williams"); 
         LibraryMember member5 = new LibraryMember("L005", "Michael Brown"); 
  
         // Set the properties of the objects using appropriate setter methods 
  
         // Perform check-out and check-in operations on one library item 
         book1.checkOut(); 
         book1.checkIn(); 
  
         // Display the details of all the library items and library members 
         List<LibraryItem> libraryItems = new ArrayList<>(); 
         libraryItems.add(book1); 
         libraryItems.add(book2); 
         libraryItems.add(book3); 
         libraryItems.add(book4); 
         libraryItems.add(book5); 
         libraryItems.add(magazine1); 
         libraryItems.add(magazine2); 
         libraryItems.add(magazine3); 
         libraryItems.add(magazine4); 
         libraryItems.add(magazine5); 
  
         System.out.println("Library Items:"); 
         for (LibraryItem item : libraryItems) { 
             item.displayItemDetails(); 
             System.out.println(); 
         } 
  
         List<LibraryMember> libraryMembers = new ArrayList<>(); 
         libraryMembers.add(member1); 
         libraryMembers.add(member2); 
         libraryMembers.add(member3); 
         libraryMembers.add(member4); 
         libraryMembers.add(member5); 
  
         System.out.println("Library Members:"); 
         for (LibraryMember member : libraryMembers) { 
             member.displayMemberDetails(); 
             System.out.println(); 
         } 
     } 
 }
 
 /*
 Microsoft Windows [Version 10.0.22000.1455]
(c) Microsoft Corporation. All rights reserved.

C:\Users\94741\Desktop\Project>javac LibraryManagementSystem.java

C:\Users\94741\Desktop\Project>java LibraryManagementSystem
The Catcher in the Rye has been checked out.
The Catcher in the Rye has been checked in.
Library Items:
Title: The Catcher in the Rye
Item ID: B001
Checked Out: No
Author: J.D. Salinger
Number of Pages: 240

Title: To Kill a Mockingbird
Item ID: B002
Checked Out: No
Author: Harper Lee
Number of Pages: 281

Title: 1984
Item ID: B003
Checked Out: No
Author: George Orwell
Number of Pages: 328

Title: Pride and Prejudice
Item ID: B004
Checked Out: No
Author: Jane Austen
Number of Pages: 432

Title: The Hobbit
Item ID: B005
Checked Out: No
Author: J.R.R. Tolkien
Number of Pages: 320

Title: National Geographic
Item ID: M001
Checked Out: No
Issue Date: August 2023
Publisher: National Geographic Society

Title: Time
Item ID: M002
Checked Out: No
Issue Date: September 2023
Publisher: Time USA, LLC

Title: Forbes
Item ID: M003
Checked Out: No
Issue Date: June 2023
Publisher: Forbes Media

Title: Vogue
Item ID: M004
Checked Out: No
Issue Date: July 2023
Publisher: Condé Nast

Title: Sports Illustrated
Item ID: M005
Checked Out: No
Issue Date: July 2023
Publisher: Maven Coalition

Library Members:
Member ID: L001
Name: John Doe

Member ID: L002
Name: Jane Smith

Member ID: L003
Name: David Johnson

Member ID: L004
Name: Sarah Williams

Member ID: L005
Name: Michael Brown


C:\Users\94741\Desktop\Project>
 */