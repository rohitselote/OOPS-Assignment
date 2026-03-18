interface Filterable {
    void applyFilter(String filterType);
    void resetFilter();
}

abstract class ImageProcessor implements Filterable {

    @Override
    public void applyFilter(String filterType) {
        System.out.println("Applying " + filterType + " filter to image.");
    }

    @Override
    public void resetFilter() {
        System.out.println("Resetting image filters.");
    }
}


abstract class DataAnalyzer implements Filterable {

    @Override
    public void applyFilter(String filterType) {
        System.out.println("Applying " + filterType + " filter to dataset.");
    }

    @Override
    public void resetFilter() {
        System.out.println("Resetting data filters.");
    }
}

class PhotoEditor extends ImageProcessor {
    void enhanceImage() {
        System.out.println("Enhancing image quality.");
    }
}

class SalesAnalyzer extends DataAnalyzer {
    void analyzeData() {
        System.out.println("Analyzing sales data.");
    }
}

public class Main {
    public static void main(String[] args) {

        PhotoEditor img = new PhotoEditor();
        SalesAnalyzer data = new SalesAnalyzer();

  
        img.applyFilter("Blur");
        img.enhanceImage();
        img.resetFilter();

        System.out.println();

     
        data.applyFilter("Outlier Removal");
        data.analyzeData();
        data.resetFilter();
    }
}
