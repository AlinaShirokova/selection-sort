public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{68, -11, 6, -28, 98, -48, 62, 5, -88, 15};
        SelectionSort.selectionSort(nums);
        System.out.println("Result: ");
        System.out.println(SelectionSort.toString(nums));
    }
}