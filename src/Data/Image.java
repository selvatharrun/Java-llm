package Data;

public class Image {
    double[][] data;
    int label;

    public int getLabel() {
        return label;
    }

    public double[][] getData() {
        return data;
    }

    public Image(int label, double[][] data) {
        this.label = label;
        this.data = data;
    }

    @Override
    public String toString(){
        String s = label + "\n";

        for(int i=0;i<data.length;i++) {
            for (int j = 0; j <data[0].length; j++) {
                s += data[i][j] + ", ";
            }
            s += "\n";
        }
        return s;
    }

}
