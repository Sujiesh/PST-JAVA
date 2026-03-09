public static void matrixRotation(List<List<Integer>> matrix, int r) {

    int m = matrix.size();
    int n = matrix.get(0).size();
    int layers = Math.min(m, n) / 2;

    for (int layer = 0; layer < layers; layer++) {

        List<Integer> list = new ArrayList<>();

        int top = layer;
        int bottom = m - layer - 1;
        int left = layer;
        int right = n - layer - 1;

        // top row
        for (int j = left; j <= right; j++)
            list.add(matrix.get(top).get(j));

        // right column
        for (int i = top + 1; i <= bottom - 1; i++)
            list.add(matrix.get(i).get(right));

        // bottom row
        for (int j = right; j >= left; j--)
            list.add(matrix.get(bottom).get(j));

        // left column
        for (int i = bottom - 1; i >= top + 1; i--)
            list.add(matrix.get(i).get(left));

        int size = list.size();
        int rot = r % size;

        List<Integer> rotated = new ArrayList<>();

        for (int i = rot; i < size; i++)
            rotated.add(list.get(i));

        for (int i = 0; i < rot; i++)
            rotated.add(list.get(i));

        int index = 0;

        // top row
        for (int j = left; j <= right; j++)
            matrix.get(top).set(j, rotated.get(index++));

        // right column
        for (int i = top + 1; i <= bottom - 1; i++)
            matrix.get(i).set(right, rotated.get(index++));

        // bottom row
        for (int j = right; j >= left; j--)
            matrix.get(bottom).set(j, rotated.get(index++));

        // left column
        for (int i = bottom - 1; i >= top + 1; i--)
            matrix.get(i).set(left, rotated.get(index++));
    }

    // print result
    for (List<Integer> row : matrix) {
        for (int val : row) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}