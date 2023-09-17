package sort;

public class Execute {
    public static void main(String[] args) {
        int[] arr = {109, 64, 25, 12, 22, 11, -90, 80};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.setArr(arr);
        selectionSort.sort(arr);
        selectionSort.printArray(arr);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.setArr(arr);
        bubbleSort.sort(arr);
        bubbleSort.printArray(arr);

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.setArr(arr);
        insertionSort.sort(arr);
        insertionSort.printArray(arr);

    }
}
