
import java.util.*;
public class DeletiveEditing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while (k-->0) {
           String s=sc.next();
           String t=sc.next();
           int freq[]=new int[26];
           for(char c:t.toCharArray()){
                freq[c-'A']++;
           }
           StringBuilder res=new StringBuilder();
           for(int i=s.length()-1;i>=0;i--){
                if(freq[s.charAt(i)-'A']>=1){
                    res.append(s.charAt(i));
                    freq[s.charAt(i)-'A']--;
                }
           }
           res.reverse();
           if(res.toString().equals(t))System.out.println("YES");
           else System.out.println("NO");

        }
        sc.close();
    }
}