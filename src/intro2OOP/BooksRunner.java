package intro2OOP;

public class BooksRunner {
    public static void main(String[] args) {
        Books artOfComputerProgramming = new Books(30);
        Books effectiveJava = new Books(50);
        Books cleanCode = new Books(20);


        artOfComputerProgramming.increaseNoOfCopies(3);
        effectiveJava.increaseNoOfCopies(5);
        cleanCode.decreseNoOfCopies(5);

        System.out.println(artOfComputerProgramming.getNoOfCopies());
        System.out.println(effectiveJava.getNoOfCopies());
        System.out.println(cleanCode.getNoOfCopies());
    }
}
