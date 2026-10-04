import static org.junit.jupiter.api.Assertions.assertEquals;

import jakarta.ws.rs.ApplicationPath;
import org.junit.jupiter.api.Test;

class MyApplicationPathTest {

    @Test
    void applicationPathShouldMatchMvcRoute() {
        ApplicationPath applicationPath = MyApplication.class.getAnnotation(ApplicationPath.class);
        assertEquals("/mvc", applicationPath.value());
    }
}
