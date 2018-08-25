package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePathsTest {

    UniquePaths u = new UniquePaths();

    @Test
    public void uniquePaths() throws Exception {
        int count = u.uniquePaths(3,2);
        assertEquals(count,3);
    }

    @Test
    public void uniquePaths1() throws Exception {
        int count = u.uniquePaths(7,3);
        assertEquals(count,28);
    }

    @Test
    public void uniquePaths2() throws Exception {
        int count = u.uniquePaths(1,1);
        assertEquals(count,1);
    }

    @Test
    public void uniquePaths3() throws Exception {
        int count = u.uniquePaths(10,10);
        assertEquals(count,48620);
    }
}