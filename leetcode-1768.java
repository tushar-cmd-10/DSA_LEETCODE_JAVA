class Solution {
    public String mergeAlternately(String word1, String word2) {
    int n = word1.length();
    int m = word2.length();
    String s = "";
    int i=0,j=0;
    if(m==n){
        while(i<m){
        s = s + word1.charAt(i++);
        s = s + word2.charAt(j++);
        }
    }
    if(m>n){
        while(i<n){
        s = s + word1.charAt(i++);
        s = s + word2.charAt(j++);
        }
        while(j<m){
            s = s + word2.charAt(j++);
        }
    }
    if(m<n){
        while(j<m){
        s = s + word1.charAt(i++);
        s = s + word2.charAt(j++);
        }
        while(i<n){
            s = s + word1.charAt(i++);
        }
    }
    return s;
    }
}
