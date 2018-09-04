package medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordSearchTest {

    WordSearch w = new WordSearch();



    @Test
    public void exist() {
        char[][] board =   {{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        Assert.assertTrue(w.exist(board,"CCE"));
    }

    @Test
    public void exist1() {
        char[][] board =   {{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        Assert.assertTrue(w.exist(board,"ABCCED"));
    }

    @Test
    public void exist2() {
        char[][] board =   {{'A','B'}};
        Assert.assertTrue(w.exist(board,"BA"));
    }

    @Test
    public void exist3(){
        char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        Assert.assertTrue(w.exist(board,"AAB"));
    }

    @Test
    public void exist4(){
        char[][] board = {{'A','A'}};
        Assert.assertFalse(w.exist(board,"AAA"));
    }
}