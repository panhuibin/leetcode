package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePathsTest {

    UniquePaths u = new UniquePaths();

    @Test
    public void uniquePaths() throws Exception {
        int count = u.uniquePaths(3,2);
        assertEquals(count,6);
    }

}