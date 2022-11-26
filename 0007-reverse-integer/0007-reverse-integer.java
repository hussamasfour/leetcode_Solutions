class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        char[] ar = s.toCharArray();
        long result = 0;
        if(ar[0] == '-'){
            for(int i = ar.length-1;i>0;i--){
                result = result * 10 + (ar[i] -'0');    
            }
            result *= -1;
        
        }else{
            for(int i = ar.length-1;i>=0;i--){
                result = result * 10 + (ar[i] -'0');
            } 
        }
    
        if(result > Integer.MAX_VALUE || result <Integer.MIN_VALUE){
          return 0;
        }
        return (int) result;
    }
}