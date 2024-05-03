import java.util.Arrays;
public class Anagram {
    public static void main (String args[]){
        String s = "cuceta";
        String t = "cacetu";
        
        System.out.println(isAnagram(s,t));
    }
    
    // SORTING DE NOVO (TOMA ENTAO)
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        
        return Arrays.equals(string1, string2);
    }
}