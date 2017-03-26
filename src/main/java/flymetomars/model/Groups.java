package flymetomars.model;

import validator.Validator;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by greyson on 26/3/17.
 */
public class Groups extends SeriablizableEntity{
    private Set<Person> participantSet;
    private Mission signUpMission;
    private Validator validator;

    public Groups() {
        this.participantSet = new HashSet<Person>();
        this.signUpMission = null;
        this.validator = new Validator();
    }

    public Groups(Set<Person> participantSet, Mission signUpMission) {
        this.participantSet = participantSet;
        this.signUpMission = signUpMission;
        this.validator = new Validator();
    }

    public Set<Person> getParticipantSet() {
        return participantSet;
    }

    public void setParticipantSet(Set<Person> participantSet) {
        this.participantSet = participantSet;
    }

    public Mission getSignUpMission() {
        return signUpMission;
    }

    public void setSignUpMission(Mission signUpMission) {
        validator.checkForNullEmpty(signUpMission);
        this.signUpMission = signUpMission;
    }
}
