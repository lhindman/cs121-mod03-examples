public class WrapperFun {
    public static void main(String[] args) {

        
        /* Wrapper classes allow us to convert from a
         *  String object to a primitive data type */
        String userData;
        userData = "10";
        int userInt = Integer.parseInt(userData);
        System.out.println("The value of the int is: " + userInt);

        long userLong = Long.parseLong(userData);
        System.out.println("The value of the int is: " + userLong);

        userData = "3.141591234";
        double userDouble = Double.parseDouble(userData);
        System.out.println("The value of the double is: " + userDouble);

        userData = "true";
        boolean userBoolean = Boolean.parseBoolean(userData);
        System.out.println("The value of the boolean is: " + userBoolean);

        /* Wrapper classes allow us to convert from primitive
         *   data types to Strings */
        System.out.println("\n\n\n");

        int value = 10;
        String userString = Integer.toString(value);
        System.out.println("The converted int value is: " + userString);

        double dblValue = 31234.12341;
        userString = Double.toString(dblValue);
        System.out.println("The converted double value is: " + userString);



    }
}
