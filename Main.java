public class Main {

    public static void main(String[] args) {

        String[] quarters = {"Q1", "Q2", "Q3", "Q4"};

        int[] nike = {100, 88, 75, 65};
        int[] adidas = {150, 92, 45, 95};
        int[] reebok = {70, 103, 90, 175};

        
        System.out.println("ULTIMATE SHOE SALES");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-10s%-12s%-12s%-12s%n", "QUARTER", "NIKE", "ADIDAS", "REEBOK");
        System.out.println("--------------------------------------------------------------");

        
        for (int i = 0; i < quarters.length; i++) {
            System.out.printf("%-10s%-12d%-12d%-12d%n",
                    quarters[i], nike[i], adidas[i], reebok[i]);
        }

        System.out.println("--------------------------------------------------------------");

        
        int nikeTotal = total(nike);
        int adidasTotal = total(adidas);
        int reebokTotal = total(reebok);

        double nikeAverage = average(nike);
        double adidasAverage = average(adidas);
        double reebokAverage = average(reebok);

        int nikeMin = min(nike);
        int adidasMin = min(adidas);
        int reebokMin = min(reebok);

        int nikeMax = max(nike);
        int adidasMax = max(adidas);
        int reebokMax = max(reebok);

        
        System.out.printf("%-10s%-12d%-12d%-12d%n",
                "TOTAL:", nikeTotal, adidasTotal, reebokTotal);

        System.out.printf("%-10s%-12.1f%-12.1f%-12.1f%n",
                "AVERAGE:", nikeAverage, adidasAverage, reebokAverage);

        System.out.printf("%-10s%-12d%-12d%-12d%n",
                "MIN:", nikeMin, adidasMin, reebokMin);

        System.out.printf("%-10s%-12d%-12d%-12d%n",
                "MAX:", nikeMax, adidasMax, reebokMax);

        System.out.println("--------------------------------------------------------------");
    }

    
    public static int total(int[] sales) {
        int sum = 0;

        for (int value : sales) {
            sum += value;
        }

        return sum;
    }

    
    public static double average(int[] sales) {
        return (double) total(sales) / sales.length;
    }

    
    public static int min(int[] sales) {
        int minimum = sales[0];

        for (int value : sales) {
            if (value < minimum) {
                minimum = value;
            }
        }

        return minimum;
    }

    
    public static int max(int[] sales) {
        int maximum = sales[0];

        for (int value : sales) {
            if (value > maximum) {
                maximum = value;
            }
        }

        return maximum;
    }
}
