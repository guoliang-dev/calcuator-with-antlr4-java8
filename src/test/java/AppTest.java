import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    public void getName() {
        assertThat(new App().getName()).isEqualTo("Hello");
    }
}