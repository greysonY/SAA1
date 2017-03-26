package flymetomars.model;

import com.google.common.base.Objects;
import validator.Validator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yli on 10/03/15.
 */
public class Invitation extends SeriablizableEntity {
    private Mission mission;
    private Person creator;
    private Person recipient;

    private Date lastUpdated;
    private InvitationStatus status;

    private Validator validator;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invitation that = (Invitation) o;
        return Objects.equal(mission, that.mission) &&
                Objects.equal(creator, that.creator) &&
                Objects.equal(recipient, that.recipient);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mission, creator, recipient);
    }

    public enum InvitationStatus {
        SENT("sent"),
        CREATED("created"),
        ACCEPTED("accepted"),
        DECLINED("declined");


        private String name;

        private InvitationStatus(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }///
    }

    public Invitation() {
        this.mission = null;
        this.creator = null;
        this.recipient = null;
        this.lastUpdated = null;
        this.status = null;
        this.validator = new Validator();
    }

    public Mission getMission() {
        return mission;
    }


    public void setMission(Mission mission) {
        validator.checkForNullEmpty(mission);
        this.mission = mission;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        validator.checkForNullEmpty(creator);
        this.creator = creator;
    }

    public InvitationStatus getStatus() {
        return status;
    }


    public void setStatus(InvitationStatus status) {
        this.status = status;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        validator.checkForNullEmpty(lastUpdated);
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date dateTime = null;
        try {
            dateTime = df.parse(lastUpdated);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Date format should be dd-MM-yyyy");
        }
        this.lastUpdated = dateTime;
    }

    public Person getRecipient() {
        return recipient;
    }

    public void setRecipient(Person recipient) {
        validator.checkForNullEmpty(recipient);
        this.recipient = recipient;
    }
}
