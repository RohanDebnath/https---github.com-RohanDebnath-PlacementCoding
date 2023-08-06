   String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        int check = 0;
        if (s1.length() != s2.length()) {
            check = 0;
        } else {
            char[] s1arr = s1.toLowerCase().toCharArray();
            char[] s2arr = s2.toLowerCase().toCharArray();
            Arrays.sort(s1arr);
            Arrays.sort(s2arr);
            if (Arrays.equals(s1arr, s2arr)) {
                check = 1;
            }
        }
        return check;