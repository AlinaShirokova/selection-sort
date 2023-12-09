public class SelectionSort {

    static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]<nums[minPos]){
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    } //an array of integers nums which is sorted in ascending order

    public static String toString(int[] nums) {
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            s+=nums[i];
            s+=" ";
        }
        return s;    // Вывод подзадачи с указанием эпика
    }
}