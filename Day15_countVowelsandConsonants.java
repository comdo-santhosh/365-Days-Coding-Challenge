public class Day15_countVowelsandConsonants {
    public static void main(String[] args) {
        String name = "dsrysery436527%^@#*^#";

        int vowelcount = 0;
        int consonantcount = 0;
        int start = 0;
        int end = name.length();
        int Countnum = 0;
        int specialchar = 0;
        
        while (start < end) {
            char currentChar = name.charAt(start);

            if (currentChar == 'a' || currentChar == 'A' || currentChar == 'e' || currentChar == 'E'
                    || currentChar == 'i' || currentChar == 'I' || currentChar == 'o' || currentChar == 'O'
                    || currentChar == 'u' || currentChar == 'U') {
                vowelcount++;
            } else if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')) {
                consonantcount++;
            } else if (currentChar >= '0' && currentChar <= '9') {
                Countnum++;
            } else if ((currentChar >= 32 && currentChar <= 47) || (currentChar >= 58 && currentChar <= 64)
                    || (currentChar >= 91 && currentChar <= 96) || (currentChar >= 123 && currentChar <= 126)) {
                specialchar++;
            }

            start++;
        }

        System.out.println("Vowels Count = " + vowelcount + "\n" + "Consonants count = " + consonantcount);
        System.out.println("Numbers = " + Countnum);
        System.out.println("Special Character = " + specialchar);

        int tot = vowelcount + consonantcount;
        String istrue = (tot == name.length()) ? "Alphabets only available" : "Alphabets with Some Number or Special char";
        System.out.println(istrue);
    }
}
