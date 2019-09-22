public class Main {
/**
 * Calculation of the number of wallpapers for a rectangular room
 * Dimensions are in meters
 */
    public static void main(String[] args) {
        float widthRoom = 5F;
        float lengthRoom = 6F;
        float heightRoom = 2.75F;
        float lengthWallpaper = 10F;
        float widthWallpaper = 1.06F;
        float stockLenghtWallpaper = 0.1F;
        int stripRoll = (int) ((lengthWallpaper * 100 / (heightRoom * 100 + stockLenghtWallpaper * 100)));
        System.out.println(stripRoll);
        int stripRoom =(int) (( 2 * (lengthRoom + widthRoom) * 100 / (widthWallpaper * 100)));
        System.out.println(stripRoom);
        float numberRoll = (float) stripRoom / stripRoll;
        System.out.println(numberRoll);
        if (numberRoll / ((int) numberRoll) > 1) {
            numberRoll = numberRoll + 1;
        }
        System.out.println((int) numberRoll);
        System.out.println("Не забудьте на запас взять еще 1 рулон");
}
}
