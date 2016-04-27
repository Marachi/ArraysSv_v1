package svArrays;

import java.util.Random;

class Model implements ArraysForHomework{


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
     * from -10 to 10
     * @param size sets size of array
     * @return created array
     */
    int[] generateSimple(int size){
        int a[] = new int[size];
        for (int i=0; i<a.length; i++){
            a[i]=(int)((Math.random()-0.5)*10);
        }
        return a;
    }

    /**
     * This method returns array of simple values
     * from -border to border
     * @param size sets size of array
     * @param border sets range
     * @return created array
     */
    int[] generateSimple(int size, int border){
        int a[] = new int[size];
        for (int i=0; i<a.length; i++){
            a[i]=(int)((Math.random()-0.5)*border);
        }
        return a;
    }

    @Override
    public long arraySum(int[] a) {
        long sum = 0;
        for (int i:a){
            sum +=a[i];
        }
        return sum;
    }

    @Override
    public int maxElement(int[] a) {
        int max = a[0];
        for (int i:a){
            if (a[i]>max){
                max=a[i];
            }
        }
        return max;
    }

    @Override
    public int minElement(int[] a) {
        int min = a[0];
        for (int i:a){
            if (a[i]<min){
                min=a[i];
            }
        }
        return min;
    }

    @Override
    public double mediumValue(int[] a) {
        long sum = 0;
        for (int i:a){
            sum +=a[i];
        }
        return sum/a.length;
    }

    @Override
    public int countOfEqualElements(int a) {
        return 0;
    }

    @Override
    public int countOfZeroElements(int a) {
        return 0;
    }

    @Override
    public int countOfPositiveElements(int a) {
        return 0;
    }

    @Override
    public void multArray(int[] array, int mult) {

    }

    @Override
    public void addIndexToValeu(int[] a) {

    }

}
