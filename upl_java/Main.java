package main;

public class Main {
    public static void main(String[] args) {
        // File Path
        String filePath = "C:\\Users\\PC\\Downloads\\Lexical_Analysis\\main\\main.upl";

        Lexer lexer = new Lexer();
        lexer.tokenize(filePath);
        // lexer.printTokens();

        Parser parser = new Parser(lexer.getTokensList());
        parser.parse();
    }

}