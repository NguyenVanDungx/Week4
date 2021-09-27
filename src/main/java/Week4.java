public class Week4 {
    /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if (a > b) return a;
        return b;
    }

    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int Min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (Min > arr[i]) Min = arr[i];
        }
        return Min;
    }

    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight / (height * height);
        BMI = (double)Math.round(BMI * 10.0) / 10.0;
        if (BMI < 18.5) return "Thiếu cân";
        if (BMI < 22.9) return "Bình thường";
        if (BMI < 24.9) return "Thừa cân";
        return "Béo phì";
    }
}

/**
 * dien bua vao thu commit git thoi
 */

