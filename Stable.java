import java.util.ArrayList;

public class Stable {
  ArrayList<Horse> h = new ArrayList<Horse>();
  String address;

  public Stable(){
    
  }
  public void addHorse(Horse horse) {
    h.add(horse);
  }
}