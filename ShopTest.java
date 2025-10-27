import static org.junit.Assert.*;
import org.junit.Test;

public class ShopTest {

    // add your tests here 
    // setPrice
    @Test 
    public void testsetPrice() {
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        myComputer.setPrice(1200);
        assertEquals(1200, myComputer.price);

    }

    // setOS                    
    @Test
    public void testsetOS() {
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        myComputer.setOS("Windows 10"); 
        assertEquals("Windows 10", myComputer.operatingSystem); 


    }

    // getYear
    @Test
    public void testgetYear() {
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        int year = myComputer.getYear();
        assertEquals(2019, year);

    }

    // toString, not sure how to test this one, assertEquals(expected, myComputer.toString())
    // @Test
    // public void testtoString() {    
    //     Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);

    // Resale shop 
    @Test
    public void testResaleShop() {
        ResaleShop shop = new ResaleShop();
        assertNotNull(shop.inventory);
        assertEquals(1, shop.inventory.size());
    }

    // buy
    @Test
    public void testbuy() throws Exception {
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop shop = new ResaleShop();
        shop.buy(myComputer); 
        assertTrue(shop.inventory.contains(myComputer));
        assertEquals(2, shop.inventory.size());    
    }

    // sell
    @Test
    public void testsell() throws Exception {
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop shop = new ResaleShop();
        shop.sell(myComputer);  
        assertEquals(0, shop.inventory.size()); 
    }

    // printInventory, not sure about this one yet.
    // @Test
    // public void testprintInventory() {
    //     Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
    //     ResaleShop shop = new ResaleShop();
    //     shop.printInventory();
    // }

    // refurbish
    @Test
    public void testrefurbish() throws Exception{
        Computer myComputer = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop shop = new ResaleShop();
        shop.refurbish(myComputer, "Windows 10");
        assertEquals("Windows 10", myComputer.operatingSystem); 
    }



}
