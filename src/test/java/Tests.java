import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void productFibTest() {

        long[] longs1 = Kyu5.productFib(1);
        Assert.assertEquals(1, longs1[0]);
        Assert.assertEquals(1, longs1[1]);
        Assert.assertEquals(1, longs1[2]);

        long[] longs2 = Kyu5.productFib(13);
        Assert.assertEquals(3, longs2[0]);
        Assert.assertEquals(5, longs2[1]);
        Assert.assertEquals(0, longs2[2]);
    }
}
