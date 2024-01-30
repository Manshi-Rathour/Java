public class StringMethods {
    public static void main(String[] args) {
        String name = "Hello";
        //System.out.println(name);
        int value = name.length();
        //System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

        //String nonTrimmedString = "     Hello     ";
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString);

        //System.out.println(name.substring(1));
        //System.out.println(name.substring(1,5));

        //System.out.println(name.replace('o', 'O'));
        //System.out.println(name.replace("o", "oo"));

        //System.out.println(name.startsWith("He"));
        //System.out.println(name.endsWith("lk"));

        //System.out.println(name.charAt(2));

        //String modifiedName = "Hellollo";
        //System.out.println(modifiedName.indexOf("llo"));
        //System.out.println(modifiedName.indexOf("llo", 3));
        //System.out.println(modifiedName.lastIndexOf("o", 6));

        //System.out.println(name.equals("Hello"));
        System.out.println(name.equalsIgnoreCase("HeLLo"));

    }
}
