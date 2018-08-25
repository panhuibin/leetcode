package medium;

import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.print;
import static org.junit.Assert.*;

public class UniquePaths2Test {

    UniquePaths2 u = new UniquePaths2();

    @Test
    public void uniquePaths() {
        int pathSum = u.uniquePaths(10,10);
        System.out.println(pathSum);
    }
}