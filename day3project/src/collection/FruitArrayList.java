package collection;
import java.util.ArrayList;

public class FruitArrayList {
public static void main(String[] args) {
	  ArrayList<String> fruits = new ArrayList<>();
      
      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Cherry");
      fruits.add("Date");
      fruits.add("Elderberry");
      
      System.out.println("Original ArrayList: " + fruits);
      
      fruits.remove(2);
      
      fruits.add(2, "Fig");
      
      System.out.println("Modified ArrayList: " + fruits);
      
      boolean containsBanana = fruits.contains("Banana");
      System.out.println("Contains 'Banana': " + containsBanana);
      
      fruits.clear();
      
      System.out.println("Final ArrayList: " + fruits);
}
}
