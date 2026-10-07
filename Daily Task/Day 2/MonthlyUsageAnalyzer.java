public class MonthlyUsageAnalyzer {

    static final int BASIC_LIMIT = 100;
    static final int PREMIUM_LIMIT = 200;

    public static void main(String[] args) {

        int[] monthlyUsage = {
            120, 150, 90, 200,
            175, 130, 160, 210,
            190, 145, 180, 220
        };

        int total = 0;
        int max = monthlyUsage[0];
        int min = monthlyUsage[0];

        for (int usage : monthlyUsage) {
            total += usage;

            if (usage > max) {
                max = usage;
            }

            if (usage < min) {
                min = usage;
            }
        }

        double average = (double) total / monthlyUsage.length;

        char grade = average <= BASIC_LIMIT ? 'A'
                   : average <= PREMIUM_LIMIT ? 'B'
                   : 'C';

        System.out.println("Monthly Usage Analyzer");
        System.out.println("----------------------");
        System.out.println("Total Usage: " + total);
        System.out.println("Average Usage: " + average);
        System.out.println("Maximum Usage: " + max);
        System.out.println("Minimum Usage: " + min);
        System.out.println("Grade: " + grade);

        long largeUsage = (long) Integer.MAX_VALUE + 1000L;
        System.out.println("Large Usage Value: " + largeUsage);

     
        int[][] houseUsage = {
            {120, 150, 90},
            {200, 175, 130},
            {160, 210, 190}
        };

        System.out.println("\nUsage of 3 Houses:");

        for (int house = 0; house < houseUsage.length; house++) {
            System.out.print("House " + (house + 1) + ": ");

            for (int month = 0; month < houseUsage[house].length; month++) {
                System.out.print(houseUsage[house][month] + " ");
            }

            System.out.println();
        }
    }
}
