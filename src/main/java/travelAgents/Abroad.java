package travelAgents;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Abroad extends Booking {
    
    String depAir;
    String retAir;
    int fNum;
    
    Abroad()
    {
        super();
        depAir = "";
        retAir = "";
        fNum = 0;
    }
    
    Abroad(String da, String ra, int fn, String dest, int pn, int np, int p, String sd, String ed, int night)
    {
       super(dest, pn, np, p, sd, ed, night);
       depAir = da;
       retAir = ra;
       fNum = fn;
       
       FileWriter fw = null;
       PrintWriter pw = null;
    try {
        fw = new FileWriter("Abroad.txt", true);
        pw = new PrintWriter(fw);

    pw.write(da + ", " + ra + ", " + fn + ", " 
            + dest + "," + pn + ", " + np + ", " 
            + p + ", " + sd + ", " + ed + ", " + night);
        pw.println();
        pw.close();
        fw.close();
    } catch (IOException ex) {
        Logger.getLogger(Cruise.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    String getDepAir() { return depAir; }
    void setDepAir(String dai) { depAir = dai; }
    
    String getRetAir() { return retAir; }
    void setRetAir(String rai) { retAir = rai; }
    
    int getFNum() { return fNum; }
    void setFNum(int fnu) { fNum = fnu; }
}