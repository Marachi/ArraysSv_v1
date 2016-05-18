package svArrays;

import java.util.Random;

/**
 * Created by Sviatoslav Potaychuk on 27.04.2016.
 */
class ArrayGenerator {


    /**
     * This method returns array of randomly generated values
     * @param size sets size of array
     * @return generated array
     */
    int[] generate(int size){
        int a[] = new int[size];
        Random random = new Random();
        for (int i=0; i<a.length; i++){
            a[i]=random.nextInt();
        }
        return a;
    }

    /**
     * This method returns array of simple values
     * from -9 to 9
     * @param size sets size of array
     * @return created array
     */
    int[] generateSimple(int size){
        int a[] = new int[size];
        for (int i=0; i<a.length; i++){
            a[i]=(int)((Math.random()-0.5)*20);
        }
        return a;
    }

    /**
     * This method returns array of simple values
     * from 0 to 9
     * @param size sets size of array
     * @return created array
     */
    int[] generateSimplePositive(int size){
        int a[] = new int[size];
        for (int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*10);
        }
        return a;
    }

    /**
     * This method returns array of simple values
     * from -border to border
     * @param size sets size of array
     * @param maxAbsValue sets max absolute value
     * @return created array
     */
    int[] generateSimple(int size, int maxAbsValue){
        int a[] = new int[size];
        for (int i=0; i<a.length; i++){
            a[i]=(int)((Math.random()-0.5)*maxAbsValue*2);
        }
        return a;
    }

    /**
     * This method returns array of simple values
     * from 0 to border
     * @param size sets size of array
     * @param maxAbsValue sets max absolute value
     * @return created array
     */
    int[] generateSimplePositive(int size, int maxAbsValue){
        int a[] = new int[size];
        for (int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*maxAbsValue);
        }
        return a;
    }



}
