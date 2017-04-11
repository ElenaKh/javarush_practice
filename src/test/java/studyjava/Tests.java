package studyjava;

import org.junit.Test;

/**
 * Created by Elena on 4/11/2017.
 */
public class Tests extends TestBase {

    @Test
    public void test1(){

        mainPage.open();
        mainPage.choseMenuBtn("Топики");
    }

}
