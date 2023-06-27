package Java_Basics_01;

import java.util.Arrays;

public class Java_18_2D_Arrays {
    public static void main(String[] args) {

        // method 1 : pre-filled array
        int[][] array_2d_1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(array_2d_1));

        int[][] array_2d_2 = new int[2][3];

        // method 2 : empty array
        array_2d_2[0][0] = 1;
        array_2d_2[0][1] = 2;
        array_2d_2[0][2] = 3;
        array_2d_2[1][0] = 4;
        array_2d_2[1][1] = 5;
        array_2d_2[1][2] = 7;

        System.out.println(Arrays.deepToString(array_2d_2));

        for (int i = 0; i< array_2d_1.length; i++) {
            for (int j = 0; j < array_2d_1[i].length; j++) {
                System.out.println(array_2d_1[i][j]);
            }
        }

    }
}
