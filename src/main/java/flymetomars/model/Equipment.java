package flymetomars.model;

import com.google.common.base.Objects;
import validator.Validator;

/**
 * @author Yuan-Fang Li
 * @version $Id: $
 */
public class Equipment {
    private String name;
    private int weight;
    private int volume;

    private Validator validator;
    /**
     * default constructor
     */
    public Equipment() {
        this.name = "";
        this.weight = 0;
        this.volume = 0;
        validator = new Validator();
    }

    public Equipment(String name, int weight, int volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validator.checkForNullEmpty(name);
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        validator.checkForNullEmpty(weight);
        validator.checkNumber(Integer.parseInt(weight));
        this.weight = Integer.parseInt(weight);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        validator.checkForNullEmpty(volume);
        validator.checkNumber(Integer.parseInt(volume));
        this.volume = Integer.parseInt(volume);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return weight == equipment.weight &&
                volume == equipment.volume &&
                Objects.equal(name, equipment.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, weight, volume);
    }
}
