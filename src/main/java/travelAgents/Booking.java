package travelAgents;


public class Booking{
  
  String destination;
  int ppn; //price per person per night
  int numPeople;
  int price; //= ppn * numPeople * numnights
  String startDate; 
  String endDate;
  int numNights;

  Booking()
  {
    destination = "";
    ppn = 0;
    numPeople = 0;
    price = 0;
    startDate = "";
    endDate = "";
    numNights = 0;
  }
  //(ppn, numPeople, price, startDate, endDate, numNights )
  Booking(String dest, int pn, int np, int p, String sd, String ed, int night)
  {
    destination = dest;
    ppn = pn;
    numPeople = np;
    price = p;
    startDate = sd;
    endDate = ed;
    numNights = night;
  }
  
  String getDest() { return destination; }
  void getDest(String de) { destination = de; }
  
  int getPPN() { return ppn; }
  void setPPN(int pp) { ppn = pp; }
  
  int getNumPeople() { return numPeople; }
  void setNumbPeople(int pe) { numPeople = pe; }
  
  int getPrice() { return price; }
  void setPrice(int pr) { price = pr; }
  
  String getStartDate() { return startDate; }
  void setStartDate(String st) { startDate = st; }
  
  String getEndDate() { return endDate; }
  void setEndDate(String en) { endDate = en; }
  
  int getNight() { return numNights; }
  void setNight(int ni) { numNights = ni; }

}