import java.util.*;
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int [] arr = new int[26];

       String a = sc.next().toUpperCase();

       int max = -1;
       char st = '?';

       for (int i = 0; i < a.length(); i++) {
           arr[a.charAt(i) - 65]++;
           if(max < arr[a.charAt(i) - 65]) {
               max = arr[a.charAt(i) -65];
               st = a.charAt(i);
           }
           else if(max == arr[a.charAt(i) - 65]) st = '?';
       }
        System.out.println(st);
    }
}