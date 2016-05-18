package svArrays;

/**
 * Created by Sviatoslav Potaychuk on 27.04.2016.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();

    }
}
