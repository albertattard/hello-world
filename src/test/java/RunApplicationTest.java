import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class RunApplicationTest {

    @Test
    void shouldFinishWithExitValue0() throws IOException, InterruptedException {
        final ProcessBuilder builder = new ProcessBuilder("java", "-jar", "build/libs/hello-world-all.jar");
        final Process process = builder.start();

        final boolean finishedInTime = process.waitFor(1, TimeUnit.SECONDS);
        assertTrue(finishedInTime);

        final int exitValue = process.exitValue();
        assertEquals(0, exitValue);
    }
}
