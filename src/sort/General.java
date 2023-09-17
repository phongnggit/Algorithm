package sort;

public class General {
    private int[] arr;

    public String nameSort;

    public General(int[] arr) {
        this.arr = arr;
    }

    public General(String nameSort) {
        this.nameSort = nameSort;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    void swap(int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

    void printArray(int[] arr) {
        System.out.println("Sorted array with " + nameSort);
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
