package DayOne;

public class PascalsTriangle {

    public static void main(String[] args) {

        for (int row = 0; row <= 9; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(pascal(col, row) + " ");
            }

            System.out.println("");
        }
    }

    private static int pascal(int column, int row) {

        int pascalsTriangleValue;

        if (column == 0 || column + 1 == row) {
            pascalsTriangleValue = 1;
        } else {
            pascalsTriangleValue = pascal(column - 1, row - 1) + pascal(column, row - 1);
        }
        return pascalsTriangleValue;
    }
}
