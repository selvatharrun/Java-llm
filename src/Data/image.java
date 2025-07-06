package Data;

public class image {
    double[][] data;
    int label;

    public int getLabel() {
        return label;
    }

    public double[][] getData() {
        return data;
    }

    public image(int label, double[][] data) {
        this.label = label;
        this.data = data;
    }
}
