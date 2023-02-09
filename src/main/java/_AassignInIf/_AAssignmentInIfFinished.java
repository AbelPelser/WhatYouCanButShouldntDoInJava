package _AassignInIf;


@SuppressWarnings("ALL")
public class _AAssignmentInIfFinished {
    private static boolean areBooleansEqual(boolean a, boolean b) {
        if (a = b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(areBooleansEqual(false, false));
    }
}
