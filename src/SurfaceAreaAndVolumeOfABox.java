public class SurfaceAreaAndVolumeOfABox {
    public static int[] getSize(int w,int h,int d) {
    int area = 2*(w*h) + 2*(w*d) + 2*(d*h);
    int volume = (w*h*d);
    //int[] myIntArray = new int[]{area, volume};
        return new int[]{area, volume};
    }
}