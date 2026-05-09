class Solution {
    public int rotatedDigits(int n) {
        if(n  == 0 || n == 1) return 0;
      
        int count = 0;
        for(int i = 2; i <= n; i++) {
            int num = i;
            int validDigits = 0;

            while(num != 0) {
                int rem = num % 10;

                if(rem == 3 || rem == 4 || rem == 7) {
                    validDigits = 0;
                    break;
                } else if(rem == 2 || rem == 5 || rem == 6 || rem == 9) validDigits++;

                num /= 10;
            }
            if(validDigits > 0) count++;
        }
        return count;
    }
}
