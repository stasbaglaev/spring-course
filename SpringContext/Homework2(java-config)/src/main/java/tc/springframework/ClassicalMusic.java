package tc.springframework;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Classical Song";
    }
}