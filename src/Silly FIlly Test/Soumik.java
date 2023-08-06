public class Soumik {
    public static String getTown(String[] peopleNames) {
    
        String firstString = peopleNames[0].toLowerCase(); 

        int minStringLength = firstString.length();

        for (String str : peopleNames) {
            minStringLength = Math.min(minStringLength, str.length());
        }

        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < minStringLength; i++) {
            char currentChar = firstString.charAt(i);
            for (int j = 1; j < peopleNames.length; j++) {
                if (Character.toLowerCase(peopleNames[j].charAt(i)) != currentChar) { 
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(currentChar);
        }

        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        String[] inputStrings = {"Rosewood", "rose", "rosy"};
 
        System.out.println("Common Prefix: " + getTown(inputStrings));
    }
}
