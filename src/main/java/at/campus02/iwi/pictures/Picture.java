package at.campus02.iwi.pictures;

public class Picture {
    int length;
    int width;

    public int totalPixels() {
        return length * width;
    }
    public int totalSize (int bytePerPixel) {
      return   totalPixels() *bytePerPixel;
    }
    public void scale (double faktor) {
        length*= faktor;
        width*= faktor;

    }
}
