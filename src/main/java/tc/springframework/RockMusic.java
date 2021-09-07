package tc.springframework;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    @Override
    public List<String> getSong() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Rock Song 1");
        stringList.add("Rock Song 2");
        stringList.add("Rock Song 3");
        return stringList;
    }
}
