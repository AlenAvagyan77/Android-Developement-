public class String_Methods {

    public static void main(String[] args) {
        StringLengthExample("Android Development");
        ToUpperCaseExample("Android Development");
        ToLowerCaseExample("Android Development");
        CharAtExample("Android Development");
        SubstringExample("Android Development");
        EqualsExample("Android Development", "Android Development");
        IndexOfExample("Android Development");
        StartsWithExample("Android Development");
        EndsWithExample("Android Development");
        TrimExample("Android Development");

    }

    public static void StringLengthExample(String myString) {
        int length = myString.length();
        System.out.println(length);
    }

    public static void ToUpperCaseExample(String myString) {
        String upperCaseString = myString.toUpperCase();
        System.out.println(upperCaseString);

    }

    public static void ToLowerCaseExample(String myString) {
        String lowerCaseString = myString.toLowerCase();
        System.out.println(lowerCaseString);
    }

    public static void CharAtExample(String myString) {
        char charAtIndex = myString.charAt(8);
        System.out.println(charAtIndex);
    }

    public static void SubstringExample(String myString) {
        String subString = myString.substring(7, 12);
        System.out.println(subString);
    }

    public static void EqualsExample(String myString1, String myString2) {
        boolean isEqual = myString1.equals(myString2);
        System.out.println(isEqual);

    }

    public static void IndexOfExample(String myString) {
        int indexOfWorld = myString.indexOf(myString);
        System.out.println(indexOfWorld);

    }

    public static void StartsWithExample(String myString) {
        boolean endsWithWorld = myString.startsWith("Android");
        System.out.println(endsWithWorld);
    }

    public static void EndsWithExample(String myString) {
        boolean endsWithWorld = myString.endsWith("Development");
        System.out.println(endsWithWorld);

    }

    public static void TrimExample(String myString) {
        String trimmedString = myString.trim();
        System.out.println(trimmedString);

    }


}
