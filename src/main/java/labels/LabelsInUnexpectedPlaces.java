package labels;

@SuppressWarnings({"UnusedLabel"})
public class LabelsInUnexpectedPlaces {
    private static void willThisCompile() {
        https://www.sogeti.com/
        System.out.println("Hello Sogeti!");
    }

    public static void main(String[] args) {
        willThisCompile();
    }
}