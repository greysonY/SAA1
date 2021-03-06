package flymetomars.model;

import com.google.common.base.Objects;
import validator.Validator;

/**
 * Created by yli on 16/03/15.
 */
public class Expertise extends SeriablizableEntity {
    private String description;
    private Validator validator;
    private ExpertiseLevel level;//////////////////


    public enum ExpertiseLevel {

        AMATURE("amature"),
        JUNIOR("junior"),
        SENIOR("senior"),
        PROFESSIONAL("professional");

        private String name;

        private ExpertiseLevel(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expertise expertise = (Expertise) o;
        return Objects.equal(description, expertise.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }

    public Expertise() {
        description = new String();
        validator = new Validator();
    }

    public Expertise(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        validator.checkForNullEmpty(description);
        this.description = description;
    }

    public ExpertiseLevel getLevel() {
        return level;
    }

    public void setLevel(ExpertiseLevel level) {
        this.level = level;
    }
}
