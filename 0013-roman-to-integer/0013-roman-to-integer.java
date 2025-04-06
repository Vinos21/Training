import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int[] romannumber=new int[128];
        romannumber['I']=1;
        romannumber['V']=5;
        romannumber['X']=10;
        romannumber['L']=50;
        romannumber['C']=100;
        romannumber['D']=500;
        romannumber['M']=1000;

        int total=0;
        int length=s.length();
        for(int i=0;i<s.length();i++){
            if(i+1 < length && romannumber[s.charAt(i)] < romannumber[s.charAt(i+1)]){
                total -=romannumber[s.charAt(i)];
            }else{
                total +=romannumber[s.charAt(i)];
            }
        }
        return total;

        
    }
    public static void main(String [] args){
        Solution solution = new Solution();
         System.out.print(solution.romanToInt("III"));
    }
}