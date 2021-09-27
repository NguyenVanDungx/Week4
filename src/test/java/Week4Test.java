import org.junit.Assert;
import org.junit.Test;

public class Week4Test {
    Week4 week4 = new Week4();
    int[] a1 = {1, 2, 3, 4, 5};
    int[] a2 = {4, 7, 2};
    int[] a3 = {3, 19};
    int[] a4 = {4, 19, 19};
    int[] a5 = {5, 11, 12, 14, 19, 14};
    @Test
    public void testMax2Int1(){
        Assert.assertEquals(week4.max2Int(1,2),2);
    }

    @Test
    public void testMax2Int2(){
        Assert.assertEquals(week4.max2Int(10,9),10);
    }

    @Test
    public void testMax2Int3(){
        Assert.assertEquals(week4.max2Int(1,100),100);
    }

    @Test
    public void testMax2Int4(){
        Assert.assertEquals(week4.max2Int(1,20),20);
    }

    @Test
    public void testMax2Int5(){
        Assert.assertEquals(week4.max2Int(20,2),20);
    }

    @Test
    public void testMinArray1(){
        Assert.assertEquals(week4.minArray(a1), 1);
    }

    @Test
    public void testMinArray2(){
        Assert.assertEquals(week4.minArray(a2), 2);
    }

    @Test
    public void testMinArray3(){
        Assert.assertEquals(week4.minArray(a3), 3);
    }

    @Test
    public void testMinArray4(){
        Assert.assertEquals(week4.minArray(a4), 4);
    }

    @Test
    public void testMinArray5(){
        Assert.assertEquals(week4.minArray(a5), 5);
    }

    @Test
    public void testCalculateBMI1(){
        Assert.assertEquals(week4.calculateBMI(60,1.7), "Bình thường");
    }

    @Test
    public void testCalculateBMI2(){
        Assert.assertEquals(week4.calculateBMI(66,1.7), "Bình thường");
    }

    @Test
    public void testCalculateBMI3(){
        Assert.assertEquals(week4.calculateBMI(70,1.7), "Thừa cân");
    }

    @Test
    public void testCalculateBMI4(){
        Assert.assertEquals(week4.calculateBMI(80,1.7), "Béo phì");
    }

    @Test
    public void testCalculateBMI5(){
        Assert.assertEquals(week4.calculateBMI(40,1.7), "Thiếu cân");
    }
}