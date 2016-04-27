package svArrays;

import com.sun.org.apache.xpath.internal.operations.Mod;

/**
 * Created by Славик on 27.04.2016.
 */
public class Controller {
    private Model model;
    private View view;
    Controller(Model model, View view){
        this.model=model;
        this.view=view;
    }

    public  void  processUser(){
//        int[] a = model.generate(20);
//        view.printIntArray(a);
        int []b=model.generateSimple(5,10);
        view.printIntArray(b);
        view.print(model.arraySum(b));
        view.printInt(model.maxElement(b));
        view.printInt(model.minElement(b));
    }



}
