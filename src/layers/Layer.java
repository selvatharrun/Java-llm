package layers;

import java.util.ArrayList;

public class Layer {

    protected Layer _prevlayer_;
    protected Layer _nextLayer_;

    //we use polymorphism.
    public abstract double[][] getOutPut(List<double[][]> input){}
    public abstract double[] getOutPut(double[] input){}

    //polymorphism again
    public abstract void backPropagation(double[] dLdO){}
    public abstract void backPropagation(double[] dLdO){}

    //converts vector2matrix
    public double[] matrix2vec(List<double[][]> input){

        int length = input.size();
        int rows = input.get(0).length;
        int cols = input.get(0)[0].length;

        double[] vectors = new double[length*rows*cols];
        int index =0;

        for(int i=0;i<length;i++){
            for(int j=0;j<rows;j++){
                for(int k=0;k<cols;k++){
                    vectors[index] = input.get(i)[j][k];
                    index++;
                }
            }
        }

        return vectors;
    }

    //converts matrix2vec;
    public List<double[][]> vec2matrix(double[] input, int length, int row, int col){
        int index =0;
        List<double[][]> mainout = new ArrayList<>();

        for(int i=0;i<length;i++){
            double[][] lst = new double[row][col];
            for(int j=0;j<row;j++){
                for(int k=0;k<col;k++){
                    lst[j][k] = input[index];
                    index++;
                }
            }
            mainout.add(lst);
        }

        return mainout;
    }

}
