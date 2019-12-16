import java.util.List;

public class Card {
    int rank;
    String color;

    @Override
    public String toString() {
        return String.format("[%s%d]",color,rank);
    }
}
