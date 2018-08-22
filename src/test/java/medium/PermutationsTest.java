package medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PermutationsTest {
    Permutations p = new Permutations();

    @Test
    public void permute() throws Exception {
        int[] nums = {1,2,3};
        List<List<Integer>> permutes = p.permute(nums);
        permutes.stream().forEach(entry->{
            entry.forEach(System.out::print);
            System.out.print("\n");
        });
    }

}