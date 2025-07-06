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
}
