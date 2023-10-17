package _231010_SetterGetter;

public class StringApiPart2 {
    public static void main(String[] args) {
        // Temp measurement from file
        String fromCsv = "45;45;23;12;56;34;12;46;89;34;12;35;67";

        int sum = 0;
        String[] measurements = fromCsv.split(";");
        for(String measurement : measurements){
            //System.out.println(measurement);
            int value = Integer.parseInt(measurement);
            sum += value;
            System.out.println(value);
            // your turn: calculate the arithmetic
            // middle of the measurements
        }
        // typecast (float)sum convert from int to float
        float middle = (float)sum / measurements.length;
        System.out.println(String.format("%.2f", middle));

        System.out.println("------------------------");
        String text001 = "hans";
        System.out.println(text001.length());
        System.out.println(text001.charAt(2)); // hans -> n
        String text002 = "";
        System.out.println(text002.length()); // -> 0
        System.out.println(text002.isEmpty()); // -> true

        String text003 = "Douglas Adams".toLowerCase();
        System.out.println(text003);
        text003 = text003.toUpperCase();
        System.out.println(text003);
    }
}
