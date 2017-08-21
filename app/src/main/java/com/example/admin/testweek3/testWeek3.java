package com.example.admin.testweek3;


public class testWeek3 {
    public static void main(String[] args) {
        int[] input = {2, 8, 9, 3, 4, 3, 2, 6, 6, 2, 4, 9, 8};
        System.out.println("Order output: ");
        sortArray(input);
        String line = "frog";
        stringsAll(line);

    }

    public static void sortArray(int[] ints) {
        int temp;
        for (int j = 0; j < ints.length; j++) {
            for (int i = 0; i < ints.length - 1; i++) {
                if (ints[i + 1] <= ints[i]) {
                    temp = ints[i];
                    ints[i] = ints[i +1 ];
                    ints[i +1] = temp;
                }
            }
            System.out.println(ints[j]);
        }
    }

    private static void stringsAll(String word) {
        String[] array = word.split("");
        String newWord = "";
//
//        for(int j = 0 ; j < array.length ; j++ )
//        {
//            for(int i = 1 ; i <= array.length - j ; i++ )
//            {
//                newWord = newWord.substring(j,1);
//                System.out.println(newWord);
//            }
//        }
        for (int k = 0; k < array.length; k++) {
            newWord = newWord + array[k];
            System.out.println(newWord );
        }
    }
}
