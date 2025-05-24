import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        String text = "Tallal";

        HashMap<Character,Integer> charCount = new HashMap<>();

        for(char ch : text.toCharArray()){
            if(charCount.containsKey(ch)){
                charCount.put(ch,  charCount.get(ch) + 1);
            }else{
                charCount.put(ch,1);
            }
        }

        for(char key : charCount.keySet()){
            System.out.println("Character: "+ key +", Count: "+ charCount.get(key));
        }
    }
}
