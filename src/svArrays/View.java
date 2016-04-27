package svArrays;

/**
 * Created by Славик on 27.04.2016.
 */
public class View {
    void printIntArray(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    void printInt(int a){
        System.out.println(a);
    }
    void print(Object a){
        System.out.println(a);
    }
}
