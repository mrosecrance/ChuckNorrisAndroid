package m.chucknorris;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JokeClient {
    private Value value;

    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return value.toString();
    }
}
