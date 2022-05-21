import java.util.*;

public class Javanais {
  
  public static void main(String[] args){
    String result1 = translateToJav("the quick brown fox jumps over a lazy dog");
    String result2 = translateToJav("sphynx");
    String result3 = translateToJav("bookkeeping");
    String result4 = translateToJav("ShEEP a");
    String result5 = translateToJav("/?d&@.");

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);

  }

  public static String translateToJav(String str) {
   // Create an ArrayList object
    ArrayList<String> vowelsArrayList = new ArrayList<String>(); 
    // add the specified element to specified Collections
    // using addAll() method
    boolean b = Collections.addAll(vowelsArrayList, "a", "e", "i", "o", "u", "A", "E", "I", "O", "U");
    // vowelsArrayList.add("a");
    // vowelsArrayList.add("e");
    // vowelsArrayList.add("i");
    // vowelsArrayList.add("o");
    // vowelsArrayList.add("u");
    // vowelsArrayList.add("A");
    // vowelsArrayList.add("E");
    // vowelsArrayList.add("I");
    // vowelsArrayList.add("O");
    // vowelsArrayList.add("U");
   
    // Create an ArrayList object
    ArrayList<String> lettersArrayList = new ArrayList<String>(); 
    // Add letters of input string to ArrayList object
    
    for(int i = 0; i < str.length(); i++){
      lettersArrayList.add(String.valueOf(str.charAt(i)));
    }
    
    // Create an ArrayList object for the output
    ArrayList<String> javanaisArrayList = new ArrayList<String>(); 
        
    // For each element in the input list
    for (int i = 0; i < lettersArrayList.size(); i++) {
      // if the element is in the vowels list and the preceding element isn't in the vowels list
      // then add "av" and the element to the new javanais list 
      if (vowelsArrayList.contains(lettersArrayList.get(i)) && !vowelsArrayList.contains(lettersArrayList.get(i-1)) ) {
        javanaisArrayList.add("av");
        javanaisArrayList.add(lettersArrayList.get(i));
      } else {
        javanaisArrayList.add(lettersArrayList.get(i));
      }
    }
    // System.out.println(String.join("", lettersArrayList));
    // System.out.println(String.join("", vowelsArrayList));
    String result = String.join("", javanaisArrayList);
    return result;
  }
}



