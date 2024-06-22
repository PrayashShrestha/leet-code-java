package twoPointer.medium;

// 11
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int highestVolume=0;
        int volume;
        int left = 0, right = height.length - 1;
        while (left < right) {
            volume = Math.min(height[left], height[right]) * (right - left);
            if(height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            }
            else{
                left++;
                right--;
            }
            highestVolume = Math.max(highestVolume, volume);
        }
        return highestVolume;
    }

    public static void main(String[] args) {
        int[] height = {1,2,1};
        System.out.println(new ContainerWithMostWater().maxArea(height));
    }
}
