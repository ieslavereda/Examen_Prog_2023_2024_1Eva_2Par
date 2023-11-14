package es.ieslavereda;

public class Exercise01 {
    public static void main(String[] args) {
        //to be tested in JUnit
        System.out.println(count55("555"));
        System.out.println(count55itera("55abc55"));
        System.out.println(array73(new int[]{1, 2, 73}, 0));
        System.out.println(array73itera(new int[]{1, 2, 73}, 0));
    }

    public static int count55(String str) {
        if(str.length() <= 1)
            return 0;
        if(str.substring(0,2).equals("55"))
            return 1+ count55(str.substring(2));
        return 0+ count55(str.substring(1));
    }

    public static int count55itera(String str) {
        int sum = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i,i+2).equals("55")){
                sum++;
                i++;
            }
        }
        return sum;
    }

    public static int array73(int[] nums, int index) {
        if (index>=nums.length)
            return 0;

        if (nums[index]==73)
            return 1+array73(nums,++index);

        return array73(nums,++index);

    }

    public static int array73itera(int[] nums, int index) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==73)
                sum++;
        }
        return sum;
    }


}