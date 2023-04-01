
/**
 * Tasks corresponding to the fifth kyu on Codewars
 * @author Vladislav Korobko
 */
public class Kyu5 {

    /**
     * https://www.codewars.com/kata/5541f58a944b85ce6d00006a
     * @param prod prod result
     * @return an array of two neighboring members of the Fibonacci series giving a result as close as possible to prod,
     * and 1 if their product is equal to prod, 0 otherwise
     */
    public static long[] productFib(long prod) {
        long i = 0;
        long j = 1;

        while (i * j < prod) {
            long tmp = i;
            i = j;
            j = j + tmp;
        }

        long k = i * j == prod ? 1 : 0;

        return new long[]{i, j, k};
    }
}
