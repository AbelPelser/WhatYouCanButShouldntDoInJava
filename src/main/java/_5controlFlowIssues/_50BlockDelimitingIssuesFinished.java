package _5controlFlowIssues;

@SuppressWarnings("ALL")
public class _50BlockDelimitingIssuesFinished {
    private static void blockDelimiters(int i) {
        if (i == 5)
            System.out.println("i == 5");
            System.out.println("i == 5, really!");
            System.out.println("i == 5, confirmed.");
    }

    public static void main(String[] args) {
        blockDelimiters(6);
    }
}
