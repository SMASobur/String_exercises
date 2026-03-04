package se.lexicon;



public class Main {
    static void main() {
        // Exercise 1 – Length of a String
        lenthCalculation("Java");
        // Exercise 2 – Character at Index
        charIndex("Long example sentence");
        // Exercise 3 – Index Position of 'o'
        indexPosition("Even longer example sentence");
        // Exercise 4 – Substring
        substring("Ok this is not as long!");
        // Exercise 5 – Lowercase and Uppercase
        lowerUppercase ("CAPS EQUALS SCREAMING");
        // Exercise 6 – Trim String
        trimString("\tJ\ta\tv\ta\t");
        // Exercise 7 – Parse to String
        paseString(20);
        // Exercise 8 – Split String (Oil and Water)
        splitString("Oil and Water");
        // Exercise 9 – Split String (Names)
        splitStringName("Carl,Susie,Fredrick,Bob,Erik");
        // Exercise 10 – Convert to Char Array
        charArray("ThisShouldBeConverted");
        // Exercise 11 – Convert Char Array to String
        charToString(new char[] {'J', 'a', 'v', 'a'});
    }

    // What is the length of the String: "Java"?
    public static void lenthCalculation(String text){
        int result = text.length();
        System.out.println(result);
    }

    //What char is at index position 6 in the following String: "Long example sentence"?
    public static void charIndex(String text){
        char result = text.charAt(6);
        System.out.println(result);
    }

    //What is the index position of 'o' in the following String: "Even longer example sentence"?
    public static void indexPosition(String text){
        int result =text.indexOf('o');
    }

    //Given the following String: "Ok this is not as long!", create a substring of only "not as long" (excluding the exclamation point) and pri
    public static void substring(String text){
        String result = text.substring(11,22);
        System.out.println(result);
    }

    //Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out. Then convert it back to uppercase and print it out again.
    public static void lowerUppercase(String text){
        String resultLower = text.toLowerCase();
        System.out.println(resultLower);
        String resultUpper =resultLower.toUpperCase();
        System.out.println(resultUpper);
    }

    //What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?
    public static void trimString(String text){
        String result = text.trim();
        System.out.println(result);
    }

    //Parse the following int: 20 to a String and add a 20 to the end of the String. Printing it out should return: "2020".
    public static void paseString (int number){
        String result = number+"20";
        System.out.println(result);
    }

    //Oil and water don't go well together. Given the String: "Oil and Water", split them up into the words "Oil", "Water" and store them in a String array.
    public static void splitString (String text){
        String[] result = text.split(" and ");
        System.out.println(result[0] +" "+ result[1]);
        //System.out.println(Arrays.toString(result));
    }

    //Split the following String: "Carl,Susie,Fredrick,Bob,Erik" into an array. Print out all names separately.
    public static void  splitStringName(String text){
        String[] names = text.split(",");
        for (String name:names){
            System.out.println(name);
        }
    }

    //Convert the following String: "ThisShouldBeConverted" to a char array. Iterate through the char array and print out each element.
    public static void charArray(String text){
        char[] alphabet = text.toCharArray();
        for (char alpha:alphabet){
            System.out.println(alpha);
        }
    }

    //Convert the following char[]: {'J','a','v','a'} to a String and print it out.
    public static void charToString(char[] data){
        System.out.println(data);
    }


}