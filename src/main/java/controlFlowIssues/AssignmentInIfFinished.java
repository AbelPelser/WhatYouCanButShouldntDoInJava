package controlFlowIssues;

public class AssignmentInIfFinished {
    private static boolean areBooleansEqual(boolean a, boolean b) {
        if(a = b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(areBooleansEqual(true, false));
    }
}
