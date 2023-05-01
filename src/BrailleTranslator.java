import java.util.Scanner;

public class BrailleTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine().toLowerCase();
        String brailleOutput = translateToBraille(inputText);
        System.out.println(brailleOutput);
    }

    private static String translateToBraille(String inputText) {
        String brailleOutput = "";
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);
            if (currentChar == ' ') {
                brailleOutput += " ";
                continue;
            }
            String brailleChar = getBrailleChar(currentChar);
            brailleOutput += brailleChar;
        }
        return brailleOutput;
    }

    private static String getBrailleChar(char c) {
        switch (c) {
            case 'a':
                return "⠁";
            case 'b':
                return "⠃";
            case 'c':
                return "⠉";
            case 'd':
                return "⠙";
            case 'e':
                return "⠑";
            case 'f':
                return "⠋";
            case 'g':
                return "⠛";
            case 'h':
                return "⠓";
            case 'i':
                return "⠊";
            case 'j':
                return "⠚";
            case 'k':
                return "⠅";
            case 'l':
                return "⠇";
            case 'm':
                return "⠍";
            case 'n':
                return "⠝";
            case 'o':
                return "⠕";
            case 'p':
                return "⠏";
            case 'q':
                return "⠟";
            case 'r':
                return "⠗";
            case 's':
                return "⠎";
            case 't':
                return "⠞";
            case 'u':
                return "⠥";
            case 'v':
                return "⠧";
            case 'w':
                return "⠺";
            case 'x':
                return "⠭";
            case 'y':
                return "⠽";
            case 'z':
                return "⠵";
            default:
                return "";
        }
    }
}

