
import java.io.*;
import java.util.*;


class SieveOfEratosthenes {
    boolean prime[];
    public SieveOfEratosthenes(int n){
        n++;
        prime = new boolean[n+1];

        for(int i=0;i<n;i++) 
            prime[i] = true; 
    
        for(int p = 2; p*p <=n+1; p++){ 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true){ 
                // Update all multiples of p 
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
    }
    
    public boolean isPrime(int n){
        return prime[n];
    }
}

public class PrimeChecker {

    public static void main(String[] args)  throws IOException{
        File file = new File(args[0]);
        Scanner sc = new Scanner(file);
        List<Integer> numbers = new LinkedList<>();

        int max = Integer.MIN_VALUE;
        while(sc.hasNext()){
            int temp = sc.nextInt();
            if(max < temp)
                max = temp;
            numbers.add(temp);
        }

        SieveOfEratosthenes soe = new SieveOfEratosthenes(max);
        for (int i : numbers){
            if(soe.isPrime(i)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
