package travelAgents;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UKBased extends Booking {
    
    String accom; //accommodation
    
    UKBased()
    {
        super();
        accom = "";
    }
    
    UKBased(String ac, String dest, int pn, int np, int p, String sd, String ed, int night)
    {
        super(dest, pn, np, p, sd, ed, night);
        accom = ac;
        
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("UK Holidays.txt", true);
            pw = new PrintWriter(fw);

            pw.write(ac + ", " + dest + "," + pn + ", " + np + ", " + p 
                    + ", " + sd + ", " + ed + ", " + night);
            pw.println();
            pw.close();
            fw.close();
            } catch (IOException ex) {
        Logger.getLogger(Cruise.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    
    String getAccom() { return accom; }
    void setAccom(String ac) { accom = ac; }
}
