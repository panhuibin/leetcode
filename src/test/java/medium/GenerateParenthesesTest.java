package medium;

import org.junit.Test;

import java.util.List;

public class GenerateParenthesesTest {
    GenerateParentheses g = new GenerateParentheses();

    @Test
    public void generateParentheses() throws Exception {
        List<String> l = g.generateParenthesis(0);
        //l.stream().forEach(System.out::println);
        //l = g.generateParentheses(1);
        //l.stream().forEach(System.out::println);
        l = g.generateParenthesis(2);
        l.stream().forEach(System.out::println);
        l = g.generateParenthesis(3);
        l.stream().forEach(System.out::println);

    }


}