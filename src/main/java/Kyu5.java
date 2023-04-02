import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    /**
     * https://www.codewars.com/kata/5536a85b6ed4ee5a78000035
     * @param arrFriends array with friends
     * @param ftwns friends and towns
     * @param h towns with distances from granny
     * @return total tour distance
     */
    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
        List<String[]> filteredTowns = Arrays.stream(ftwns).filter(s -> Arrays.asList(arrFriends).contains(s[0])).collect(Collectors.toList());
        double tour = (h.get(filteredTowns.get(0)[1]) + h.get(filteredTowns.get(filteredTowns.size()-1)[1]));
        if (arrFriends.length > 1) {
            for (int i = 1; i < filteredTowns.size(); i++) {
                tour += Math.sqrt(Math.pow(h.get(filteredTowns.get(i)[1]), 2) - Math.pow(h.get(filteredTowns.get(i-1)[1]), 2));
            }
        }
        return (int)tour;
    }
}
