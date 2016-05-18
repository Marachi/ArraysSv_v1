package svArrays;

/**
 * Created by Sviatoslav Potaychuk on 27.04.2016.
 */
 class Model {

    /**
     * It's Bubble sort
     * @param arr it's array witch will be sorted
     */
     void bubbleSort(int[] arr) {
        boolean swapped;
        int temp;
        do {
            swapped = false;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while(swapped);
    }
    /**
     * It's Shaker sort
     * @param arr it's array witch will be sorted
     */
     void shackerSort(int[] arr){
        int b = 0;
        int left = 0;
        int right = arr.length - 1;
        while(left<right)
        {
            for (int i = left; i < right; i++){
                if (arr[i] > arr[i + 1])
                {
                    b = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = b;
                    b= i;
                }
            }
            right = b;
            if (left >= right){
                break;
            }
            for (int i = right; i > left; i--){
                if (arr[i-1] > arr[i]){
                    b = arr[i];
                    arr[i] = arr[i-1];
                    arr[i -1] = b;
                    b = i;
                }
            }
            left = b;
        }
    }

    /**
     * It's Odd-Even sort
     * @param arr it's array witch will be sorted
     */
    void oddEvenSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // (i % 2) ? 0 : 1 returns 1, if it's even, 0 if odd
            for (int j = ( (i % 2==0) ? 0 : 1 ); j < arr.length - 1; j += 2) {
                if (arr[j] > arr[j + 1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    /**
     * It's Comb sort
     * @param arr it's array witch will be sorted
     */
     void combSort(int[] arr) {
        int gap = arr.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int) (gap / 1.247330950103979);

            int i = 0;
            swapped = false;
            while (i + gap < arr.length) {
                if (arr[i]>arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    swapped = true;
                }
                i++;
            }
        }
    }

    /**
     * It's Insertion sort
     * @param arr it's array witch will be sorted
     */
    void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int currElem = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey] > currElem){
                arr[prevKey+1] = arr[prevKey];
                prevKey--;
            }
            arr[prevKey+1] = currElem;
        }
    }

    /**
     * It's Merge sort
     * @param arr it's array witch will be sorted
     */
    void mergeSort(int[] arr){
        mergeSort(arr,0,arr.length);

    }

    /**
     * This recursive method which produces Merge sorting
     * @param arr it's array witch will be sorted
     * @param start it's index from witch arr will be sorted
     * @param end it's it's index to witch arr will be sorted
     */
    private void mergeSort(int[] arr, int start, int end) {
        if (start + 1 < end) {
            int mid = (start + end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid, end);

            int size = end - start;
            int[] b = new int[size];
            int i = start;
            int j = mid;
            for (int k = 0; k < size; k++) {
                if (j >= end || i < mid && arr[i] < arr[j]) {
                    b[k] = arr[i++];
                } else {
                    b[k] = arr[j++];
                }
            }
            System.arraycopy(b, 0, arr, start, size);
        }

    }

    /**
     * It's Quick sort
     * @param arr it's array witch will be sorted
     */
     void quickSort(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        doQuickSort(arr, startIndex, endIndex);
    }

    /**
     * This recursive method which produces Quick sorting
     * @param arr it's array witch will be sorted
     * @param start it's index from arr will be sorted
     * @param end it's it's index to arr will be sorted
     */
    private void doQuickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (arr[i] <= arr[cur])) {
                i++;
            }
            while (j > cur && (arr[cur] <= arr[j])) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doQuickSort(arr,start, cur);
        doQuickSort(arr,cur+1, end);
    }
}
