class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for(String word: words){
            int[] freqMap = new int[26];
            for(char c: word.toCharArray()){
                freqMap[c - 'a']++;
            }
            for(int i = 0; i < 26; i++){
                minFreq[i] = Math.min(minFreq[i], freqMap[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            while(minFreq[i]-- > 0){
                result.add(String.valueOf((char)(i + 'a')));
            }
        }
        return result;
    }
}