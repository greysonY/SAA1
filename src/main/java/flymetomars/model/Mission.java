package flymetomars.model;

import com.google.common.base.Objects;
import validator.Validator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yli on 10/03/15.
 */
public class Mission extends SeriablizableEntity {
    private Date time;
    private String name;
    private Person captain;
    private String location;
    private String description;

    private int maxEquipmentVolume;
    private int maxEquipmentWeight;

    private Set<Equipment> equipmentsRequired;
    private Set<Person> participantSet;
    private Set<Invitation> invitationSet;

    private Validator validator;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mission mission = (Mission) o;
        return Objects.equal(time, mission.time) &&
                Objects.equal(name, mission.name) &&
                Objects.equal(location, mission.location) &&
                Objects.equal(description, mission.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(time, name, location, description);
    }



    public Mission() {
        this.time = null;
        this.name = "";
        this.captain = null;
        this.location = "";
        this.description = "";
        this.maxEquipmentVolume = 0;
        this.maxEquipmentWeight = 0;
        this.equipmentsRequired = new HashSet<Equipment>();
        this.participantSet = new HashSet<Person>();
        this.invitationSet = new HashSet<Invitation>();
        validator = new Validator();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        validator.checkForNullEmpty(name);
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(String time) {
        validator.checkForNullEmpty(time);
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date dateTime = null;
        try {
            dateTime = df.parse(time);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Date format should be dd-MM-yyyy");
        }
        this.time = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        validator.checkForNullEmpty(location);
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        validator.checkForNullEmpty(description);
        this.description = description;
    }

    public Set<Invitation> getInvitationSet() {
        return invitationSet;
    }

    public void setInvitationSet(Set<Invitation> invitationSet) {
        this.invitationSet = invitationSet;
    }

    public Set<Person> getParticipantSet() {
        return participantSet;
    }

    public void setParticipantSet(Set<Person> participantSet) {
        this.participantSet = participantSet;
    }

    public Person getCaptain() {
        return captain;
    }

    public void setCaptain(Person captain) {
        validator.checkForNullEmpty(captain);
        this.captain = captain;
    }

    public Set<Equipment> getEquipmentsRequired() {
        return equipmentsRequired;
    }

    public void setEquipmentsRequired(Set<Equipment> equipmentsRequired) {
        this.equipmentsRequired = equipmentsRequired;
    }

    public int getMaxEquipmentVolume() {
        return maxEquipmentVolume;
    }

    public void setMaxEquipmentVolume(String maxEquipmentVolume) {
        validator.checkForNullEmpty(maxEquipmentVolume);
        validator.checkNumber(Integer.parseInt(maxEquipmentVolume));
        this.maxEquipmentVolume = Integer.parseInt(maxEquipmentVolume);
    }

    public int getMaxEquipmentWeight() {
        return maxEquipmentWeight;
    }

    public void setMaxEquipmentWeight(String maxEquipmentWeight) {
        validator.checkForNullEmpty(maxEquipmentWeight);
        validator.checkNumber(Integer.parseInt(maxEquipmentWeight));
        this.maxEquipmentWeight = Integer.parseInt(maxEquipmentWeight);
    }
}
