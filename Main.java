import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    int t = scan.nextInt();
    int [] tab = new int [80];
    String [] result = new String [80];
    int counter = 0;

    for(int i = 0; i<t; i++){
      tab[i] = scan.nextInt();

      for(int i = 0; i<t; i++)
        while(true){

          int rev_int = change(tab[i]);

          if( rev_int == tab[i]){
            result[i] = "" + rev_int + " " + counter;
            counter = 0;
            break;
          }
          else{
            tab[i] += rev_int;
            counter++;
          }
        }
      
    }
      
    for(int i =0; i<t; i++)
      System.out.println(result[i]);

  }

  public static int change(int number){

    String t_number = String.valueOf(number);
    String new_number = "";

    ArrayList<Character> arr = new ArrayList<Character>();

    for(int i=0; i<t_number.length(); i++){

      arr.add(t_number.charAt(i));
    }
    
    Collections.reverse(arr);

    for(char ch : arr)
      new_number += ch;

    return Integer.parseInt(new_number);
  }
}