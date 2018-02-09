import java.util.Scanner;

public class PhoneBookTester
{
  public static PhoneBook pb = new PhoneBook();
  public static void main ( String[] args )
  {
    boolean running = true;
    while(running){
      String option = getUserOption();
      switch(option){
        case "add":
          add();
          break;
        case "delete":
          delete();
          break;
        case "quit":
          System.out.println("Goodbye");
          running = false;
          break;
        default:
          search();
      }
    }
  }

  public static void delete(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the name you would like to delete: ");
    System.out.println(pb.delete(scanner.nextLine()));
  }

  public static void add(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Okay, we'll add an entry to the phone book.");
    System.out.print("First name: ");
    String firstName = scanner.nextLine();
    System.out.print("Last name: ");
    String lastName = scanner.nextLine();
    System.out.print("Number: ");
    String phoneNumber = scanner.nextLine();
    System.out.println(pb.add(firstName + " " + lastName, phoneNumber));
  }

  public static void search(){  
    String input = getUserInput();
    if(input.toUpperCase().indexOf("QUIT") != -1){
      System.out.println("Goodbye");
    }else{
      PhoneEntry[] entries = pb.search(input.toUpperCase()); 
      if(entries != null){
        for(int i = 0; i < entries.length; i++){
          System.out.println(entries[i].getName() + ": " + entries[i].getPhone());
        }
      }else{
        System.out.println("No matches found");
      }
    }
  }

  public static String getUserOption(){
    System.out.println("\nWould you like to [search] for a name, [add] an entry, [delete] a listing, or [quit]?");
    System.out.println("Please type your choice (without brackets).");
    Scanner scanner = new Scanner(System.in);
    return scanner.next();
  }

  public static String getUserInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Last name? ");
    String lastName = scanner.nextLine();
    System.out.print("First name? ");
    String firstName = scanner.nextLine();
    return firstName.equals("") ? lastName : firstName + " " + lastName;
  }
}
