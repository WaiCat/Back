package sb02.jcf.pr1.map;

import java.util.Objects;

public record Score(
        String scoreId,
        String name,
        Integer score
) {
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Score score)) return false;
        return Objects.equals(scoreId, score.scoreId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(scoreId);
    }
}
