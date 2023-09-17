package sort;

public class BubbleSort extends General {
    public BubbleSort() {
        super(BubbleSort.class.getName());
    }

    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) this.swap(j, j + 1);
            }
        }
    }
}

