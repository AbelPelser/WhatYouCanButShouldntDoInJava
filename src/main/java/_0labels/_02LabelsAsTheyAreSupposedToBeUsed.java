package _0labels;

@SuppressWarnings("ALL")
public class _02LabelsAsTheyAreSupposedToBeUsed {
    private static void veryCleanCode(int[][][] matrix) {
        int counter = 0;
        outer: for (int[][] plane : matrix) {
            if (counter == 5) {
                counter++;
                continue;
            }
            middle: for (int[] row : plane) {
                if (counter == 7) {
                    counter++;
                    continue outer;
                } else if (counter == 9) break;
                inner: for (int value : row) {
                    counter++;
                    if (value == 0 || value == 3) counter++;
                    if (value == 9) break middle;
                    else if (value == 5) continue middle;
                    else if (value == 4) continue;
                    counter--;
                    continue middle;
                }
            }
        }
    }

    public static void main(String[] args) {
        veryCleanCode(new int[][][]{
                {
                        {1, 2, 3, 4, 5, 6},
                        {6, 5, 4, 3, 2, 1}
                },
                {
                        {6, 5, 4, 3, 2, 1},
                        {1, 2, 3, 4, 5, 6}
                }
        });
    }
}