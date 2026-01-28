package cmgh.portfolio_management.definitions;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.Duration;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DefaultResponseTimeout {
    public static final Duration timeout = Duration.ofSeconds(5);
}
