package net.prachit.dsa.numbers;

import java.util.Arrays;
import java.util.Comparator;

public class Numbers {

    public boolean palindrome(int number){

        int temp = number;
        int reverse = 0 ;

        while(temp != 0 ){
            int digit = temp % 10;
            temp = temp / 10;

            reverse = (reverse * 10) + digit;
        }

        return number == reverse;
    }

    public int countPrimes(int range) {
        return ((Long) Arrays.stream(createPrimes(range)).filter(aBoolean -> aBoolean).count()).intValue();
    }

    private Boolean[] createPrimes(int range){

        Boolean[] isPrime = new Boolean[range+1];

        Arrays.fill(isPrime,Boolean.TRUE);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i= 2; i*i <= range ; i ++ ){

            for (int j = i*2; j <= range; j=j+i){
                isPrime[j] = Boolean.FALSE;
            }
        }

        return isPrime;
    }

    public int squareRoot(int number){

        if(number == 1 || number ==0) return number;
        int left = 1 ;


        return root(number,left,number);


    }

    private int root(int number, int left, int right) {
        int mid  = (left  + right) /2;

        if(left > right) return mid;

            if(mid* mid == number){
                return mid;
            }else if(mid * mid < number){
                return root(number,mid+1,right);
            }else{
                return root(number,left,mid-1);
            }

    }

    private static double multiply(double number, int n) {
        double ans = 1.0;
        for(int i = 1;i<=n;i++) {
            ans = ans * number;
        }
        return ans;
    }
    public double nThRoot(int number,int root){
        double eps = 1e-6;

        double lo=1,hi=number,mid;

        while (hi-lo > eps){
            mid = (hi + lo) /2.0;
            if(multiply(mid,root) < number){
                lo = mid;
            }else{
                hi = mid;
            }
        }
        System.out.println(root+"th root of "+ number+" is "+lo);
        return lo;
    }


    public int gcd(int a, int b){

        if(b==0) return a;

        return gcd(b, a%b);
    }

    public int fastPower(int a , int power){

        int result = 1;

        while (power>0){

            if ((power&1) != 0){ // if power is odd

                result = result * a;
            }

            a = a*a;
            power = power >> 1;
        }

        return  result;
    }
}
