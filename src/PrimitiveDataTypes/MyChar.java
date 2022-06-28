package PrimitiveDataTypes;

public class MyChar {

    private char ch;

    MyChar(char ch){
        this.ch = ch;
    }

    public boolean isVowel() {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    public boolean isNumber() {
        if(ch >=48 && ch <=57){
            return true;
        }
        return false;
    }

    public boolean isAlphabet() {
        if(ch >=97 && ch <=122)  // btw 'a' - 'z'
            return true;
        if(ch>= 65 && ch<=90)  // btw 'A' - 'Z'
        return true;
        return false;
    }

    public boolean isConsonant() {
        if(isAlphabet() && !isVowel())
        return true;
        return false;
    }

    public static void printLowerCaseAlphbet() {
        for (char ch = 'a'; ch <= 'z'; ch++){
            System.out.println(ch);
        }
    }

    public static void printUpperCaseAlphabet() {
        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println(ch);
        }
    }
}

