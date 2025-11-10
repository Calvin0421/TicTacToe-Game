public class GameUtils {
    public static boolean isInBounds(int r, int c) {
        return r >= 0 && r < 3 && c >= 0 && c < 3;
    }
}
