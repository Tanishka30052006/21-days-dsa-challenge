class Solution {
    public boolean isPalindrome(int x) {
     if (x<0){
        return false;

     }  
     int reverse =0;
     int orignal= x;

     while(x!=0){
        reverse = reverse*10 + x%10;
        x= x/10;
     }  
     return orignal == reverse ;
    }
     public static void main(String[] args) {
        Solution sol = new Solution();
        
       
        System.out.println(sol.isPalindrome(121));    
          }
   }