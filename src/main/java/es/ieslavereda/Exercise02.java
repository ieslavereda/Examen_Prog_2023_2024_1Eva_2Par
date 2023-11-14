package es.ieslavereda;

import java.util.Arrays;

public class Exercise02 {

    public static void main(String[] args) {
        int[][] nums = new int[4][5];
        fillMatrix(nums);
        System.out.println(showMatrix(nums));
        System.out.println(Arrays.toString(primeNumbers(nums)));
    }

    public static void fillMatrix(int[][] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = (int)(Math.random()*100);
            }
        }
    }

    public static String showMatrix(int[][] nums){
        String result="";
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if(nums[i][j]/10==0)
                    result += "0" + nums[i][j] + "\t";
                else
                    result += nums[i][j] + "\t";
            }
            result += "\n";
        }
        return result;
    }

    public static int[] primeNumbers(int[][] nums){
        int[] allPrimes = new int[nums.length * nums[0].length];
        int size=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if(isPrime(nums[i][j])){
                    allPrimes[size++] = nums[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(allPrimes));
        return removeDuplicates(allPrimes);

    }

    private static boolean isPrime(int i) {
        int j=i-1;
        if(i==0 || i==1)
            return false;
        while(j>=2){
            if(i%j==0)
                return false;
            j--;
        }
        return true;
    }

    private static int[] copyOfArray(int[] array, int size){
        int[] aux = new int[size];
        for (int i = 0; i < size; i++) {
            aux[i] = array[i];
        }
        return aux;
    }

    private static int[] removeDuplicates(int[] array){
        int[] aux = new int[array.length];
        int size = 0;

        for (int j = 0; j < aux.length; j++) {
            int i=j+1;
            boolean found = false;
            while(i<array.length && !found){
                if(array[i]==array[j])
                    found=true;
                i++;
            }
            if (!found)
                aux[size++] = array[j];
        }
        return copyOfArray(aux,--size);
    }

}
