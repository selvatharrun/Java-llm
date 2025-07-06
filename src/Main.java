//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import Data.DataReader;
import Data.Image;



public class Main {
    public static void main(String[] args) {
        String path = "/home/selva/IdeaProjects/javallm/data/mnist_test.csv";

        List<Image> lst = new DataReader().readData(path);

        System.out.println(lst.get(0));
    }
}