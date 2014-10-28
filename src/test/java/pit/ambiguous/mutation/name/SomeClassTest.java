package pit.ambiguous.mutation.name;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SomeClassTest {
    @Test
    public void testForNull() throws Exception {
        assertThat(new SomeClass().someMethod(null), is(false));
    }
}
