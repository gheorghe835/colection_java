package buble;

public class Buble {
    public static void main(String[] args) {
        int numbers[] = {99,-10,100123,18,-978,5623,463,-9,287,49};
        int  temp;
        System.out.println("  Sirul de numere :: " );
        for (int i = 0; i < numbers.length; i++){
            System.out.print("  " + numbers[i]);
        }
        for(int i = 1; i < numbers.length; i++){
            for (int j = numbers.length-1; j >= i; j--){
                if(numbers[j-1] > numbers[j]){
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("  \nSortarea buble :: ");
        System.out.println("  Sirul sortat :: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print("  " + numbers[i]);
        }
    }
}
