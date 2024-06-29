package ChessOpenings.Project.domain;

import java.io.Serializable;

public class CompositeKey implements Serializable {

    private Long ancestor;
    private Long descendant;

    // equals()와 hashCode() 메서드 구현
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompositeKey that = (CompositeKey) o;

        if (!ancestor.equals(that.ancestor)) return false;
        return descendant.equals(that.descendant);
    }

    @Override
    public int hashCode() {
        int result = ancestor.hashCode();
        result = 31 * result + descendant.hashCode();
        return result;
    }
}