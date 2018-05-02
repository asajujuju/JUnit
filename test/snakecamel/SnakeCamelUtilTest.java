package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@org.junit.Test
    public void snaketocamelの確認() {
   	 SnakeCamelUtil scu = new SnakeCamelUtil();
   	 String expected = "HotDog";
   	 String actual = scu.snakeToCamelcase("hot_dog");
   	 assertThat(actual, is(expected));
    }
     

}
