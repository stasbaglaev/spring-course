package tc.springframework;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> stringList = new ArrayList<>();

    {
        stringList.add("Classical Song 1");
        stringList.add("Classical Song 2");
        stringList.add("Classical Song 3");
    }

    @Override
    public List<String> getSong() {
        return stringList;
    }
}
