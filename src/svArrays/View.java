package svArrays;

/**
 * Created by Sviatoslav Potaychuk on 27.04.2016.
 */
class View {

    //constants
    final String BUBBLE_SORT = "Bubble sort: ";
    final String SHAKER_SORT = "Shaker sort: ";
    final String INSERTION_SORT = "Insertion sort: ";
    final String COMB_SORT = "Comb sort: ";
    final String EVEN_ODD_SORT = "Even-odd sort: ";
    final String MERGE_SORT = "Merge sort: ";
    final String QUICK_SORT = "Quick sort: ";
    final String BEFORE_SORT = "Arrary before sort: ";
    final String AFTER_SORT = "Arrary after sort: ";

    //print methods
    void printIntArray(int[] a){
        for (int anA : a) {
            System.out.print(anA + " ");
        }
        System.out.println();
    }
    void print(String a){
        System.out.println(a);
    }
    void split() {
        System.out.println();
    }
}
