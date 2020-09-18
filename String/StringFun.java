public class StringFun {
    public static void main(String[] args) {

        String phrase = "Hello World";

        int space = phrase.indexOf(' ');

        String secondWord = phrase.substring(space+1);
        System.out.println("The second word is: " + secondWord);

        String firstWord = phrase.substring(0,space);
        System.out.println("The first word is: " + firstWord);

        System.out.println("\n\n");

        String name = new String("Mickey Mouse");
        String loudName = name.toUpperCase();

        System.out.println("Original Name: " + name);
        System.out.println("Loud name: " + loudName);

        System.out.println("The original phrase is: " + phrase);
        phrase = phrase.toLowerCase();
        System.out.println("The original phrase (after conversion) is: " + phrase);

    }
    
}
