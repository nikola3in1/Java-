import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

class CountLastNameTest {

    public CountLastNameTest() {
    }

    private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void revertStreams() {
        System.setOut(sysOut);
    }

    @Test
    public void testSuccessIsLogged() {
        final String[] names = {
                "Melinda Ann	Gates",
                "John Michael",
                "Bill Gates",
                "Michael Peterson",
                "George W Bush",
                "Rod Johnson",
                "Michael Johnson",
                "Mary Sue Gates"

        };
        CountLastName.main(null);

        assertThat(outContent.toString(), containsString("Gates 3\nJohnson 2"));
    }

}