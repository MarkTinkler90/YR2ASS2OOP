package travelAgents;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class travelAgents {
    
  public static void main(String[] args) {
    try {
      File cruiseFile = new File("Cruises.txt");
      if (cruiseFile.createNewFile()) {
        System.out.println("File created: " + cruiseFile.getName());
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Cruises.txt", true);
            pw = new PrintWriter(fw);
            pw.write("Cabin Type, Departure port, Return Port, "
                + "Destination, Price Per Night, Number of People, "
                + "Start Date, End Date, Price, Number of Nights");
            pw.println();
            pw.close();
            fw.close();
        } catch (IOException ex) {
        Logger.getLogger(Cruise.class.getName()).log(Level.SEVERE, null, ex);
    }
      } 
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try {
      File UKFile = new File("UK Holidays.txt");
      if (UKFile.createNewFile()) {
        System.out.println("File created: " + UKFile.getName());
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("UK Holidays.txt", true);
            pw = new PrintWriter(fw);
            pw.write("Accomodation Type, Destination, Price Per Night, "
                    + "Number of People, Start Date, End Date, Price, "
                    + "Number of Nights");
            pw.println();
            pw.close();
            fw.close();
            } catch (IOException ex) {
        Logger.getLogger(Cruise.class.getName()).log(Level.SEVERE, null, ex);
    }
      } 
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try {
      File abroadFile = new File("Abroad.txt");
      if (abroadFile.createNewFile()) {
        System.out.println("File created: " + abroadFile.getName());
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Abroad.txt", true);
            pw = new PrintWriter(fw);
            pw.write("Departure Airport, Return Airport, Flight Number, "
                    + "Destination, Price Per Night, Number of People, "
                    + "Start Date, End Date, Price, Number of Nights");
            pw.println();
            pw.close();
            fw.close();
        } catch (IOException ex) {
        Logger.getLogger(Cruise.class.getName()).log(Level.SEVERE, null, ex);
    }
      } 
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      menu();
  }
  
  public static void menu(){
      Scanner menu = new Scanner(System.in);
      System.out.println("Please select an option below\n"
                    + "1. Book Cruise\n"
                    + "2. Book UK Holiday\n"
                    + "3. Book Abroad\n"
                    + "4. Exit");
      int action = menu.nextInt();
      switch (action){
          case 1 -> bookCruises();
          case 2 -> bookUK();
          case 3 -> bookAbroad();
          case 4 -> System.exit(0);
          default -> {
                  System.out.println("Unrecognised response");
                  menu();
                  }
      }
  }
  
  public static void bookCruises(){
      Scanner crus = new Scanner(System.in);
      System.out.println("Cabin Type: ");
      String c = crus.nextLine();
      System.out.println("Departure Port: ");
      String dp = crus.nextLine();
      System.out.println("Return Port: ");
      String rp = crus.nextLine();
      System.out.println("Destination: ");
      String dest = crus.nextLine();
      System.out.println("Price per Night: ");
      int pn = crus.nextInt();
      System.out.println("Number of People: ");
      int np = crus.nextInt();
      String z = crus.nextLine();  //fixes scanner not reading for start date
      System.out.println("Start Date: ");
      String sd = crus.nextLine();
      System.out.println("End Date: ");
      String ed = crus.nextLine();
      System.out.println("Number of Nights: ");
      int night = crus.nextInt();
      z = crus.nextLine();
      int p = pn * np * night;
      System.out.println("Cabin Type: " + c
              + "\nDeparture Port: " + dp
              + "\nReturn Port: " + rp
              + "\nDestination: " + dest
              + "\nPrice Per Night: £" + pn
              + "\nNumber of People " + np
              + "\nStart Date: " + sd
              + "\nEnd Date: " + ed
              + "\nNumber of Nights: " + night
              + "\nTotal Price: £" + p);
      System.out.println("Save this data?(Y/N)");
      String ans = crus.nextLine().toLowerCase();
      if ("y".equals(ans)){
          Cruise cruise = new Cruise(c, dp, rp, dest, pn, np, p, sd, ed, night);
      }
      menu();
  }
  
  public static void bookUK(){
      Scanner uk = new Scanner(System.in);
      System.out.println("Accomodation: ");
      String ac = uk.nextLine();
      System.out.println("Destination: ");
      String dest = uk.nextLine();
      System.out.println("Price per Night: ");
      int pn = uk.nextInt();
      System.out.println("Number of People: ");
      int np = uk.nextInt();
      String z = uk.nextLine();  //fixes scanner not reading for start date
      System.out.println("Start Date: ");
      String sd = uk.nextLine();
      System.out.println("End Date: ");
      String ed = uk.nextLine();
      System.out.println("Number of Nights: ");
      int night = uk.nextInt();
      z = uk.nextLine();
      int p = pn * np * night;
      System.out.println("Accomodation: " + ac
              + "\nDestination: " + dest
              + "\nPrice Per Night: £" + pn
              + "\nNumber of People " + np
              + "\nStart Date: " + sd
              + "\nEnd Date: " + ed
              + "\nNumber of Nights: " + night
              + "\nTotal Price: £" + p);
      System.out.println("Save this data?(Y/N)");
      String ans = uk.nextLine().toLowerCase();
      if ("y".equals(ans)){
          UKBased ukb = new UKBased(ac, dest, pn, np, p, sd, ed, night);
      }
      menu();
      
}
  
  public static void bookAbroad(){
      Scanner abr = new Scanner(System.in);
      System.out.println("Departure Airport: ");
      String da = abr.nextLine();
      System.out.println("Return Airport: ");
      String ra = abr.nextLine();
      System.out.println("Flight Number: ");
      int fn = abr.nextInt();
      String z = abr.nextLine();  //fixes scanner not reading for destination
      System.out.println("Destination: ");
      String dest = abr.nextLine();
      System.out.println("Price per Night: ");
      int pn = abr.nextInt();
      System.out.println("Number of People: ");
      int np = abr.nextInt();
      z = abr.nextLine();
      System.out.println("Start Date: ");
      String sd = abr.nextLine();
      System.out.println("End Date: ");
      String ed = abr.nextLine();
      System.out.println("Number of Nights: ");
      int night = abr.nextInt();
      int p = pn * np * night;
      z = abr.nextLine();
      System.out.println("Departure Airport: " + da
              + "\nReturn Airport: " + ra
              + "\nFlight Number: " + fn
              + "\nDestination: " + dest
              + "\nPrice Per Night: £" + pn
              + "\nNumber of People " + np
              + "\nStart Date: " + sd
              + "\nEnd Date: " + ed
              + "\nNumber of Nights: " + night
              + "\nTotal Price: £" + p);
      System.out.println("Save this data?(Y/N)");
      String ans = abr.nextLine().toLowerCase();
      if ("y".equals(ans)){
          Abroad abroad = new Abroad(da, ra, fn, dest, pn, np, p, sd, ed, night);
      }
      menu();
  }
}