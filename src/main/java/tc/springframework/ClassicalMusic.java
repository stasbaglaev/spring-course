package tc.springframework;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music{

    @Override
    public List<String> getSong() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Classical Song 1");
        stringList.add("Classical Song 2");
        stringList.add("Classical Song 3");
        return stringList;
    }
}
