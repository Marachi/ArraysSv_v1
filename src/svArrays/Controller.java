package svArrays;

/**
 * Created by Sviatoslav Potaychuk on 27.04.2016.
 */
class Controller {
    private Model model;
    private View view;
    Controller(Model model, View view){
        this.model = model;
        this.view=view;
    }

     void  processUser(){

        ArrayGenerator ag = new ArrayGenerator();

         //bubbleSort
         int [] a = ag.generateSimplePositive(30,20);
         view.print(view.BUBBLE_SORT);
         view.print(view.BEFORE_SORT);
         view.printIntArray(a);
         model.bubbleSort(a);
         view.print(view.AFTER_SORT);
         view.printIntArray(a);
         view.split();

         //shackerSort
         view.print(view.SHAKER_SORT);
         view.print(view.BEFORE_SORT);
         int [] b = ag.generateSimplePositive(30,20);
         view.printIntArray(b);
         model.shackerSort(b);
         view.print(view.AFTER_SORT);
         view.printIntArray(b);
         view.split();

         //oddEvenSort
         view.print(view.EVEN_ODD_SORT);
         view.print(view.BEFORE_SORT);
         int [] c = ag.generateSimplePositive(30,20);
         view.printIntArray(c);
         model.oddEvenSort(c);
         view.print(view.AFTER_SORT);
         view.printIntArray(c);
         view.split();

         //combSort
         view.print(view.COMB_SORT);
         view.print(view.BEFORE_SORT);
         int [] d = ag.generateSimplePositive(30,20);
         view.printIntArray(d);
         model.combSort(d);
         view.print(view.AFTER_SORT);
         view.printIntArray(d);
         view.split();

         //insertionSort
         view.print(view.INSERTION_SORT);
         view.print(view.BEFORE_SORT);
         int [] e = ag.generateSimplePositive(30,20);
         view.printIntArray(e);
         model.insertionSort(e);
         view.print(view.AFTER_SORT);
         view.printIntArray(e);
         view.split();

         //mergeSort
         view.print(view.MERGE_SORT);
         view.print(view.BEFORE_SORT);
         int [] f = ag.generateSimplePositive(30,20);
         view.printIntArray(f);
         model.mergeSort(f);
         view.print(view.AFTER_SORT);
         view.printIntArray(f);
         view.split();

         //quickSort
         view.print(view.QUICK_SORT);
         view.print(view.BEFORE_SORT);
         int [] g = ag.generateSimplePositive(30,20);
         view.printIntArray(g);
         model.quickSort(g);
         view.print(view.AFTER_SORT);
         view.printIntArray(g);



    }



}


