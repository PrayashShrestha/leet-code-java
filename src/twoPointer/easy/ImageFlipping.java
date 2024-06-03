package twoPointer.easy;

import java.util.Arrays;

//832
public class ImageFlipping {
    public static int[][] flipAndInvertImage(int[][] image) {
        int start,end;
        for (int i = 0; i < image.length; i++) {
            start = 0;
            end = image[i].length - 1;
            while (start <= end) {
                if (start == end) {
                    image[i][start] = invert(image[i][start]);
                } else {
                    int temp = image[i][start];
                    image[i][start] = invert(image[i][end]);
                    image[i][end] = invert(temp);
                }
                start++;
                end--;
            }
        }
        return image;
    }

    public static int invert(int num){
        return 1 - num;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
}
