class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+"," ").trim();
        String[] words = s.split(" ");
        String reversed = "";
        for(int i= words.length -1;i>0; i--){
            reversed += words[i] + " ";
        }
        reversed += words[0];
        return reversed;
    }
}