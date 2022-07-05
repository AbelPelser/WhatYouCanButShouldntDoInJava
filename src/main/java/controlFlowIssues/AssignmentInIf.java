package controlFlowIssues;

public class AssignmentInIf {
    private static boolean areBooleansEqual(boolean a, boolean b) {
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areBooleansEqual(true, false));
    }
}
