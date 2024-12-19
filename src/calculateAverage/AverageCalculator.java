package calculateAverage;

//Task 4*. Average value of the array
class AverageCalculator {
    public static int calculateAverage(int[] a) {
        if (a.length == 0) return 0;

        int sum = 0;
        for (int num : a) {
            sum += num;
        }


        return (int) Math.round((double) sum / a.length);
    }
}
