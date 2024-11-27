package weekthree;

public class ArrayExercises {
    public static void main(String[] args) {

        double[][] temperatures = {
                {22.5, 25.0, 20.0},
                {24.0, 26.5, 21.5},
                {23.0, 27.0, 22.0},
                {23.0, 27.0, 22.0},
                {23.0, 27.0, 22.0},
        };
        System.out.println("The morning temperature of Day 1 is " + temperatures[0][0]);
        System.out.println("The afternoon temperature of Day 3 is " + temperatures[2][1]);


        for (int day = 0; day < temperatures.length; day++) {
            double sum = 0;
            double average;

            for (int timeOfDay = 0; timeOfDay < temperatures[day].length; timeOfDay++) { //
                sum += temperatures[day][timeOfDay];
            }
            average = sum / temperatures[day].length;
            System.out.println("The average temperature of day " + day + " is " + average);
        }
        getMaxTemperature(1, temperatures);
    }

    private static void getMaxTemperature(int day, double[][] temperatures) {
  /*      if (temperatures[(day - 1)][0] > temperatures[(day - 1)][1] && temperatures[(day - 1)][0] > temperatures[(day - 1)][2]) {
            System.out.println("The maximum temperature on day " + day + " is " + temperatures[(day - 1)][0]);
        } else if (temperatures[(day - 1)][1] > temperatures[(day - 1)][0] && temperatures[(day - 1)][0] > temperatures[(day - 1)][2]) {
            System.out.println("The maximum temperature on day " + day + " is " + temperatures[(day - 1)][1]);
        } else {
            System.out.println("The maximum temperature on day " + day + " is " + temperatures[(day - 1)][2]);
        }*/

        double maxTemp = Double.MIN_VALUE;
        for (double temp : temperatures[(day - 1)]) {
            if (temp > maxTemp) {
                maxTemp = temp;
            }
        }
        System.out.println("The maximum temperature on day " + day + " is " + maxTemp);

    }
}



