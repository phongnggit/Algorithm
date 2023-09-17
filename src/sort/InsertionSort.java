package sort;

public class SelectionSort extends General {
    public SelectionSort() {
        super(SelectionSort.class.getName());
    }

    void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            this.swap(i, minIndex);
        }
    }
}

