public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        boolean bLove = false;
        if((flower1 % 2 == 1 && flower2 % 2 == 0) || (flower1 % 2 == 0 && flower2 % 2 == 1))
        {
            bLove = true;
        }
        return bLove;
    }
}
