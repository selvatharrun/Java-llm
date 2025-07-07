package Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class DataReader {
    private final int rows = 28;
    private final int cols = 28;

    public List<Image> readData(String path){

        List<Image> imglst = new ArrayList<>();

        try (BufferedReader br = new BufferedReader((new FileReader(path)))){
            String line;
            while((line = br.readLine()) != null){
                String[] chars = line.split(",");

                double[][] data = new double[rows][cols];

                int label= Integer.parseInt(chars[0]);
                int ind =1;

                for(int i=0;i<rows;i++) {
                    for (int j = 0; j < cols; j++) {
                        data[i][j] = (double) Integer.parseInt(chars[ind]);
                        ind++;
                    }
                }

                imglst.add(new Image(label,data));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return imglst;
    }


}
