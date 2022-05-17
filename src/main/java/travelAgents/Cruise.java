package travelAgents;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cruise extends Booking{

  String depPort;
  String retPort;
  String cabin; //internal or seaView
  
  Cruise()
  {
    super();
    cabin = "";
    depPort = "";
    retPort = "";
  }
  //(cabin, depPort, retPort, ppn, numPeople, price, startDate, endDate, numNights )
  Cruise(String c, String dp, String rp, String dest, int pn, int np, int p, String sd, String ed, int night)
  {
    super(dest, pn, np, p, sd, ed, night);
    cabin = c;
    depPort = dp;
    retPort = rp;
    
    FileWriter fw = null;
    PrintWriter pw = null;
    try {
        fw = new FileWriter("Cruises.txt", true);
        pw = new PrintWriter(fw);

    pw.write(c + ", " + dp + ", " + rp + ", " 
            + dest + "," + pn + ", " + np + ", " 
            + p + ", " + sd + ", " + ed + ", " + night);
        pw.println();
        pw.close();
        fw.close();
    } catch (IOException ex) {
        Logger.getLogger(Cruise.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  String getCabin() { return cabin; }
  void setCabin(String ca) { cabin = ca;}
  
  String getDepPort() { return depPort; }
  void setDepPort(String de) { depPort = de; }
  
  String getRetPort() { return retPort; }
  void setRetPort(String re) { retPort = re; }
  
}