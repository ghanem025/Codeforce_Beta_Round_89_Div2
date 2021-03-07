//Created by Ghanem Ghanem
import java.util.*;
import java.util.Scanner;
import java.lang.String;
import java.io.BufferedInputStream;
public class stringtask{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    word = word.toLowerCase();
 
    word= word.replaceAll("a","");
    word = word.replaceAll("e","");
    word = word.replaceAll("o","");
    word = word.replaceAll("y","");
    word = word.replaceAll("u","");
    word = word.replaceAll("i","");
 
    String result="";
    for(int i=0; i<word.length();i++){
      result=result+'.'+word.charAt(i);
      }
    System.out.println(result);
    }
  }
