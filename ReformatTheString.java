class Solution {
    public String reformat(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sa = new StringBuilder();
        StringBuilder sc = new StringBuilder();

        char[] arr  = s.toCharArray();
        int countL = 0;
        int countN = 0;
        for(char ele : arr){
            if(Character.isLetter(ele)){
                 countL++;
                 sb.append(ele);
                 }

            else {
                countN++;
                sa.append(ele);
            }
        }
        if(countL-countN!=0 && countL-countN!=-1 && countL-countN!=1){
            return "";
        }
        
        if(sb.length()>sa.length()){
            int i=0,j=0;
            while(i<sa.length()){
                sc.append(sb.charAt(i));
                sc.append(sa.charAt(j));
                i++;j++;
            }
            sc.append(sb.charAt(i));
        }
        else if(sb.length()<sa.length()){
            int i=0,j=0;
            while(i<sb.length()){
                sc.append(sa.charAt(i));
                sc.append(sb.charAt(j));
                i++;j++;
            }
            sc.append(sa.charAt(j));
        }
        else{
            int i=0,j=0;
            while(j<sa.length()){
                sc.append(sa.charAt(i));
                sc.append(sb.charAt(j));
                i++;j++;
            }
        }
        return sc.toString();

    }
}