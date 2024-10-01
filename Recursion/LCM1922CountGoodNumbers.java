class LCM1922CountGoodNumbers {
    private long modPow(long base, long exp, int mod) {
        long result = 1;
        base = base % mod;
        
        while (exp > 0) {
            if ((exp & 1) == 1) { // If exp is odd, multiply base with result
                result = (result * base) % mod;
            }
            exp = exp >> 1; // Divide exp by 2
            base = (base * base) % mod; // Square the base
        }
        
        return result;
    }
    public int countGoodNumbers(long n) {
        int modVal = (int)Math.pow(10,9) + 7;
        long evenPlaces = 0;
        long oddPlaces = 0;
        if(n%2==0){
            evenPlaces = n/2;
            oddPlaces=n/2;
        }
        else{
            evenPlaces = n/2 + 1;
            oddPlaces = n/2;
        }
       
        long evenPlacePossibilities = modPow(5, evenPlaces, modVal);
        long oddPlacePossibilities = modPow(4, oddPlaces, modVal); 

        System.out.println(evenPlacePossibilities +" "+oddPlacePossibilities);
        

        long cnt = evenPlacePossibilities * oddPlacePossibilities ;

        System.out.println(cnt);
        System.out.println(cnt%modVal);


        return  (int)(cnt % modVal);
        
    }
}