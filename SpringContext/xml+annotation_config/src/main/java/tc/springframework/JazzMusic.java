package tc.springframework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "Jazz Song";
    }
}
