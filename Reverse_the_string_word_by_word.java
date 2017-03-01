public class Solution {
    public String reverseWords(String s) {
        if(s==null|| s.length()==0) return "";
        String[] array = s.split("\\s+");
        int length=array.length;
        StringBuilder sb= new StringBuilder();
        int i= length-1;
        while(i>=0)
        {
            if(array[i]=="  ") break;
            sb= sb.append(array[i]);
            sb.append(" ");
            i--;
        }
        return sb.toString().trim();
    }
}