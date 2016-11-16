package it.polito.yutengfei.riif.code;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by yutengfei on 12/11/16.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        RIIF2Lexer lexer = new RIIF2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RIIF2Parser parser = new RIIF2Parser(tokens);
        ParseTree tree = parser.program(); // parse

        //ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        //walker.walk(null, tree); // initiate walk of tree with listener
        System.out.println(tree.toStringTree(parser));
    }
}

