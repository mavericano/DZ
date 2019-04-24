package lesson5;

public class Task5_5 {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int[] array =
                {0, 1, 9, 1, 1, 1, 0, 2, 9};
        //      {0, 2, 9, 8, 0, 4, 9};
        //      {0, 2, 3, 9};
        //      {0, 2, 3, 9, 1, 1, 1, 0, 1, 2, 9};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(min + " " + max);
        //min and max found
        int len = 0;
        int stInd = 0;
        int endInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == max) {
                        if(j-i > len){
                            stInd = i + 1;
                            endInd = j - 1;
                            len = j - i - 1;
                        }
                        break;
                    }
                }
            }
            if (array[i] == max) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == min) {
                        if(j - i > len){
                            stInd = i + 1;
                            endInd = j - 1;
                            len = j - i - 1;
                        }
                        break;
                    }
                }
            }
        }

        System.out.println(len);

        for (int i = stInd; i <= endInd; i++) {
            sum+= array[i];
        }
        System.out.println(sum);
    }
}
