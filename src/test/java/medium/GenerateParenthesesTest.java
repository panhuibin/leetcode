package medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GenerateParenthesesTest {
    GenerateParentheses g = new GenerateParentheses();

    @Test
    public void generateParentheses() throws Exception {
        List<String> l = g.generateParentheses(0);
        //l.stream().forEach(System.out::println);
        //l = g.generateParentheses(1);
        //l.stream().forEach(System.out::println);
        l = g.generateParentheses(2);
        l.stream().forEach(System.out::println);
        l = g.generateParentheses(3);
        l.stream().forEach(System.out::println);

    }



}