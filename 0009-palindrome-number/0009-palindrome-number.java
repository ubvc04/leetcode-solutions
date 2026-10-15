class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }

        int y = x;
        int z = 0;
        int digit = 0;
    
        for(int i =0; x>0;i++){
            digit = x%10; 
            z = z*10+digit;
            x = x/10;

        }
        
        if(z == y){
            return true;
        }else{
            return false;
        }

        
    }
}