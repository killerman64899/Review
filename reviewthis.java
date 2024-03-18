public class main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal : Panama";
        String o = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                o = o + "a";
            } else if (s.charAt(i) == 'b') {
                o = o + "b";
            } else if (s.charAt(i) == 'c') {
                o = o + "c";
            } else if (s.charAt(i) == 'd') {
                o = o + "d";
            } else if (s.charAt(i) == 'e') {
                o = o + "e";
            } else if (s.charAt(i) == 'f') {
                o = o + "f";
            } else if (s.charAt(i) == 'g') {
                o = o + "g";
            } else if (s.charAt(i) == 'h') {
                o = o + "h";
            } else if (s.charAt(i) == 'i') {
                o = o + "i";
            } else if (s.charAt(i) == 'j') {
                o = o + "j";
            } else if (s.charAt(i) == 'k') {
                o = o + "k";
            } else if (s.charAt(i) == 'l') {
                o = o + "l";
            } else if (s.charAt(i) == 'm') {
                o = o + "m";
            } else if (s.charAt(i) == 'n') {
                o = o + "n";
            } else if (s.charAt(i) == 'o') {
                o = o + "o";
            } else if (s.charAt(i) == 'p') {
                o = o + "p";
            } else if (s.charAt(i) == 'q') {
                o = o + "q";
            } else if (s.charAt(i) == 'r') {
                o = o + "r";
            } else if (s.charAt(i) == 's') {
                o = o + "s";
            } else if (s.charAt(i) == 't') {
                o = o + "t";
            } else if (s.charAt(i) == 'u') {
                o = o + "u";
            } else if (s.charAt(i) == 'v') {
                o = o + "v";
            } else if (s.charAt(i) == 'x') {
                o = o + "x";
            } else if (s.charAt(i) == 'y') {
                o = o + "y";
            } else if (s.charAt(i) == 'z') {
                o = o + "z";
            } else if (s.charAt(i) == '1') {
                o = o + "1";
            } else if (s.charAt(i) == '2') {
                o = o + "2";
            } else if (s.charAt(i) == '3') {
                o = o + "3";
            } else if (s.charAt(i) == '4') {
                o = o + "4";
            } else if (s.charAt(i) == '5') {
                o = o + "5";
            } else if (s.charAt(i) == '6') {
                o = o + "6";
            } else if (s.charAt(i) == '7') {
                o = o + "7";
            } else if (s.charAt(i) == '8') {
                o = o + "8";
            } else if (s.charAt(i) == '9') {
                o = o + "9";
            } else if (s.charAt(i) == '0') {
                o = o + "0";
            }
        }
        int a = 0;
        System.out.println("Checking for palindrome...");
        if (o.charAt(0) == o.charAt(o.length() - 1)) {
            for (int j = 1; j < o.length(); j++) {
                if (o.charAt(j) == o.charAt(o.length() - j - 1)) {
                } else {
                    a = 1;
                    break;
                }
            }
        } else {
            a = 1;
        }
        if (a == 0) {
            System.out.println("This is a palindrome");
        } else if (a == 1) {
            System.out.println("This is not a palindrome");
        }
    }
}
