package tc.springframework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music{

    @Override
    public String getSong() {
        return "Classical Song";
    }
}
